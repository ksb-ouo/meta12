package back.exam05;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        String info1 = "";
        String info2 = "";
        String info3 = "";

        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 사람 이름: ");
        info1 += sc.nextLine();

        System.out.print("첫 번째 사람 주민번호: ");
        info1 += "/" + sc.nextLine();

        System.out.print("첫 번째 사람 나이: ");
        info1 += "/" + sc.nextLine();

        System.out.print("첫 번째 사람 성별: ");
        info1 += "/" + sc.nextLine();

        System.out.print("두 번째 사람 이름: ");
        info2 += sc.nextLine();

        System.out.print("두 번째 사람 주민번호: ");
        info2 += "/" + sc.nextLine();

        System.out.print("두 번째 사람 나이: ");
        info2 += "/" + sc.nextLine();

        System.out.print("두 번째 사람 성별: ");
        info2 += "/" + sc.nextLine();

        System.out.print("세 번째 사람 이름: ");
        info3 += sc.nextLine();

        System.out.print("세 번째 사람 주민번호: ");
        info3 += "/" + sc.nextLine();

        System.out.print("세 번째 사람 나이: ");
        info3 += "/" + sc.nextLine();

        System.out.print("세 번째 사람 성별: ");
        info3 += "/" + sc.nextLine();

        sc.close();

        String[] infos1 = info1.split("/");
        String[] infos2 = info2.split("/");
        String[] infos3 = info3.split("/");

        System.out.printf("%s   %s   %s   %s", infos1[0], infos1[1], infos1[2], infos1[3]);
        System.out.println();
        System.out.printf("%s   %s   %s   %s", infos2[0], infos2[1], infos2[2], infos2[3]);
        System.out.println();
        System.out.printf("%s   %s   %s   %s", infos3[0], infos3[1], infos3[2], infos3[3]);
    }
}
