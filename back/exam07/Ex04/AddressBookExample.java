package back.exam07.Ex04;

import java.util.Scanner;

public class AddressBookExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("이름: ");
        String name = sc.nextLine();

        System.out.println("전화번호: ");
        String phone = sc.nextLine();

        System.out.println("주소: ");
        String address = sc.nextLine();

        sc.close();

        AddressBook addressBook1 = new AddressBook();
        addressBook1.name = name; // AddressBook의 name에 현재 입력받은 값을 저장한다.
        addressBook1.phone = phone; //
        addressBook1.address = address; //

        System.out.println(addressBook1); // 주소 출력
        System.out.println(addressBook1.name);
        System.out.println(addressBook1.phone);
        System.out.println(addressBook1.address);

        addressBook1.display();

    }

}
