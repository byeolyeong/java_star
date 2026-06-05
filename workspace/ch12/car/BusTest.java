package ch12.car;

public class BusTest {
    void main(){
        Car mycar = new Bus("람보르기니");
        mycar.speed = 100;

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
