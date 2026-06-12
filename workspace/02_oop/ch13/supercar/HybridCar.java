package ch13.supercar;

public class HybridCar extends SuperCar{
    // 컴파일러에 의해 기본 생성자가 만들어짐
//        GasolineCar() { super(); }

    HybridCar(int zero100){
        super(zero100);
    }

    @Override
    void move() {
        super.move();   // super. 를 이용해 부모클래스를 참조
        System.out.println("기름과 전기를 사용합니다.");
    }
}
