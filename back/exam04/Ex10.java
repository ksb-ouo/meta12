package back.exam04;

public class Ex10 {
    public static void main(String[] args) {
        // 반복문: while
        // 반드시 빠져나갈 조건부터 만들 것
        // 반복해야 하지만 언제 끝나야 할지 모를 때

        /*
         * 구조
         * 
         * while (조건) {
         * (조건이 참일 경우의) 실행문;
         * ..
         * }
         * (조건이 거짓일 경우 탈출)
         * 
         * 
         * while (true) {
         * if (조건) {
         * break; (멈추고 나가라는 의미, 항상 조건이 참이기 때문에 사용해야 함)
         * }
         * }
         */

        int i = 0;

        while (i <= 5) { // i가 5 보다 작거나 같을 경우,
            System.out.println("현재 값: " + i); // 조건이 참일 경우 반복 시행
            i++; // i = i + 1

            // int k = 1; // 변수를 while 문 안에 정의했을 경우, while 문 안에서만 사용 가능. 밖에서 사용 불가능.
        }
        // 0, 1, 2, 3, 4, 5, 6이 되면 while 문 탈출

        System.out.println("i의 값: " + i); // 6
        // System.out.println(k); // error!

    }
}
