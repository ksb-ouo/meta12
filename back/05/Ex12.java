public class Ex12 {

    public static void main(String[] args) {
        // int[][] score = new int[3][4];

        int[][] nums = { // 값을 부여하는 동시에 2차원 배열을 제작하는 법
                { 10, 20, 30 }, // 0행
                { 40, 50, 60 } // 1행
        }; // 0열 1열 2열

        System.out.println(nums[0][0]); // 10
        System.out.println(nums[0][1]); // 20
        System.out.println(nums[0][2]); // 30
        System.out.println(nums[1][0]); // 40
        System.out.println(nums[1][1]); // 50
        System.out.println(nums[1][2]); // 60

        // 전체 행, 열과 값을 함께 찍는 for문
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.println("nums[" + i + "][" + j + "] : " + nums[i][j]);
            }
        }
    }

}