package back.exam07.Ex02;

import java.util.Scanner;

public class SungjukExample {
    public static void main(String[] args) {

        // Sungjuk h = new Sungjuk(); // 'Sungjuk'이라는 class의 주소(설계도)를 h라는 변수에 담는다

        // 초깃값
        // System.out.println(h.name); // null
        // System.out.println(h.kor); // 0
        // System.out.println(h.mat); // 0
        // System.out.println(h.eng); // 0
        // System.out.println(h.tot); // 0
        // System.out.println(h.avg); // 0.0

        Scanner sc = new Scanner(System.in);

        System.out.println("이름: ");
        String name = sc.nextLine();

        System.out.println("국어: ");
        String kor_ = sc.nextLine();

        System.out.println("영어: ");
        String eng_ = sc.nextLine();

        System.out.println("수학: ");
        String mat_ = sc.nextLine();

        sc.close();

        int kor = Integer.parseInt(kor_); // 정수로 바꾸기
        int eng = Integer.parseInt(eng_);
        int mat = Integer.parseInt(mat_);

        int tot = kor + eng + mat; // 밑은 동일한 식을 세로로 길게 작성한 것
        // int tot = 0;
        // tot += kor;
        // tot += eng;
        // tot += mat;

        double avg = tot / 3.0;

        // -------------
        // -------------
        // -------------

        Sungjuk s1 = new Sungjuk();
        s1.name = name; // 현재 class의 변수들을 미리 설정한 변수에 담음
        s1.kor = kor; // 한 사람분의 정보를 담기 위함
        s1.eng = eng;
        s1.mat = mat;
        s1.tot = tot;
        s1.avg = avg;

        System.out.println(s1.name + ", " + s1.kor + ", " + s1.eng + ", " + s1.mat + ", " + s1.tot + ", " + s1.avg);

    }
}