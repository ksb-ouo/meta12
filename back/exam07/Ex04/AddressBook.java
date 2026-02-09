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

}
