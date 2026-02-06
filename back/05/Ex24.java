import java.util.Scanner;

public class Ex24 {

    public static void main(String[] args) {
        // 입력: 이름, 주소

        Scanner sc = new Scanner(System.in);

        String info = "";

        while (true) {
            System.out.println("이름: ");
            String name = sc.nextLine();

            if (name.toLowerCase().equals("q")) {
                break;
            }

            System.out.println("주소: ");
            String addr = sc.nextLine();

            String temp = name + "," + addr;
            info = info + "/" + temp;
        }

        sc.close();
        info = info.substring(1); // 맨 앞의 "/"를 지우기 위함

        String[] array1 = info.split("/"); // "/"를 구분자로 사용해 배열 제작, string 사용

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i].replace(",", " ... ")); // 출력값만 바뀜 (변수 내에 저장된 값에 변화 X)
            // 배열은 for문 안에 인덱스를 적어 사용한다.

            // String[] array2 = array1[i].split(",");
            // for (int k = 0; k < array2.length; k++) {
            // System.out.println(array2[k] + "...");
        }
    }
}