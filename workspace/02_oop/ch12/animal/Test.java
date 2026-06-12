package ch12.animal;

public class Test {
    public static void main(String[] args){
        Dog haru = new Dog();
//        Animal haru = new Dog();    // 자식 인스턴스를 부모의 타입으로 선언 가능함(형변환(UpCasting))
        // 자식 인스턴스를 부모의 타입으로 자동 형변환이 됨.
//        haru.eat(); // 부모에게 물려 받은 메서드
//        haru.bark();    // 추가한 메서드    //
        animalCare(haru);   // 이렇게 형변환을 해도 가능함.

//          잘못된 상속(is a 관계가 성립하지 않는 경우)
//        Notebook book =  new Notebook();
//        animalCare(book);

        Cat c = new Cat();
        animalCare(c);
    }

    // 동물 관리 서비스
    static void animalCare(Animal a){
        // Animal.eat()를 호출하는 동일한 코드지만
        // 실제 생성된 객체의 오버라이딩 된 메서드가 호출됨
        // 이를 다형성이라고 함.
        // 과거의 코드로 미래의 코드를 호출될 수 있게 함.
        // Java언어의 특이점임.
        a.eat();
        a.move();
        a.sleep();
//        a.liquefy();
//        a.bark();
        // 다형성은 상속, 오버라이딩, 형변환(UpCasting)이 모두 있어야함
    }

    // 강아지 관리 서비스
//    static void animalCare(Dog a){
//        a.eat();
//        a.sleep();
//        a.move();
//        a.bark(); // Animal에 정의되어 있지 않음
//    }
//
//    //  고양이 관리 서비스
//    static void animalCare(Cat a){
//        a.eat();
//        a.move();
//        a.liquefy();    // Animal에 정의되어 있지 않음
//        a.sleep();
//    }
}
