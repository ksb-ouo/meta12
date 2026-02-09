package back.exam05;

import java.util.Arrays;

public class Ex03 {

    public static void main(String[] args) {
        // int value1;
        // System.out.println(value1); // 기본 자료형은 자동으로 초기화가 되지 않음, error

        // int[] value2;
        // System.out.println(value2); // 배열 또한 마찬가지임, error

        // int value3 = 0;
        // System.out.println(value3); // 0

        // int[] value4 = null; // null: 값 자체가 없음
        // System.out.println(value4); // null

        boolean[] array1 = new boolean[3]; // 불린 자료형 3개를 가질 수 있는 배열을 제작
        // 불린 타입은 무조건 초깃값이 false // { false, false, false }

        for (int i = 0; i < array1.length; i++) {
            System.out.println(i + ". " + array1[i]);
        }

        System.out.println("-------------------------");

        int[] array2 = new int[3]; // int 자료형 3개를 가질 수 있는 배열을 제작
        // int 타입은 무조건 초깃값이 0 // { 0, 0, 0 }

        for (int i = 0; i < array1.length; i++) {
            System.out.println(i + ". " + array2[i]);
        }

        System.out.println("=> " + array2);
        System.out.println("==> " + Arrays.toString(array2));
    }

}
