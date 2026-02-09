package back.exam03;

public class Ex01 {

    public static void main(String[] args) {

        // 산술 연산자

        int num1 = 5;
        int num2 = 3;
        System.out.println(num1 + num2); // 8
        System.out.println(num1 - num2); // 2
        System.out.println(num1 * num2); // 15
        System.out.println(num1 / num2); // 1 (정수 타입이기 때문에 몫만 산출)
        System.out.println(num1 % num2); // 2 (나머지)
        // 변수 2개, 산술 연산자 사용
        // 변수의 타입이 같지 않다면 큰 타입으로 적용되어 산출됨

        System.out.println("------------------------------");

        // 증감 연산자 ++ --

        int num3 = 2;
        num3++; // 본인의 것에 1을 더해서, 본인에게 다시 담아라. (num3의 값인 2에 1을 더하고, 다시 num3에게 담아라.)
        // num3 = num3 + 1;

        System.out.println(num3); // 3

        ++num3; // num3 = num3 + 1;
        System.out.println(num3); // 4

        System.out.println(num3++); // 4, num3 = 5
        System.out.println(num3); // 5

        System.out.println(++num3); // 6
        System.out.println(num3); // 6

        System.out.println(num3++); // 6
        System.out.println(num3); // 7

        System.out.println(++num3); // 8
        System.out.println(num3); // 8

        num3--;
        System.out.println(num3); // 7

        System.out.println(num3--); // 7
        System.out.println(num3); // 6

        System.out.println(--num3); // 5
        System.out.println(num3); // 5

    }
}