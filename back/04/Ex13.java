public class Ex13 {

    public static void main(String[] args) {
        // int num = 0, sum = 0;
        int num = 0;
        int sum = 0;

        while (sum < 100) {
            sum += num; // sum = sum + num
            num++; // num = num + 1
        }

        System.out.println((num - 1) + "까지의 합 = " + sum);

        /*
         * sum num
         * 0 0
         * 0 1
         * 1 2
         * 3 3
         * 6 4
         * 10 5
         * 15 6
         * 21 7
         * ...
         */

        /*
         * for문과 while문의 상호 변환
         * 
         * 
         * for(초기식; 조건식; 증감식) {
         * 실행 구문;
         * }
         * 
         * 
         * 초기식;
         * while(조건식) {
         * 실행 구문;
         * 증감식;
         * }
         * 
         * 
         * 아래는 예시입니다.
         */

        for (int a = 0; a < 10; a++) {
            System.out.println(a);
        }

        int a = 0;
        while (a < 10) {
            System.out.println(a);
            a++;
        }
    }
}