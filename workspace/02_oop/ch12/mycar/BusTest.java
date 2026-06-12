package ch12.mycar;

public class BusTest {
    void main(){
        Bus mycar = new Bus("람보르기니", "10-2", "마을 버스",
                            new String[]{"우리집", "김포고등학교", "김포시청"}, 1300, 15);

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

//        Bus mycar2 = new Bus("전기버스", "3005", "광역 버스",
//                new String[]{"김포 시청", "발산", "홍대", "서울시청"}, 3500, 45);

        Bus mycar2 = new Bus("람보르기니", "10-2", "마을 버스",
                new String[]{"우리집", "김포고등학교", "김포시청"}, 1300, 15);

        mycar2.start();
        mycar2.speedUp(40);
        mycar2.stop();

        mycar2.ride(3);

        mycar2.start();
        mycar2.speedUp(50);
        mycar2.stop();

        mycar2.ride(12);

        mycar2.start();
        mycar2.speedUp(60);
        mycar2.speedDown();
        mycar2.stop();

        mycar2.ride(11);

        mycar2.start();
        mycar2.speedUp(40);
        mycar2.speedDown();
        mycar2.speedDown();
        mycar2.stop();

        mycar2.leave(20);
        mycar2.ride(24);

        mycar2.start();
        mycar2.speedUp(40);
        mycar2.speedDown();
        mycar2.speedDown();
        mycar2.stop();

        mycar2.leave(30);

        System.out.println(mycar);  //
        System.out.println(mycar2);

//        System.out.println(mycar.toString());  // mycar. 을 했을때 얇은 글씨들은 object에서 받아온거임.
//        System.out.println(mycar2);

        // 버스 노선이 같으면 같은 버스로 다루고 싶음
        System.out.println(mycar.equals(mycar2));
        System.out.println(mycar.hashCode());   // equals 를 오버라이드해서 값이 true가 나오면 hashCode에서는 같은 값이 출력이 됨
        System.out.println(mycar2.hashCode());
    }
}
