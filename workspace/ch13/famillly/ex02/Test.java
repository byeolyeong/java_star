package ch13.famillly.ex02;

public class Test {
    public static void main(String[] args){
        // 추상 클래스는 객체를 생성(new)할 수 없다.
//        Parent p = new Parent("부모");  // 부모는 직접 인스턴스를 생성해서 작동하지 않고, 자식 클래스에게 상속을 해줘서 작동을 함
//        Parent p = new Son("아들");   // up casting 자동 형변환(자식 타입 > 부모 타입)
        Daughter p = new Daughter("딸");

        dailySchedule(p);
    }

    // 하루 일과
    // Parent 타입의 매개 변수 정의.
    private static void dailySchedule(Parent p){    // 클래스는 타입으로 받을 수 있음, Parent 타입의 주소의 p라는 매개변수를 받는다.

        p.eat();
        p.play();

        p.study();

        p.sleep();
    }

//    private static void dailySchedule(Son p){    // 클래스는 타입으로 받을 수 있음, Parent 타입의 주소의 p라는 매개변수를 받는다.
//        p.work(); // private 메서드는 호출이 안됨.(호출하면 에러발생)
//        p.eat();
//        p.play();
//        p.sleep();
//    }
//
//    private static void dailySchedule(Daughter p){    // 클래스는 타입으로 받을 수 있음, Parent 타입의 주소의 p라는 매개변수를 받는다.
//        p.eat();
//        p.play();
//        p.sleep();
//    }
}
