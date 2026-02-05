public class Ex17 {

    public static void main(String[] args) {
        int k = 5;
        double m = 9.8;

        String n = String.valueOf(k);
        System.out.println("n: " + n);

        String p = String.valueOf(m);
        System.out.println("p: " + p);

        String q = String.valueOf(false);
        System.out.println("q: " + q);
        System.out.println("false: " + false);

        String r = 9 + ""; // 문자열에 기본 자료형을 더하면 문자열이 된다.
        System.out.println("r: " + r);

        String str1 = "안녕!";
        String str2 = "홍길동";

        String str3 = str1.concat(str2); // 두 string을 붙임 (최대 2개)
        System.out.println(str3);

    }

}