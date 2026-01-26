let password = "pass";  // 사용자 입력값
if (password.length < 8) {
    console.log("비밀번호는 최소 8자 이상이어야 합니다.");
} else {
    console.log("안전한 비밀번호입니다. 저장합니다.");
}


let userRole = "guset"  // 현재 접속자 권한
if (userRole !== 'admin') {
    console.log("관리자만 접속할 수 있습니다. 메인으로 이동합니다.");
} else {
    console.log("관리자 페이지에 접속했습니다.");
}


let fileSize = 7500;  // 단위: KB 
let limit = 5000;  // 제한: 5000KB (5MB)
if (fileSize > limit) {
    console.log("파일이 너무 큽니다. 5MB 이하만 가능합니다.");
} else {
    console.log("파일 업로드를 시작합니다...");
}


let number = 7;
if (number % 2 == 0) {
    console.log(number + "은(는) 짝수입니다.");
} else {
    console.log(number + "은(는) 홀수입니다.");
}


isDarkMode = true;  // 현재 상태: 켜짐
if (isDarkMode = true) {
    isDarkMode = false;  // 끔
    console.log("라이트 모드로 전환되었습니다.");
} else {
    isDarkMode = true;  // 켬
    console.log("다크 모드로 전환되었습니다.")
}


let networkSpeed = 15;  // 현재 속도 (Mbps)
if (networkSpeed >= 50) {
    console.log("화질 설정: 4K (초고화질)");
} else if (20 <= networkSpeed < 50) {
    console.log("화질 설정: 1080p (고화질)");
} else {
    console.log("화질 설정: 480p (데이터 절약)");
}


let damage = 100;
let critRate = 20;  // 20% 확률
let randomVal = Math.floor(Math.random() * 100) + 1;  // 1~100 랜덤 숫자
// 로직: 랜덤 숫자가 20 이하가 나올 확률은 20%임
if (randomVal <= 20) {
    damage = damage * 2
    console.log("크리티컬 히트! 데미지: " + damage);
} else {
    console.log("일반 공격. 데미지: " + damage);
}


let inputCode = "WELCOME2026";
let price = 20000;
if (inputCode = "WELCOME2026") {
    price = price * 0.9  // 10% 할인
    console.log("쿠폰 적용 완료! 할인된 가격: " + price + "원");
} else {
    console.log("존재하지 않는 쿠폰 코드입니다.");
}


let searchResults = [];  // 빈 배열 (검색된 게 없음)
if (searchResults.length = 0) {
    console.log("검색 결과가 없습니다.");
} else {
    console.log("총 " + searchResults.length + "건의 결과가 발견되었습니다.");
}


let day = "일요일";
// ||는 "또는(OR)" 을 의미합니다. 둘 중 하나만 참이어도 실행됩니다.
if (day == "토요일" || day == "일요일") {
    console.log("야호! 주말입니다.");
} else {
    console.log("평일입니다. 출근/등교 준비하세요.");
}


let score = 85;
if (score >= 90) {
    console.log("A학점 입니다.");
} else if (90 < score <= 80) {
    console.log("B학점 입니다.");
} else {
    console.log("C학점 입니다.");
}


let age = 70;
// 조건: 어린아이(8세 미만) 또는 노인(65세 이상)
if (age < 8 || age >= 65) {
    console.log("할인 대상입니다! 50% 할인됩니다.");
} else {
    console.log("일반 요금입니다.");
}


let Age = 15;
// 조건: 13보다 크거나 같고, '동시에', 19보다 작거나 같아야 함.
if (Age >= 13 && Age <= 19) {
    console.log("청소년입니다.");
} else {
    console.log("청소년이 아닙니다.");
}


let temp = 5;  // 현재 기온
if (temp >= 28) {
    console.log("덥습니다. 반팔을 입으세요.");
} else if (temp < 10) {
    console.log("춥습니다. 패딩을 입으세요.");
} else {
    console.log("선선합니다. 긴팔을 입으세요.");
}


let inputId = "user";
let inputPw = "1234";
// 조건: 아이디와 비밀번호가 둘 다 일치해야 함.
if (inputId == "user" && inputPw == "1234") {
    console.log("환영합니다! 로그인 성공.");
} else {
    console.log("아이디 또는 비밀번호가 틀렸습니다.");
}