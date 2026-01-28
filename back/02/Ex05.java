public class Ex05 {

    public static void main(String[] args) {

        // 삼항 연산자 : 자료형 변수 = 조건 ? 참일 때의 값 : 거짓일 때 값;

        /*
         * if (조건) {
         * 참일 때의 값
         * } else {
         * 거짓일 때의 값
         * }
         */

        int k = 5;

        int a = (k > 3) ? 100 : 200;
        // a라는 변수를 int로 제작, 만약 주어진 조건이 참일 경우 100, 거짓일 경우 200

        System.out.println(a); // 100

        int value3 = 3;
        System.out.println(value3 % 2 == 0 ? "짝수" : "홀수");

    }

}
