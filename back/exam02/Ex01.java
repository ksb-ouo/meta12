package back.exam02;

public class Ex01 {

	public static void main(String[] args) {
		// 변수와 자료형

		// 변수는 값을 담는 그릇으로, 내가 만드는 것.
		// 자료형 변수

		// 변수의 선언 및 초기화
		byte num = 5;
		// byte num: 선언 / = 5;: 초기화
		// 숫자 5를 'num'이라는 그릇에 담는다.
		// 선언을 할 때는 자료형을 적어준다 (이후 초기화할 때에는 필요치 않음)

		System.out.println(num); // 출력

		num = 3;
		System.out.println(num);

		num = 100;
		System.out.println(num);

		num = 127;
		System.out.println(num);

		// num = 128;
		// System.out.println(num);
		// byte 안에는 127이 넘는 숫자가 들어가지 않음

		// 지정할 때마다 값이 달라짐

		byte num2;
		num2 = 20;
		System.out.println(num2);

		short s1 = 30;
		System.out.println(s1);

		s1 = 1000;
		System.out.println(s1);

		int i1 = 50000;
		System.out.println(i1);
	}

}
