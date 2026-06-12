package ch11;

public class PersonTest {

    void main(){
        Person p = new Person();
        p.name = "하루";
        p.age = 6;

        p.introduce();  // 메서드 호출
    }
}
