package back.exam07.Ex05;

public class Test {
    // 필드 // = 전역변수
    int k;

    // 생성자

    // 메서드 (4가지 모양)
    // 메서드 호출 (메서드 안의 내용을 실행)
    // 안에서 선언된 변수는 지역변수
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
        int num1 = 5;
        int num2 = 7;
        int hab = num1 + num2;
        // System.out.println("hab: " + hab);
        // 리턴값이 존재하므로 위와 같은 방식으로 출력하도록 메소드 안에서 정하거나, 본 클래스 안에서 메소드 결과를 변수로 선언하여 변수를 출력하는
        // 방식 채용
        return hab; // 리턴(반환)값, 메소드 실행이 끝나면 해당 값을 내보냄
    }

    public int imsi_4(int a, int b) {
        int num1 = a;
        int num2 = b;
        int hab = num1 + num2;
        return hab;
    }

    // 추가 1
    public double imsi_5(double a, int b) {
        double num1 = a;
        int num2 = b;
        double hab = num1 + num2;
        return hab;
    }

    // 추가 2
    public void imsi_6() { // 반복해서 찍는 것도 메소드를 활용하여 실행 가능
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        System.out.println("6");
        System.out.println("7");
        System.out.println("8");
        System.out.println("9");
        System.out.println("10");
    }
}
