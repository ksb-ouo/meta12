public class Ex18 {

    public static void main(String[] args) {
        String str1 = "Java Study";

        String str11 = str1.toUpperCase(); // 대문자로 바꿈
        System.out.println(str11);

        String str12 = str1.toLowerCase(); // 소문자로 바꿈
        System.out.println(str12);

        String str13 = str1.replace("Study", "공부"); // Study를 공부로 바꿈
        System.out.println(str13);

        String str14 = str1.substring(5, str1.length()); // 인덱스 5번(S)부터 끝(length)까지
        System.out.println(str14);

        System.out.println();
        System.out.println();
        System.out.println();

        // String str2 = "뉴욕/파리/시드니/멜버른/런던/모스크바";

        // int idx = str2.indexOf("/");
        // System.out.println("idx: " + idx); // 2

        // String city1 = str2.substring(0, idx); // idx를 기준으로 따로따로 담기
        // System.out.println("city1: " + city1); // 뉴욕

        // String temp = str2.substring(idx + 1); // "파리/시드니/멜버른/런던/모스크바"

        // idx = temp.indexOf("/");
        // System.out.println("idx: " + idx); // 2
        // String city2 = temp.substring(0, idx);
        // System.out.println("city2: " + city2); // 파리

        // ------
        // ------
        // ------

        String city1 = "", city2 = "", city3 = "", city4 = "", city5 = "", city6 = "";

        String temp = new String("뉴욕/파리/시드니/멜버른/런던/모스크바");
        System.out.println(temp);

        // ------

        int idx = temp.indexOf("/"); // 2
        city1 = temp.substring(0, idx); // 뉴욕

        // ------

        temp = temp.substring(idx + 1); // 파리/시드니/멜버른/런던/모스크바 로 temp값 바꿈
        // 위 코드가 계속 반복

        idx = temp.indexOf("/"); // 2
        city2 = temp.substring(0, idx); // 파리

        // ------

        temp = temp.substring(idx + 1); // 시드니/멜버른/런던/모스크바

        idx = temp.indexOf("/"); // 3
        city3 = temp.substring(0, idx); // 시드니

        // ------

        temp = temp.substring(idx + 1); // 멜버른/런던/모스크바

        idx = temp.indexOf("/"); // 3
        city4 = temp.substring(0, idx); // 멜버른

        // ------

        temp = temp.substring(idx + 1); // 런던/모스크바

        idx = temp.indexOf("/"); // 2
        city5 = temp.substring(0, idx); // 런던

        // ------

        temp = temp.substring(idx + 1); // 모스크바
        idx = temp.indexOf("/"); // -1, 해당 글자가 존재하지 않음

        if (idx == -1) {
            city6 = temp; // 모스크바
        }

        System.out.println(city1);
        System.out.println(city2);
        System.out.println(city3);
        System.out.println(city4);
        System.out.println(city5);
        System.out.println(city6);

    }

}
