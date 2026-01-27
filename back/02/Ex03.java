package exam02;

public class Ex03 {
	public static void main(String[] args) {
		// 타입 변환(형변환) : 강제형 변환(casting)
		// 값을 변수에 담을 때 형변환이 일어날 수 있음
		
		int v1 = (int) 3.54;    // 실수 값을 정수 타입인 int로 강제로 바꿈 (강제형 변환, casting)
		System.out.println(v1);
		
		long v2 = (long) 30;    // (자동형 변환, promotion)
		System.out.println(v2);
		
		long v3 = (long) 3.14f;
		System.out.println(v3);
		
		// int + int = int
		// int + long = long
		// long + float = float
		// float + float = float
		// float + double = double
		// 큰 것 + 작은 것 = 큰 것
		// 정수(소수점 X) + 실수(소수점 O) = 실수(소수점 O)
	}
}
