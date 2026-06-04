package ch11.mycar.ex02;

public class CarTest {
    void main(){
        // Car인스턴스 생성
        // 인스턴스를 생성할 때 사용한 클래스가 생성한 인스턴스의 타입은 클래스가 된다.
//        Car mycar =  new Car();
//        // 인스턴스의 필드나 메서드를 접근할 때 . 연산자를 사용한다.
//        mycar.model = "부가티";

        // Car인스턴스를 Heap 영역에 만들어주기
//        Car mycar = new Car();
//        mycar.model = "람보르기니";
//        mycar.speed = 100;

//        Car mycer = new Car("람보르기니");
//        mycar.speed = 100;

        Car mycar =  new Car("포르쉐911", 100); // 생성할 때 모델명을 가진 채로 만들면 됨.

        mycar.start();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.gearUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.gearUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.gearUp();
        mycar.speedUp();
        mycar.speedUp();

        mycar.stop();

    }
}
