package back.exam04;

public class Ex07 {

    public static void main(String[] args) {

        // 조건문 : if switch
        // switch 는 반드시 break 를적어줘야한다. 그래야 종료하고 나감
        // 몇번째에 있든 조건이 맞는 부분만 바로 실행하고 나감

        int avg = 85;

        int result = avg / 10; // 85/ 10=8 (몫만, 나머지버림)

        System.out.println("result :" + result);
        // case "10"에 큰따옴표를 넣으면 문자열로 인식해서 타입이않맞아서 에러남

        switch (result) {
            case 10:

            case 9:
                System.out.println("1등급");
                break;

            case 8:
                System.out.println("2등급");
                break;

            case 7:
                System.out.println("3등급");
                break;

            case 6:
                System.out.println("4등급");
                break;

            default:
                System.out.println("5등급");
        }

        System.out.println("--프로그램 종료--");

    }
}