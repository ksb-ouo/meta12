package back.exam04;

import java.util.Scanner;

public class Ex14 {

    public static void main(String[] args) {

        // 출력: 0부터 내가 적은 숫자까지 옆으로 나열 (ex. 9를 적었다면 0 1 2 3 4 5 6 7 8 9)

        Scanner sc = new Scanner(System.in);

        System.out.println("숫자를 입력하세요: ");
        String num_ = sc.nextLine();

        int num = Integer.parseInt(num_);

        sc.close();

        // 1. for 문 사용

        for (int i = 0; i <= num; i++) {
            System.out.print(i + " ");
        }

        System.out.println(" ");
        System.out.println("---------------------------------");

        // 2. while 문 사용

        int k = 0; // 시작값
        while (k <= num) {
            System.out.print(k + " ");
            k++;
        }
    }
}
