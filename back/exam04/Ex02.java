package back.exam04;

public class Ex02 {

    public static void main(String[] args) {

        // 연산자의 우선순위 => 산술 > 비교 > 논리
        // if문은 비교, 논리 연산자만 사용함
        // 긴 조건문을 괄호로 묶어서 확인하는 버릇을 들일 것

        // 지하철 요금, 자녀가 3명 이상이면 무료 / 아니면 1550원

        int kids = 4;

        if (kids >= 3) {
            System.out.println("지하철 요금이 무료입니다.");
        } else {
            System.out.println("지하철 요금은 1,550원 입니다.");
        }

        // 자녀가 3명 이상이거나, 나이가 65세 이상이면 무료 / 아니면 1550원

        int age = 60;

        if (kids >= 3 || age >= 65) {
            System.out.println("지하철 요금이 무료입니다.");
        } else {
            System.out.println("지하철 요금은 1,550원 입니다.");
        }

    }

}
