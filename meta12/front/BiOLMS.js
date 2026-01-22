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