package ch13.supercar;

public class GasolineCar extends SuperCar{
    // 컴파일러에 의해 기본 생성자가 만들어짐
//        GasolineCar() { super(); }

    GasolineCar(int zero100){
        super(zero100);
    }

    @Override
    void move() {
        // 3
        super.move();   // super. 를 이용해 부모클래스를 참조
        // 5    (호출을 하고 실행을 했으니 리턴)
        System.out.println("기름을 사용합니다.");
    }
}
