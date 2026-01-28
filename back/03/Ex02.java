public class Ex02 {
    public static void main(String[] args) {

        // 비교 연산자
        // > >= < <= == !=

        int n1 = 7;
        int n2 = 8;
        System.out.println(n1 > n2); // false
        // 결과를 알려달라는 의미

        System.out.println(n1 >= n2); // false
        System.out.println(n1 < n2); // true
        System.out.println(n1 <= n2); // true
        System.out.println(n1 == n2); // false
        System.out.println(n1 != n2); // true

        System.out.println(n1 + 1 == n2); // true
        // 산술 연산자를 먼저 처리하고, 이후에 비교 연산자를 처리함 (연산자 우선순위)
        // n1 + 1인 8과 n2인 8을 비교

        System.out.println(n1 + 1 == n2 - 1); // false
        // 연산자가 여러 가지 들어 있을 경우, 연산자 종류를 기준으로 묶어야 함
        // ((n1 + 1) == (n2 - 1))

        // 'n1 > n2'에 대한 실행 결과를 변수에 담으려면?
        boolean result = n1 > n2;

        System.out.println(result);
    }
}