public class 설명 {
    public static void main(String[] args) {

        // 연산자

        // 산술: +, -, *, /, % (일상생활에서 쓰이는 사칙연산과 나누었을 때 몫, 나머지를 구하는 연산자를 포함)
        // '/'은 나누었을 때 몫을 구하는 연산자
        // '%'은 나누었을 때 나머지를 구하는 연산자

        // 비교(관계): >, >=, <, <=, ==, !=,
        // true, false
        // boolean

        // 논리: &&(and) ||(or) !(not) ^(xor)

        // 대입 (산술 연산 결과 대입)

        // 증감: ++(하나씩 더함) --(하나씩 뺌)
        // i++; 후위 연산자 (i에 1을 더해서 다시 i에 저장해라)
        // ++i; 전위 연산자

        int i = 5;
        // System.out.println(i++); // 5
        // System.out.println(++i); // 7

        i++; // 6
        System.out.println(i); // 6

        ++i; // 7
        System.out.println(i); // 7

        System.out.println(i++); // 7
        System.out.println(+i); // 8
        System.out.println(++i); // 9

        System.out.println(i++ + ++i); // 1 + 3 // 4

    }
}