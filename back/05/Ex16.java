public class Ex16 {

    public static void main(String[] args) {
        String str1 = "Hello Java!";
        String str2 = "안녕하세요! 반갑습니다.";

        // System.out.println(str1.length()); // 11
        // System.out.println(str2.length()); // 13

        int str1Length = str1.length();
        int str2Length = str2.length();

        System.out.println(str1Length); // 11
        System.out.println(str2Length); // 13

        System.out.println();

        System.out.println(str1.charAt(1)); // charAt(), e. 해당 인덱스 위치의 글자를 출력

        char aaa = str1.charAt(1); // charAt()을 통한 것이므로 char (문자 한 자) 타입으로 변수를 지정해야 함
        System.out.println(aaa); // e

        String bbb = str1.substring(1, 2);
        System.out.println(bbb); // e

        char ccc = str2.charAt(1);
        System.out.println(ccc); // 녕

        String ddd = str2.substring(1, 2);
        System.out.println(ddd); // 녕

        System.out.println();

        System.out.println(str1.indexOf('a')); // 7 // a라는 글자가 몇 번째 인덱스에서 가장 처음 나왔는지 찾음 (왼쪽에서부터 세기)
        System.out.println(str1.lastIndexOf('a')); // 9 // a라는 글자가 몇 번째 인덱스에서 가장 마지막으로 나왔는지 찾음 (오른쪽에서부터 세기)

        System.out.println(str1.indexOf("Java")); // 6 // Java라는 글자가 몇 번째 인덱스에서 가장 처음 나왔는지 찾음
        System.out.println(str1.lastIndexOf("Java")); // 6 // Java라는 글자가 몇 번째 인덱스에서 가장 마지막으로 나왔는지 찾음

        System.out.println(str2.indexOf("하세요")); // 2
        System.out.println(str2.lastIndexOf("하세요")); // 2
    }

}