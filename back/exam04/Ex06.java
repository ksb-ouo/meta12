package back.exam04;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        // 입력: Scanner 클래스 사용, 이름/국어/영어/수학점수
        // 출력: 이름 국어 영어 수학 총점 평균 등급

        /*
         * 등급조건
         * 1등급: 90점 이상
         * 2등급: 80점 이상
         * 3등급: 70점 이상
         * 4등급: 60점 이상
         * 5등급: 60점 미만
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("이름을 입력하세요: ");
        String name = scanner.nextLine();

        System.out.println("국어점수를 입력하세요: ");
        String kor_ = scanner.nextLine();

        System.out.println("영어점수를 입력하세요: ");
        String eng_ = scanner.nextLine();

        System.out.println("수학점수를 입력하세요: ");
        String mat_ = scanner.nextLine();

        int kor = Integer.parseInt(kor_);
        int eng = Integer.parseInt(eng_);
        int mat = Integer.parseInt(mat_);

        int total = kor + eng + mat;

        Double average = total / 3.0;

        String level = "";

        if (average >= 90) {
            level += "1등급";
        } else if (90 > average && average >= 80) {
            level += "2등급";
        } else if (80 > average && average >= 70) {
            level += "3등급";
        } else if (70 > average && average >= 60) {
            level += "4등급";
        } else {
            level += "5등급";
        }

        scanner.close();

        System.out.println(
                name + " / " + kor + " / " + eng + " / " + mat + " / " + total + " / " + average + " / " + level);
    }
}
