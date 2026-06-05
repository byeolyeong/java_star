package ch12.family.ex02;

public class Test {
    public static void main(String[] args){
//        Parent p = new Parent("부모");
//        Son p = new Son("아들");
        Daughter p = new Daughter("딸");

        dailySchedule(p);
    }

    // 하루 일과
    // Parent 타입의 매개 변수 정의.
    private static void dailySchedule(Parent p){    // 클래스는 타입으로 받을 수 있음, Parent 타입의 주소의 p라는 매개변수를 받는다.
        p.eat();
        p.play();
        p.sleep();
    }

    private static void dailySchedule(Son p){    // 클래스는 타입으로 받을 수 있음, Parent 타입의 주소의 p라는 매개변수를 받는다.
        p.eat();
        p.play();
        p.sleep();
    }

    private static void dailySchedule(Daughter p){    // 클래스는 타입으로 받을 수 있음, Parent 타입의 주소의 p라는 매개변수를 받는다.
        p.eat();
        p.play();
        p.sleep();
    }
}
