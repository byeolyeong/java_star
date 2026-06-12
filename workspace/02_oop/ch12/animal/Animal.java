package ch12.animal;

public class Animal {
    void eat(){
        System.out.println("먹는다.");
    }
    void sleep(){
        System.out.println("잔다.");   // Dog 클래스에 sleep를 상속해줌
    }
    void move(){
        System.out.println("스스로 움직인다.");
    }
}
