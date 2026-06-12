package ch12.animal;

public class Dog extends Animal{    // Animal의 기능을 확장(상속) 받음
    void eat(){   // 이렇게 하면 상속은 받되, 오버라이딩 된 아래 텍스트가 출력이 됨.
        System.out.println("강아지가 먹는다.");
    }
    void bark(){
        System.out.println("멍멍 짖는다.");
    }
}
