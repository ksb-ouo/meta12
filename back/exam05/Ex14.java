package back.exam05;

public class Ex14 {

    public static void main(String[] args) {
        String str1 = "Java"; // 값만을 넣음
        String str2 = str1; // str2에는 str1을 담음 (같은 주소)

        str1 = "Python";
        str1 = "C+";

        // String str5 = new String("Java"); // 배열이 아니기에 대괄호는 없음. 값과 함께 주소(new)도 기입

        System.out.println(str1); // C+
        System.out.println(str2); // Java

        // System.out.println(str5); // Java
        // String은 new를 사용했을 경우, sysout를 통해 내용물이 출력됨.
        // 배열의 경우와 다름. (new를 사용한 배열의 경우, sysout를 통해 주소가 출력됨.)

        // String str5 = new String("Java");
        // String str6 = new String("Python");

        // String ssn = "123456-1234567";
        // String imsiSSN = ssn;

        String str10 = "반갑"; // literal 값
        str10 += "습니다."; // str10 = str10 + "습니다."
        System.out.println(str10);
    }

}