package back.exam04;

public class Ex16 {
    public static void main(String[] args) {
        // do ~ while

        // while문: 조건에 맞지 않으면 빠져나감
        // do ~ while문: 무조건 한 번은 실행하고, 조건에 맞지 않으면 그 뒤 빠져나감

        int a;
        a = 0;

        while (a < 0) { // 실행 X
            System.out.print(a + " ");
            a++;
        }

        do { // 실행 O,
            System.out.print(a + " ");
            a++;
        } while (a < 0); // 이후 out

    }
}