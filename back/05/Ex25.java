import java.time.LocalDate;
import java.util.Scanner;

public class Ex25 {

    public static void main(String[] args) {
        // 입력: 이름, 주민번호
        // 출력: 이름, 주민번호, 나이, 성별 (나이와 성별은 주민번호를 통해 알 수 있음)

        Scanner sc = new Scanner(System.in);

        System.out.println("이름: ");
        String name = sc.nextLine();

        System.out.println("주민번호: ");
        String ssn = sc.nextLine();

        sc.close();

        String temp = ssn.substring(7, 8); // 주민번호에서 성별을 확인할 수 있는 숫자를 뽑음
        // System.out.println(temp); // 정확히 찍히는지 확인

        String gender = ""; // if문 밖에서 선언을 함

        if (temp.equals("1") || temp.equals("3")) {
            gender = "남자";
        } else {
            gender = "여자";
        }

        // System.out.println(gender); // 정확히 찍히는지 확인

        String temp2 = ssn.substring(0, 2); // 주민번호에서 나이를 확인할 수 있는 숫자를 뽑음

        int birthYear = Integer.parseInt(temp2); // 문자열인 temp2를 숫자인 int로 바꿈 (Integer.parseInt)

        if (temp.equals("1") || temp.equals("2")) { // 1900년대 출생자
            birthYear = 1900 + birthYear;
        } else { // 2000년대 출생자
            birthYear = 2000 + birthYear;
        }

        int year = LocalDate.now().getYear(); // 현재 년도
        int age = year - birthYear + 1; // 나이 = 현재 년도 - 출생년도 (한국 나이를 위한 + 1)

        System.out.println(name + "\t" + ssn + "\t" + age + "\t" + gender);

    }
}