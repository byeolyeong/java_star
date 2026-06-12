package ch13.supercar;

public class ElectricCar extends SuperCar implements Chargeable{
    // 컴파일러에 의해 기본 생성자가 만들어짐
//        GasolineCar() { super(); }

    ElectricCar(int zero100){
        super(zero100);
    }

    @Override
    void move() {
        super.move();   // super. 를 이용해 부모클래스를 참조
        System.out.println("전기를 사용합니다.");
    }

    public void charge(){   // 인터페이스를 할때는
        System.out.println("전기를 충전합니다.");
    }
}
