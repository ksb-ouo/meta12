package back.exam04;

public class Ex18 {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i == 1) {
                // break; // 반복문을 끝냄 (반복문을 빠져나감)
                continue; // 반복문의 처음으로 돌아감
            }
            System.out.println("i 값은 " + i + "입니다.");
        }
    }

}
