package back.exam03;

public class Ex03 {

    public static void main(String[] args) {

        // 논리 연산자
        // &&(and) ||(or) !(not)

        // &&(and)
        // 둘 다 true여야 true

        // ||(or)
        // 둘 중 하나가 true여도 true

        int k1 = 5;
        int k2 = 7;
        double d1 = 3.5;
        double d2 = 5.7;

        System.out.println(k1 > k2 && 1 > d2); // false
        // 연산자가 여러 가지 섞여있기 때문에 우선순위를 따져야 함
        // ((k1 > k2) && (1 > d2))
        // (false && false)
        // false

        // 논리 연산자의 결괏값도 true, false가 나옴
        // 조건을 만들 때 사용하기 용이함
        // 변수에 담을 때에는 boolean을 사용

        System.out.println(k1 >= k2 && d1 < d2); // false
        System.out.println(k1 < k2 && d1 < d2); // true

        System.out.println(k1 + 3 < 2 && d1 < d2); // false
        // (((k1 + 3) < 2) && (d1 < d2))
        // ((8 < 2) && (d1 < d2))
        // (false && true)
        // false

        System.out.println(k1 == k2); // false
        System.out.println(k1 != k2); // true

        System.out.println(k1 >= k2 || d1 >= d2); // false
        // ((k1 >= k2) || (d1 >= d2))
        // (false || false)
        // false

        System.out.println(!(k1 == k2)); // true
        // !(false) => true

    }
}