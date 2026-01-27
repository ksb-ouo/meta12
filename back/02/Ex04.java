package exam02;

public class Ex04 {

	public static void main(String[] args) {
		
		int value1 = 3 + 5;   // 8
		System.out.println("value1: " + value1);

		int value2 = 8 / 5;   // 정수와 정수의 연산이므로 정수 취급. int
		System.out.println("value2: " + value2);   // 결과는 int기 때문에 나머지를 버리고 몫만 나옴
		
		float value3 = 3.0f + 5.0f;
		System.out.println("value3: " + value3);
		
		double value4 = 8.0 / 5.0;
		System.out.println("value4: " + value4);
		
		
		
		byte data1 = 3;
		byte data2 = 5;
		int value5 = data1 + data2;
		System.out.println(value5);
		
		
		
		double value6 = 5 + 3.5;  // 5는 int, 3.5는 double. 둘을 더하기 때문에 double (int보다 큼) 자료형을 사용해야 함
		System.out.println(value6);
		
		int value7 = 5 + (int) 3.5;  // 3.5를 int 취급하기에 int 자료형을 취급해야 함
		System.out.println(value7);
		
		
		double value8 = 5 / 2.0; 
		System.out.println("value8: " + value8);
		
		
		
		byte data3 = 3;
		short data4 = 5;
		// int value9 = data3 + data4;
		double value10 = data3 + data4;  // 자동 형변환 발생, 결괏값 8을 실수로 변환하기 때문에 8.0이 됨
		
		System.out.println(value10);
	}
}