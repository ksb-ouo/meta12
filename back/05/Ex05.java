import java.util.Arrays;
import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        // 입력: 5명의 친구 이름
        // 출력: 5명의 친구 이름

        Scanner sc = new Scanner(System.in);

        String[] names = new String[5]; // 이름 5개를 담을 배열을 제작
        // 초깃값: { null, null, null, null, null }
        // { "홍길동", "이성순", "장천용", "김춘삼", "정원겸" }

        for (int i = 0; i < 5; i++) { // 해당 for문이 아래 5개의 이름을 입력받는 것과 같음. i는 인덱스(0, 1, 2, 3, 4)
            System.out.println("이름을 입력하세요: ");
            String name = sc.nextLine();
            names[i] = name; // 입력받은 name을 names의 i번째 인덱스에 넣는다.
        }

        // System.out.println("이름1: ");
        // String name1 = sc.nextLine();

        // System.out.println("이름2: ");
        // String name2 = sc.nextLine();

        // System.out.println("이름3: ");
        // String name3 = sc.nextLine();

        // System.out.println("이름4: ");
        // String name4 = sc.nextLine();

        // System.out.println("이름5: ");
        // String name5 = sc.nextLine();

        sc.close();

        System.out.println(names); // 주소 출력
        System.out.println(names.length); // 배열의 길이(크기) 출력
        System.out.println(Arrays.toString(names)); // 배열 안에 들어있는 것을 확인 가능

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // System.out.println(names[0]); // 인덱스 번호를 주어 해당 위치의 낱개 값이 무엇인지 출력
        // System.out.println(names[1]);
        // System.out.println(names[2]);
        // System.out.println(names[3]);
        // System.out.println(names[4]);

    }

}
