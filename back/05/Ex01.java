public class Ex01 {

    public static void main(String[] args) {

        // 80, 90, 70, 100, 85

        int num1 = 80;
        int num2 = 90;
        int num3 = 70;
        int num4 = 100;
        int num5 = 85;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);

        System.out.println("----------------------");

        int[] nums = { 80, 90, 70, 100, 85 }; // 배열 (자료형에 대괄호를 붙이고, 여러 변수를 중괄호로 묶음.)

        // 낱개의 값을 가져오기 위해서는 인덱스(위치) 값을 호출하면 됨
        System.out.println(nums[0]); // 80
        System.out.println(nums[1]); // 90
        System.out.println(nums[2]); // 70
        System.out.println(nums[3]); // 100
        System.out.println(nums[4]); // 85

        // 배열을 사용하면 변수의 개수가 줄어듦.

        System.out.println("배열의 길이: " + nums.length); // 배열의 길이(배열 안에 몇 개의 자료형이 들어있는지) 를 알 수 있음.

        for (int i = 0; i < nums.length; i++) { // 배열의 전체를 출력하는 방식
            System.out.println(i + " / " + nums[i]); // i를 인덱스 넘버로 사용하여 배열[] 안에 넣고 호출
        }
    }
}
