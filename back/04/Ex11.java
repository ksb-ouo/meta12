public class Ex11 {
    public static void main(String[] args) {

        /*
         * 예정 출력:
         * 
         * 10
         * 20
         * 30
         * 40
         * 50
         */

        int i = 10;

        while (i <= 50) {
            System.out.println(i);
            i = i + 10;
        }

        /*
         * while ( i <= 50 ) {
         * i = i + 10; // 해당 식이 앞에 나오면 앞의 식부터 처리하기 때문에 20부터 출력됨
         * System.out.println(i);
         * }
         */
    }
}
