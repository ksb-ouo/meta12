public class Ex10 {

    public static void main(String[] args) {
        // 2차원 배열 - 행과 열로 이루어진 배열

        // 2행 3열의 정수형 배열 생성
        int[][] nums = new int[2][3]; // 행 2개, 열 3개
        System.out.println(nums.length); // 2 // 배열의 길이는 행의 수만 알려준다.

        nums[0][0] = 10;
        nums[0][1] = 20;
        nums[0][2] = 30;

        nums[1][0] = 40;
        nums[1][1] = 50;
        nums[1][2] = 60;

        // = { {10, 20, 30}, {40, 50, 60} }

        System.out.println(nums[0][0]);
        System.out.println(nums[0][1]);
        System.out.println(nums[0][2]);

        System.out.println(nums[1][0]);
        System.out.println(nums[1][1]);
        System.out.println(nums[1][2]);
    }

}
