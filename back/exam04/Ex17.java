package back.exam04;

public class Ex17 {

    public static void main(String[] args) {

        // if문 안의 if문
        // if문 안에 전부 다 들어간다.

        int value1 = 5;
        int value2 = 3;

        if (value1 > 5) {
            if (value2 < 2) {
                System.out.println("실행1");
            } else {
                System.out.println("실행2");
            }
        } else {
            System.out.println("실행3");
        }

        System.out.println();
        System.out.println();
        System.out.println();

        // switch문
        // switch문 안에 반복문 등 전부 다 들어간다.

        int value3 = 2;
        switch (value3) {
            case 1:
                for (int k = 0; k < 10; k++) {
                    System.out.println(k + " ");
                }
                break;
            case 2:
                for (int k = 10; k > 0; k--) {
                    System.out.println(k + " ");
                }
                break;
        }

        System.out.println();
        System.out.println();
        System.out.println();

        // 중첩 if, 다중 for

        for (int i = 0; i < 3; i++) { // 3바퀴
            for (int j = 0; j < 5; j++) { // 5바퀴
                System.out.println(i + " " + j);
                if (i == j) {
                    System.out.println("i = j");
                }
            }
        }

    }
}