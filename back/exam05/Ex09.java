package back.exam05;

public class Ex09 {

    public static void main(String[] args) {
        int[] array1 = new int[] { 3, 4, 5 };
        int[] array2 = array1;
        array2[0] = 7;
        System.out.println(array1[0]);
        System.out.println(array2[0]);

        System.out.println("--------------------");

        // 배열 안에 들어있는 값을 출력하는 방법

        // 1. 낱개로 하나씩 빼서 출력
        int[] array3 = { 90, 80, 70, 60, 50 };
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }

        System.out.println();

        // 2. for문을 사용하여 덩어리로 출력
        // for ( 낱개 값의 자료형과 변수 이름 : 큰 덩어리(전체 값이 들어가있는) ) { }
        for (int k : array3) {
            System.out.println(k);
        }

    }

}