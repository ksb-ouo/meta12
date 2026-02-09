package back.exam05;

import java.util.Scanner;

public class Ex23 {

    public static void main(String[] args) {
        // 입력: 이름, 국어, 영어, 수학 점수
        // 입력 종료: 이름이 q로 입력될 경우. (이외 정해지지 않은 종료 시점)

        System.out.println("이름과 함께 국어, 영어, 수학 점수를 입력해 주세요.");
        System.out.println("이름을 적는 칸에 q를 입력하면 프로그램이 종료됩니다.");
        System.out.println();

        Scanner sc = new Scanner(System.in);

        String info = ""; // 문자열을 만들어 공백을 줌

        while (true) { // while을 사용할 경우, 반복문을 빠져나갈 수 있는 조건을 가장 먼저 만들어야 함.
            System.out.println("이름: ");
            String name = sc.nextLine();

            // if (name.equals("q") || name.equals("Q")) {
            if (name.toLowerCase().equals("q")) { // 소문자로 바꾸었을 때 q인 경우 break --> Q, q 둘 다 포함
                                                  // 같은 이유로 name.toUpperCase().equals("Q") 또한 적용 가능
                break;
            }

            System.out.println("국어 점수: ");
            String kor = sc.nextLine();

            System.out.println("영어 점수: ");
            String eng = sc.nextLine();

            System.out.println("수학 점수: ");
            String mat = sc.nextLine();

            String temp = name + "," + kor + "," + eng + "," + mat; // 구분자 ","를 통해 한 사람분의 이름과 점수를 저장 (한 덩어리로 제작)

            // if (info == "") {
            // info = info + temp; // info에 아무것도 담겨있지 않을 경우, 맨 앞에 "/"가 붙지 않도록 temp만 추가
            // } else {

            info = info + "/" + temp; // 구분자 "/"를 통해 temp 덩어리를 구분 (사람을 구분)

            // }
        }

        sc.close();

        info = info.substring(1); // info.substring(1, info.length());
        // 위의 if문 대신 이런 식으로 처음 붙는 "/"를 제거 가능

        String[] array1 = info.split("/"); // {"aaa,aaa,aaa,aaa", "bbb,bbb,bbb,bbb", ......}

        for (int i = 0; i < array1.length; i++) {
            String[] array2 = array1[i].split(","); // {"aaa", "aaa", "aaa", "aaa"} {"bbb", .....
            System.out.printf("%s   %s   %s   %s", array2[0], array2[1], array2[2], array2[3]); // printf: 서식이 있는 출력문

        }

        System.out.println(info);
        System.out.println(" -- 프로그램 종료 -- ");

    }

}