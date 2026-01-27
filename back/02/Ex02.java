package exam02;

public class Ex02 {
	public static void main(String[] args) {
		// 변수의 이름
		// 변수를 사용하기 위해서는 선언 + 초기화가 필요
		
		float f1 = 10.14F;  // F: float type
		// 10.14는 소수점이 있기 때문에 double type이었지만,
		// F를 삽입함으로서 float으로 설정이 가능해졌다.
		System.out.println(f1);
		
		long l1 = 30L;  // int type
		// 30은 정수, int형임. int보다 long이 크기 때문에 int type을 long type에 담을 수 있다.
		System.out.println(l1);
		
		// 작은 그릇에 담기는 수는, 큰 그릇에도 담을 수 있음.
		// 그러나 큰 그릇에만 담기는 수는, 작은 그릇에 담을 수 없음.
		
		
		int age = 21;
		System.out.println(age);
		
		// 변수의 이름에는 영문자(대, 소문자), 한글, 밑줄(_), 달러($), 아라비아 숫자(첫 번째 X) 만 사용 가능하다.
		// 그러나 한글 이름은 사용하지 않는다.
		// 띄어쓰기는 불가능. 언더스코어(_)를 붙인다.
		// 자바에서 사용하는 예약어들은 사용할 수 없다.
		
		
		float f2 = 5.9f;
		System.out.println(f2);
		
		double d1 = 1.56;
		System.out.println(d1);
		
		char c1 = 'a';             // 문자 타입
		System.out.println(c1);
		
		boolean b1 = true;
		boolean b2 = false;        // 불리언 타입
		System.out.println("b1: " + b1);
		System.out.println("b2: " + b2);        // 문자열 + 문자열, 문자열 + 변수 = 하나의 문자열이, 글자가 됨 (결합)
		
	}
}
