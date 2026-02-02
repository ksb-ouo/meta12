public class Ex04 {

    public static void main(String[] args) {

        double[] array = new double[3]; // { 0.0, 0.0, 0.0 } (초깃값)

        System.out.println(array);
        System.out.println(array[0]); // 0.0
        System.out.println(array[1]); // 0.0
        System.out.println(array[2]); // 0.0

        array[0] = 99.0; // array 배열의 0번째 인덱스에 99.0을 담는다.
        array[1] = 88.0;
        array[2] = 77.0;

        System.out.println(array[0] + " / " + array[1] + " / " + array[2]);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

}