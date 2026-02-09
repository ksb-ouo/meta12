package back.exam05;

public class Ex02 {

    public static void main(String[] args) {
        // 시험 점수 변수
        int kor = 90;
        int eng = 80;
        int mat = 70;
        int sci = 60;
        int his = 50;

        // 배열을 만드는 방법 (1). { 값1, 값2, 값3 }
        int[] jumsu1 = { kor, eng, mat, sci, his };
        System.out.println(jumsu1[0]);

        // 배열을 만드는 방법 (2). new 연산자를 사용 (주소가 필요)
        int[] jumsu2 = new int[5]; // 새로 만들어라(new), int type의 배열(int), 정수 5개를 담을 수 있는([5]) => 주소
        System.out.println(jumsu2 + " / " + jumsu2[0]);

        jumsu2[0] = kor;
        jumsu2[1] = eng;
        jumsu2[2] = mat;

        // System.out.println("jumsu2[0]: " + jumsu2[0]);
        // System.out.println("jumsu2[1]: " + jumsu2[1]);
        // System.out.println("jumsu2[2]: " + jumsu2[2]);
        // System.out.println("jumsu2[3]: " + jumsu2[3]);
        // System.out.println("jumsu2[4]: " + jumsu2[4]);

        for (int i = 0; i < jumsu2.length; i++) {
            System.out.println("jumsu2[" + i + "]: " + jumsu2[i]);
        }

        System.out.println("-----------------------------------");

        // 기본 자료형 이외 자료형으로 배열을 만드는 법
        String[] strs = new String[7]; // 문자열 7개를 담을 수 있는 배열을 만들어서, strs라는 이름으로 지칭한다.
        // System.out.println(strs + " / " + strs[0]); // 기본 자료형이 아니고, 선언되지 않은 배열이므로
        // null 상태

        System.out.println(strs[0]);
        System.out.println(strs[1]);
        System.out.println(strs[2]);
        System.out.println(strs[3]);
        System.out.println(strs[4]);
        System.out.println(strs[5]);

        strs[0] = "홍길동";
        System.out.println(strs[0]);
    }

}
