package back.exam07.Ex08;

public class Example {

    public static void main(String[] args) {
        Dog dog1 = new Dog(); // 기본 생성자. Dog라는 매개변수가 없는 class(기본 생성자)를 이용하여 새로 만든다

        System.out.println(dog1); // 주소
        System.out.println(dog1.name); // null
        System.out.println(dog1.age); // 0

        dog1.name = "딸기";
        dog1.age = 3;

        System.out.println(dog1.name); // 딸기
        System.out.println(dog1.age); // 3

        Dog dog2 = new Dog();

        dog2.name = "주디";
        dog2.age = 4;

        System.out.println(dog2.name); // 주디
        System.out.println(dog2.age); // 4

        Dog dog3 = new Dog("초코", 5); // 초코 / 5

        System.out.println(dog3.name); // 초코
        System.out.println(dog3.age); // 5
    }

}
