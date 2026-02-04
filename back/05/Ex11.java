public class Ex11 {

    public static void main(String[] args) {
        // 2차원 배열 = 표(행, 열), 0부터 시작. [], [][]

        // new 연산자 - 주소가 생김

        int[] nums = new int[3];
        System.out.println(nums[0]); // 주소

        int[][] score = new int[3][4]; // { {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0} }

        int imsi = score[0][1]; // 배열의 값을 변수에 담는다
        System.out.println(imsi); // = score[0][1]

        System.out.println("배열의 길이: " + score.length); // 2차원 배열의 행을 보기 위함

        // 2차원 배열의 전체 값을 불러오는 for문
        for (int i = 0; i < score.length; i++) { // 행

            // System.out.println(score[i][0] + " / " + score[i][1] + " / " + score[i][2] +
            // " / " + score[i][3]);
            // 위는 아래 for문을 추가하여 대신할 수 있음

            for (int j = 0; j < score[i].length; j++) {
                System.out.println(i + ", " + j + " => " + score[i][j]);
            }
        }
    }

}