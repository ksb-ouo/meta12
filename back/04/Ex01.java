public class Ex01 {

    public static void main(String[] args) {

        // 조건문: if, (switch)

        // 반복문: for, while, do ~ while

        // if (조건) {
        // 실행문
        // } else {
        // 실행문
        // }

        String gender = "남자"; // 성별
        int age = 16; // 나이

        if (age > 19) { // 조건의 실행 결과가 true 혹은 false (boolean type) 로 나와야 함, 비교/논리 연산자
            System.out.println("술 마셔도 됨");
        } else {
            System.out.println("술 마시면 안 됨");
        }

        if (age > 19 && gender == "남자") { // gender.equals("남자") 로 작성할 수도 있음
            System.out.println("성인 남성임");
        } else {
            System.out.println("성인 남성이 아님");
        }

        System.out.println("--프로그램 종료--");
    }

}
