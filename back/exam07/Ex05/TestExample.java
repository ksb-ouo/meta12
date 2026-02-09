package back.exam07.Ex05;

public class TestExample {

    public static void main(String[] args) {

        Test t1 = new Test();
        t1.imsi_1(); // t1 안에 있는, imsi_1 메소드를 호출
        t1.imsi_2(1, 2); // 메소드 호출 부분, 매개변수가 2개이기 때문에 넣어주지 않으면 error

        System.out.println();
        System.out.println();

        Test t2 = new Test();
        t2.imsi_1(); // t2 안에 있는, imsi_1 메소드를 호출
    }

}
