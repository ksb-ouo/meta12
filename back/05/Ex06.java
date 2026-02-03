import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        // 정수 5개를 입력받아 그 합을 출력

        Scanner sc = new Scanner(System.in);

        int[] num = new int[5];

        for (int i = 0; i < num.length; i++) {
            System.out.println("숫자를 입력하세요: ");
            String num_ = sc.nextLine();
            int nums = Integer.parseInt(num_);
            num[i] = nums;
        }

        sc.close();

        int sum = 0;

        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }

        System.out.println(sum);
    }

}