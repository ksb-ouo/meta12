package back.exam04;

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {
        // 숫자 하나를 입력받아, 그 숫자에서 1씩 더한 숫자 10개를 찍는 프로그램 제작

        Scanner sc = new Scanner(System.in); // 숫자를 입력받기 위한 scanner

        System.out.println("숫자를 입력하세요: ");
        String num_ = sc.nextLine();

        int num = Integer.parseInt(num_); // 문자열을 정수로 바꾼다.

        sc.close(); // 입력(Scanner) 종료

        // 1. for문 사용 (for (시작값; 종료할 조건; 증가치)
        // 시작과 끝의 시점을 알고 있을 때
        for (int number = num; number <= num + 10; number++) {
            System.out.println(number);
        }

        // 2. while문 사용
        int number = num; // 시작값을 위해 식을 미리 적어둔다.
        while (number <= num + 10) {
            System.out.println(number);
            number++;
        }

        // int endValue = number + 10 등으로 종료 시점을 변수로 따로 제작할 수도 있음.

    }
}