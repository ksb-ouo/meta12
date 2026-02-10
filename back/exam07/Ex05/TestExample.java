package back.exam07.Ex05;

public class TestExample {

    public static void main(String[] args) {

        Test t1 = new Test();

        t1.imsi_1(); // t1 안에 있는, imsi_1 메소드를 호출

        t1.imsi_2(1, 2); // 메소드 호출 부분, 매개변수가 2개이기 때문에 넣어주지 않으면 error

        int hab = t1.imsi_3(); // 메소드 호출 부분(리턴값이 존재하므로, 메소드 안에서 sysout을 사용하여 출력하거나, 변수에 담아 출력해야 함)
        System.out.println("hab --> " + hab);
        // 리턴값이 존재하는 메소드의 결과에만 변수를 담을 수 있음
        // 리턴값이 존재하지 않는 메소드의 결과에 변수를 담으면 error (메소드의 결과로 나오는 리턴값이 없기 때문)

        System.out.println();
        System.out.println();

        Test t2 = new Test();
        t2.imsi_1(); // t2 안에 있는, imsi_1 메소드를 호출
    }

}
