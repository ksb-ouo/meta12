package back.exam01;

public class Test03 {
	public static void main(String[] args) {
		System.out.println("안녕하세요");
		System.out.println("안녕" + "하세요");
		System.out.println("오늘은 " + "춥네요."); // 띄어쓰기도 문자 한 칸 취급

		System.out.println("안녕하세요 홍길동님의 나이는 19세입니다.");
		System.out.println("안녕하세요 이성순님의 나이는 21세입니다.");
		System.out.println("안녕하세요 장천용님의 나이는 23세입니다.");
		// 서식이 없는 출력문으로 작성

		System.out.println("--------------------------------");

		System.out.printf("안녕하세요 %s님의 나이는 %s세입니다.\n", "홍길동", "19");
		System.out.printf("안녕하세요 %s님의 나이는 %s세입니다.\n", "이성순", "21");
		System.out.printf("안녕하세요 %s님의 나이는 %d세입니다. 신장은 %f입니다.\n", "장천용", 23, 190.5);
		// 서식이 있는 출력문으로 작성 (서식의 개수만큼 뒤에 값을 적어주어야 함)
		// \n (역슬래시+n) 줄바꿈 기능이 있음

	}
}

// 큰따옴표("")로 둘러싸여 있으면 문자 취급
// 문자: 글자 한 자, 문자열: 큰따옴표로 둘러싸인 것
// 문자열 + 문자열 = 문자열 결합(나열)

// 출력문: System.out.print(""); System.out.println(""); System.out.printf("");
// 서식이 없는 출력문: System.out.print("");
// 서식이 있는 출력문: System.out.printf(""); %s(문자열) %d(정수, 소수점 없음) %f(실수, 소수점 있음)

// 콘솔(모니터) - 출력 기기

// 소스파일
// 저장을 할 때(컴파일), 바이트 코드(.class)가 생성된다.

// 인터프리터: 통역(핑퐁하듯 한 마디를 하면 번역하기를 반복)
// 컴파일: 번역(통으로 한 방에 실행, 기계어로 번역 -> 바이트 코드)

// 자료형
// 연산자
// 조건문
// 반복문
// 함수
// 클래스
// ...

// 자료형

// 기본 자료형(8가지)
// - 정수: byte, short, int, long (기본적으로 int)
// - 실수: float, double (기본적으로 double)
// - 문자: char
// - 불리언(불린): boolean

// 참조 자료형
// - 나머지

// 정수, 실수 SIGNED
// 문자 UNSIGNED

// byte: 1byte = 8bit
// short: 2byte = 16bit
// int: 4byte = 32bit
// long: 8byte = 64bit
// (크기가 클수록 순서가 빠름)

// float: 4byte = 32bit
// double: 8byte = 64bit

// char: 반드시 작은 따옴표로 감싼 글자 1자. 'a', "a" ('ab'는 오류)

// boolean: true, false
