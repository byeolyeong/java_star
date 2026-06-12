package ch13.famillly.ex01;

public class Test {
    public static void main(String[] args){
//        Parent p = new Parent("부모");
        Parent p = new Son("아들");   // up casting 자동 형변환(자식 타입 > 부모 타입)
//        Daughter p = new Daughter("딸");

        dailySchedule(p);
    }

    // 하루 일과
    // Parent 타입의 매개 변수 정의.
    private static void dailySchedule(Parent p){    // 클래스는 타입으로 받을 수 있음, Parent 타입의 주소의 p라는 매개변수를 받는다.

        p.eat();
        p.play();

        if(p instanceof Son){   // p가 Son 인스턴스인지 여부를 체크
            Son s = (Son) p;    // down casting 명시적 형변환(부모 타입 > 자식 타입)
            s.study();
        }

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
