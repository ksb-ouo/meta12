// [자바스크립트]

const toggleBtn = document.querySelector(".navbar-toggleBtn");
const menu = document.querySelector(".navbar-menu");
const icons = document.querySelector(".navbar-icons");

toggleBtn.addEventListener("click", (e) => {
    // 기본 동작(링크 이동) 방지
    e.preventDefault();
    menu.classList.toggle("active");
});



// 휠을 아래로 굴리면 다음 페이지로 넘어가고,
// 휠을 위로 굴리면 이전 페이지로 돌아가는 동작
// 모든 section(page)을 가져옴
const pages = document.querySelectorAll(".page");

let currentPage = 0;     // 현재 보고 있는 섹션 번호
let isScrolling = false; // 연속 스크롤 방지용

window.addEventListener("wheel", (e) => {
    // 스크롤 중이면 무시
    if (isScrolling) return;

    // 휠을 아래로 내렸을 때
    if (e.deltaY > 0) {
        if (currentPage < pages.length - 1) {
            currentPage++;
        }
    }
    // 휠을 위로 올렸을 때
    else {
        if (currentPage > 0) {
            currentPage--;
        }
    }

    isScrolling = true;

    // 해당 section으로 이동
    pages[currentPage].scrollIntoView({
        behavior: "smooth"
    });

    // 스크롤 잠금 해제 (0.8초 후)
    setTimeout(() => {
        isScrolling = false;
    }, 800);
});



// 이미지를 n초에 한 번씩 다음 이미지로 넘어가게 만드는 동작
const images = [
    "https://plus.unsplash.com/premium_photo-1676325101835-f2e4214eff5b?q=80&w=1171&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
    "https://plus.unsplash.com/premium_photo-1667516508065-6d49bc331259?q=80&w=1172&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
    "https://images.unsplash.com/photo-1486825586573-7131f7991bdd?q=80&w=687&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
];  // 이미지 목록 배열

// 필요한 요소들을 가져와 변수로 설정
const bigImg = document.querySelector(".home-Bigimg img");
const imgIcons = document.querySelectorAll(".Bigimg-icon .icon");
const homeBigImg = document.querySelector(".home-Bigimg");

let currentIndex = 0;  // 현재 이미지(페이지)의 번호


// 이미지(다음 이미지로 넘어감)와 아이콘(아이콘의 색)을 바꾸는 기능
function changeImage(index) {
    bigImg.src = images[index];

    imgIcons.forEach(icon => icon.classList.remove("active"));
    imgIcons[index].classList.add("active");
}

changeImage(0);


// 자동으로 3초에 한 번씩 넘어가게 만듦, 마우스를 가져가면 멈춤
let intervalId = setInterval(nextImage, 3000);

function nextImage() {
    currentIndex = (currentIndex + 1) % images.length;
    changeImage(currentIndex);
}

homeBigImg.addEventListener("mouseenter", () => {
    clearInterval(intervalId);
});

homeBigImg.addEventListener("mouseleave", () => {
    intervalId = setInterval(nextImage, 3000);
});


// 클릭 시 해당 위치의 이미지로 바로 넘어가게 만드는 부분 
imgIcons.forEach((icon, index) => {
    icon.addEventListener("click", () => {
        currentIndex = index;  // 몇 번째 아이콘을 눌렀는지, 해당 위치 이미지로 이동
        changeImage(currentIndex);  // 함수는 위에서 만들어뒀던 함수를 사용하여 바로 넘어가도록 만듦 
    });
});