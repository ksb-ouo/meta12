package back.exam07.Ex01;

public class 실행 {

    public static void main(String[] args) {
        // 식판 식판1 = new 식판(); // '식판'이라는 class의 주소(설계도)를 식판1이라는 변수에 담는다

        // new를 사용하여 만들면 물건이 만들어진다
        // 해당 물건을 '객체'라고 하며, 객체는 인스턴스와 같은 말

        식판 홍길동식판 = new 식판(); // 설계도의 이름이 변수의 그릇 이름이 됨
        식판 이성순식판 = new 식판();
        식판 장천용식판 = new 식판();

        System.out.println(홍길동식판.반찬1); // 아무것도 들어있지 않을 경우 초깃값인 null 출력
        System.out.println(홍길동식판.반찬2); // null
        System.out.println(홍길동식판.반찬3); // null
        System.out.println(홍길동식판.밥); // null
        System.out.println(홍길동식판.국); // null

        홍길동식판.반찬1 = "계란"; // 변수 그릇에 값을 담음
        홍길동식판.반찬2 = "오이무침";
        홍길동식판.반찬3 = "김치";
        홍길동식판.밥 = "오곡밥";
        홍길동식판.국 = "추어탕";

        System.out.println(홍길동식판.반찬1); // 계란
        System.out.println(홍길동식판.반찬2); // 오이무침
        System.out.println(홍길동식판.반찬3); // 김치
        System.out.println(홍길동식판.밥); // 오곡밥
        System.out.println(홍길동식판.국); // 추어탕

        홍길동식판.반찬1 = "콩나물";
        System.out.println(홍길동식판.반찬1); // 콩나물 (새로 담았기 때문에 변동)

        System.out.println(이성순식판.반찬1); // null
        System.out.println(이성순식판.반찬2); // null
        System.out.println(이성순식판.반찬3); // null
        System.out.println(이성순식판.밥); // null
        System.out.println(이성순식판.국); // null

        이성순식판.반찬1 = "고사리";
        이성순식판.반찬2 = "미나리";
        이성순식판.반찬3 = "산나물";
        이성순식판.밥 = "쌀밥";
        이성순식판.국 = "쇠고기국";

        System.out.println(이성순식판.반찬1); // 고사리
        System.out.println(이성순식판.반찬2); // 미나리
        System.out.println(이성순식판.반찬3); // 산나물
        System.out.println(이성순식판.밥); // 쌀밥
        System.out.println(이성순식판.국); // 쇠고기국

        System.out.println(장천용식판.반찬1); // null
        System.out.println(장천용식판.반찬2); // null
        System.out.println(장천용식판.반찬3); // null
        System.out.println(장천용식판.밥); // null
        System.out.println(장천용식판.국); // null

        장천용식판.반찬1 = "~~";
        장천용식판.반찬2 = "~~";
        장천용식판.반찬3 = "~~";
        장천용식판.밥 = "~~";
        장천용식판.국 = "~~";
    }

}
