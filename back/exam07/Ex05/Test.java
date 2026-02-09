package back.exam07.Ex05;

public class Test {
    // 필드

    // 생성자

    // 메서드 (4가지 모양)
    // 메서드 호출 (메서드 안의 내용을 실행)
    public void imsi_1() {
        int num1 = 5;
        int num2 = 7;
        System.out.println("합: " + (num1 + num2)); // "합: " 은 문자열이기 때문에 뒤의 연산자도 문자열 취급을 당하므로, 합계를 구하고 싶다면 소괄호로 묶어 우선순위를
                                                   // 두기
    }

    public void imsi_2(int a, int b) { // 위 경우와는 달리, 매개변수 a와 b에 어떤 수를 넣느냐에 따라 결과가 달라짐
        System.out.println("합: " + (a + b));
    }

    public int imsi_3() {
        return 0;
    }

    public int imsi_4(int a, int b) {
        return 0;
    }
}
