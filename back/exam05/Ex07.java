package back.exam05;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {
        // 입력: 국어, 영어, 수학, 과학, 역사 점수
        // 출력: 국어 영어 수학 과학 역사 총점 평균 점수

        /*
         * int[] jumsus = new int[5]; // { 0, 0, 0, 0, 0 }
         * Scanner sc = new Scanner(System.in); // Scanner는 키보드로 입력을 요할 때 사용
         * System.out.print("국어: ");
         * 
         * sc.nextLine(); // 키보드 입력을 문자열로 받도록 함 (입력 후 엔터키를 칠 때까지)
         * int kor = Integer.parseInt(kor_); // 문자열로 받은 입력값을 int로 치환
         * jumsus[0] = kor_; // 입력받은 값을 점수 배열의 첫 번째 값으로 지정
         * 
         * 다른 값들을 연이어 입력받고, 각각의 값을 배열의 값으로 배정
         * 
         * sc.close(); // Scanner를 닫음 (사용 종료)
         * 
         * 
         * 그러나 위의 과정은 코드가 너무 길다는 단점이 존재
         * 줄일 수 있는 방법을 강구할 것
         */

        Scanner sc = new Scanner(System.in);

        int[] num = new int[5];

        for (int i = 0; i < num.length; i++) { // 5과목 점수 입력
            System.out.println("점수를 입력하세요: ");
            String num_ = sc.nextLine();
            int nums = Integer.parseInt(num_);
            num[i] = nums;
        }

        sc.close();

        int sum = 0; // 총점

        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }

        double average = sum / 5.0; // 평균

        // 출력
        System.out.println("국어: " + num[0] + "점");
        System.out.println("영어: " + num[1] + "점");
        System.out.println("수학: " + num[2] + "점");
        System.out.println("과학: " + num[3] + "점");
        System.out.println("역사: " + num[4] + "점");
        System.out.println("총점: " + sum + "점");
        System.out.println("평균: " + average + "점");
    }

}
