package back.exam05;

public class Ex15 {

    public static void main(String[] args) {
        String str = "   Welcome to My Site!   ";
        System.out.println(str);

        // str. // 메소드

        System.out.println(str.trim()); // trim, 문자열의 좌측과 우측의 공백을 제거

        System.out.println();
        System.out.println();

        String aaa = "          h o n g          ";

        System.out.println("[" + aaa + "]");
        System.out.println("[" + aaa.trim() + "]");

        System.out.println();
        System.out.println();

        System.out.println("3. " + str.toUpperCase()); // toUpperCase, 대문자로 바꿀 수 있는 것들을 전부 대문자로 바꿈
        System.out.println("4. " + str.toLowerCase()); // toLowerCase, 소문자로 바꿀 수 있는 것들을 전부 소문자로 바꿈

        System.out.println("5. " + str.contains("Site")); // contains, 괄호 안에 있는 것이 포함되어(들어) 있는지 확인, 대소문자를 가리기 때문에 유의할 것

        str = "Welcome to My Site 123 헤헤 !!!";
        System.out.println("6. " + str.substring(3, 7)); // substring, 전체 글자의 일부분을 자른다. (n, m) => (n번째 인덱스부터 (m - 1)번째
                                                         // 인덱스까지)
        System.out.println("7. " + str.substring(3));

        System.out.println("8. " + str.replace("헤헤", "ㅎㅎ")); // replace, (n, m) => n을 m으로 바꿔라
        System.out.println("9. " + str.replace(" 헤헤 !!!", ""));

        System.out.println();
        System.out.println();

        String jumsu = "90, 80, 70, 60, 50";

        // System.out.println(jumsu.substring(0, 2)); // 90

        // String kor_ = jumsu.substring(0, 2); // jumsu에서 0번째 인덱스 ~ 1번째 인덱스 (90) 을 추출해서
        // 변수 kor_ 에 넣음
        // int kor = Integer.parseInt(kor_); // 변수 kor_ 을 int로 바꾸어 다른 변수에 넣음
        // System.out.println("국어 점수: " + kor); // 출력

        // System.out.println(jumsu.indexOf(",")); // 2 // jumsu라는 string에서 ,는 2번째 인덱스에
        // 맨 처음 나옴 => 2로 출력
        // indexOf, 해당 글자(단어 등)가 어느 인덱스에서 나오는지 찾음

        // indexOf를 활용해 kor_를 다시 뽑기
        // String kor_ = jumsu.substring(0, jumsu.indexOf(","))

        String[] jumsus = jumsu.split(", "); // ,를 기준으로 배열을 제작 (, 가 구분자), {"90", "80", "70", "60", "50"}
        // split으로 배열을 제작하기 위해서는 공통된 구분자가 필요함

        String kor_ = jumsus[0];
        String eng_ = jumsus[1];
        String mat_ = jumsus[2];
        String sci_ = jumsus[3];
        String his_ = jumsus[4];

        int kor = Integer.parseInt(kor_);
        int eng = Integer.parseInt(eng_);
        int mat = Integer.parseInt(mat_);
        int sci = Integer.parseInt(sci_);
        int his = Integer.parseInt(his_);

        System.out.println("국어 점수: " + kor);
        System.out.println("영어 점수: " + eng);
        System.out.println("수학 점수: " + mat);
        System.out.println("과학 점수: " + sci);
        System.out.println("역사 점수: " + his);

    }

}
