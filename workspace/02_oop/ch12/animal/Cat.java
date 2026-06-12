package ch12.animal;

public class Cat extends Animal{
    // 액체화 됨
    void liquefy(){
        System.out.println("유리병에 들어갑니다.");
    }

    void eat(){ // a.eat는 Cat의 eat를 사용함
        System.out.println("츄르릅 먹는다.");
    }

}
