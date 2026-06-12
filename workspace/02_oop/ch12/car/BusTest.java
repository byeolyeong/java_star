package ch12.car;

public class BusTest {
    void main(){
        Bus mycar = new Bus("람보르기니", "10-2", "마을 버스",
                            new String[]{"우리집", "김포고등학교", "김포시청"}, 1300, 15);
        mycar.speed = 0;

        mycar.start();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.stop();

        mycar.ride();
        mycar.ride();
        mycar.ride();
        mycar.ride();

        mycar.start();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.stop();

        mycar.ride();
        mycar.ride();
        mycar.ride();
        mycar.ride();
        mycar.ride();
        mycar.ride();
        mycar.ride();
        mycar.ride();
        mycar.ride();
        mycar.ride();

        mycar.start();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedDown();
        mycar.speedDown();
        mycar.stop();

        mycar.ride();
        mycar.ride();
        mycar.ride();
        mycar.ride();

        mycar.start();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedDown();
        mycar.speedDown();
        mycar.stop();

        mycar.leave();
        mycar.leave();
        mycar.leave();
        mycar.leave();
        mycar.leave();
        mycar.leave();
        mycar.leave();
        mycar.leave();
        mycar.leave();
        mycar.leave();
        mycar.leave();
        mycar.leave();
        mycar.leave();
        mycar.leave();
        mycar.leave();


        System.out.println(mycar.getBusInfo());
    }
}
