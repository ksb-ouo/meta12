import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {
        // 입력: 국어, 영어, 수학, 과학, 역사 점수
        // 출력: 국어 영어 수학 과학 역사 총점 평균 점수

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

        System.out.println("국어: " + num[0] + "점");
        System.out.println("영어: " + num[1] + "점");
        System.out.println("수학: " + num[2] + "점");
        System.out.println("과학: " + num[3] + "점");
        System.out.println("역사: " + num[4] + "점");
        System.out.println("총점: " + sum + "점");
        System.out.println("평균: " + average + "점");

    }

}