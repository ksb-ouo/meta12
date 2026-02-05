import java.util.Scanner;

public class Ex20 {

    public static void main(String[] args) {
        // 입력: 이름, 주민번호, 나이, 성별
        // 변수 하나만 사용하여 각각 따로 출력되게 만들기

        Scanner sc = new Scanner(System.in);

        System.out.print("이름: ");
        String name = sc.nextLine();

        System.out.print("주민번호: ");
        String ssn = sc.nextLine();

        System.out.print("나이: ");
        String age = sc.nextLine();

        System.out.print("성별: ");
        String gender = sc.nextLine();

        sc.close();

        // System.out.printf("%s %s %s %s", name, ssn, age, gender);
        // = System.out.print(name + " " + ssn + " " + age + " " + gender);

        System.out.println(name + "\t" + ssn + "\t" + age + "\t" + gender); // "\t": tap
    }

}