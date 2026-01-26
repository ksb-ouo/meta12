let heading = document.querySelector('#heading');
heading.onclick = function () {
    heading.style.color = "red";
};

// document.querySelector("#heading").onclick = function () {
//     document.querySelector("#heading").style.color = "red";
// };
// 변수에 담아두는 것 = 이후 재사용 가능 등의 이점 
// 짧은 변수명을 사용함으로서 가독성을 높임


// alert("오늘은 자바스크립트 첫날");
// confirm("확인하기!");
document.write("<h1>어서오세요</h1>");


// 유저 입력창
let userName = prompt("이름을 입력하세요", "아무개");

// 콘솔창에 보이는 역할. 콘솔창은 개발자도구의 콘솔 탭에서 확인 가능, 오류를 확인하기 위해서 이런 log들을 자주 찍어봐야 함.
console.log(userName + "님, 환영합니다.");



// 'let'을 앞에 쓰는 것 / 쓰지 않는 것의 차이
// 하나의 변수를 선언하기 위해(해당 변수의 자리를 마련하기 위해) let을 사용한 이후, let 사용 없이 계속 사용 가능



// \'는 작은 따옴표 안에 들어가 있는 문장에서 작은 따옴표 모양을 구현하기 위해 사용함
console.log('I\'m studying Javascript.');


// 많은 자료를 관리하기 위해서 배열을 사용. 배열이름 [값1, 값2, 값3, ...]
let studentScore = [1, 2, 3, 4, 5];
let studentName = ['a', 'b', 'c', 'd', 'e'];