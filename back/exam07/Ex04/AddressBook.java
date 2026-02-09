package back.exam07.Ex04;

public class AddressBook {
    // 필드
    String name;
    String phone;
    String address;

    // 생성자

    // 메소드
    public void display() { // 메소드를 사용하여 반복 출력
        // String name // 메소드 안에서 선언된 변수는 메소드 안에서만 유효한 지역 변수로 작용
        System.out.println(name);
        System.out.println(phone);
        System.out.println(address);
    }

    // (자바 제어자) (리턴(반환)타입) (메서드명) (입력매개변수) {
    // // 메서드 내용
    // }

    // 리턴 타입 목록
    // void: 반환(리턴) 값이 없다
    // int: 정수 타입으로 내보냄
    // double: 실수 타입으로 내보냄
    // String: 문자열 타입으로...

}
