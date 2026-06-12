package ch13.supercar;

public class Driver {
    // 기본 생성자
//    Driver(){}
    void drive(SuperCar car){
        // 2
        car.move();


        if(car instanceof Chargeable){
            ((Chargeable)car).charge();
        }
//        if(car instanceof ElectricCar) {    //if 문으로 car가 ElectricCar인지 확인을 함
//            ((ElectricCar)car).charge();   // (car를 ElectricCar로 down casting함)
//        } else if (car instanceof  PlugInHybridCar) {   //else-if 문으로 car가 PlugInHybridCar인지 확인을 함
//            ((PlugInHybridCar)car).charge();    //(car를 PlugInHybridCar로 down casting함)
//            // 이후 또 다른 충전을 하는 차종이 있다면 else-if문을 이용해서 계속 추가해주어야함
    }
}
