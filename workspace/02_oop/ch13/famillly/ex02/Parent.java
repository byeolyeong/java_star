package ch13.famillly.ex02;

// 상속, 다형성, instanceof 사용 예제
// 추상 클래스(abstract)로 변경(미완성)

// 추상클래스
// 1. 추상 메서드가 하나라도 있으면 반드시 추상 클래스로 선언
// 2. 직접 개체 생성 불가(new가 안됨)

public abstract class Parent {  // abstract은 부모 클래스에도 지정해줘야함
    // 추상클래스에는 무조건 자식 클래스가 있음(추상클래스는 부모클래스임)
    String name;

    // 기본 생성자 : 컴파일러가 자동으로 만들어줌
//    Parent(){}

    // 생성자 : 클래스명과 동일한 이름, return, void 타입은 X
    Parent(String name){
        this.name = name;
    }

    void eat(){
        System.out.println(name + " : 음식을 맛있게 먹는다.");
    }

    void play(){
        System.out.println(name + " : 등산한다.");
    }

    void sleep(){
        System.out.println(name + " : 꿀잠을 잔다.");
    }

    // 부모 관점에서는 구현할 내용이 없음
    // 자식이 오버라이드해서 구현하기를 원함(강제로 오버라이드 하도록 지정)
    // 추상메서드(껍데기만 있고 알맹이가 없음)
    abstract void study();  // 내부구현 코드가 없음 ({}에 넣을 코드가 없음)
}
