package back.exam05;

import java.util.Scanner;

public class Ex21 {

    public static void main(String[] args) {
        String info = "";

        Scanner sc = new Scanner(System.in);

        System.out.print("이름: ");
        info += sc.nextLine();

        System.out.print("주민번호: ");
        info += "/" + sc.nextLine();

        System.out.print("나이: ");
        info += "/" + sc.nextLine();

        System.out.print("성별: ");
        info += "/" + sc.nextLine();

        // info 라는 변수 내에 누적해서 적음.
        sc.close();

        System.out.println(info);

        // 밑으로 하나하나 구분해서 출력하기 위한 코드 (배열과 구분자 / 활용)

        String[] infos = info.split("/"); // "/"를 구분자로 활용해 배열로 제작
        // System.out.println(infos); // 주소가 출력됨

        System.out.printf("%s   %s   %s   %s", infos[0], infos[1], infos[2], infos[3]);

    }

}
