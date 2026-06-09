package ch12.family.ex02;

// Son이 Parent의 필드와 메서드를 상속 받는다.
public class Son extends Parent {   // extends - 확장
    Son(String name){
        // String을 매개변수로 하는 생성자를 호출한다.
        super(name); // super() 부모의 생성자를 호출
    }

    // 오버라이딩(오버로딩 아님) : 상속받은 메서드를 재정의
    // 12번 라인에 있는 아이콘은 오버라이딩이 되었다는 아이콘임.
    void play(){    // Parent로 상속받은 메서드를 Son에서 재정의
        work();
        System.out.println(name + " : 게임을 한다.");
    }

    private void work(){
        System.out.println(name + " : 일한다.");
    }

    public void study(){
        System.out.println(name + " : 도서관에서 공부한다.");
    }
}
