package back.exam07.Ex08;

public class Dog {
    // 내용이 아무것도 없다면 주소가 담김

    String name;
    int age;

    // 생성자가 2개라면 객체를 만드는 방법이 2가지 존재
    public Dog() { // 기본 생성자

    }

    public Dog(String name_, int age_) { // 매개변수가 존재하는 생성자
        System.out.println(name_ + " / " + age_);

        name = name_;
        age = age_;

        // this.name = name_; // 매개변수로 들어온 name_을 필드에 있는 name으로 저장한다.
        // this.age = age_; // 매개변수로 들어온 age_를 필드에 있는 name으로 저장한다.
        // this. 은 필드에 있는 것을 가리킴 (헷갈리지 않도록 붙임)

        // super. 부모에게 있는 것
        // this. 필드에 있는 것
    }
}
