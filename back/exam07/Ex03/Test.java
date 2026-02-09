package back.exam07.Ex03;

class A { // 파일명과 다른 class명에는 public 표시가 붙지 않음

    boolean m1;
    int m2;
    double m3;
    String m4;

    void printFieldValue() {
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);
    }

    void printLocalVariable() {
        // int k;
        // System.out.println(k); // 값이 없기에 error
    }

}

public class Test { // 파일명과 같은 class (주 class) 에는 public 표시가 붙음

    public static void main(String[] args) {

        // 클래스를 활용해 객체 생성
        A a1 = new A();
        A a2 = new A(); // 각각 하나씩 할당

        // 출력 확인
        System.out.println(a1.m1 + ", " + a1.m2 + ", " + a1.m3 + ", " + a1.m4);
        System.out.println(a2.m1 + ", " + a2.m2 + ", " + a2.m3 + ", " + a2.m4);

        // 값을 넣어보기 (입력받고 싶다면 Scanner를 활용)
        a1.m1 = true;
        a1.m2 = 99;
        a1.m3 = 9.7;
        a1.m4 = "아무거나";
        System.out.println(a1.m1 + ", " + a1.m2 + ", " + a1.m3 + ", " + a1.m4); // 값의 변화 확인

        // class의 객체 활용
        a1.printFieldValue();
        a2.printFieldValue();

    }

}