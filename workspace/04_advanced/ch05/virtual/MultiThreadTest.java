package ch05.virtual;

public class MultiThreadTest {
    void main() throws InterruptedException{
        System.out.println("1. main 시작");

        OddNum odd = new OddNum();
        EvenNum even = new EvenNum();

//        odd.start();    // Thread를 상속 받았기 때문에 가능함(부모클래스가 가지고 있기 때문에 사용 가능)
//        new Thread(even, "짝수 스레드").start(); // even의 Runnable은 run만 사용이 가능하기 때문에, 스레드를 하나 생성하고(even)을 .start로 동작을 할 수 있게 해줌

        Thread oddThread = Thread.ofVirtual().start(odd); // 가상스레드 생성
        Thread evenThread = Thread.ofVirtual().start(even);

        // 익명 클래스
        // Runnable 인터페이스를 구현하는 이름 없는 클래스
        Thread t3 = Thread.ofVirtual().start(new Runnable(){
            @Override
            public void run() {
                for(int i = 3; i<=10; i+=3){
                    System.out.println("3의 배수 : " + i);
                }
            }
        });

//        Thread.sleep(1000*1);
        // 메인스레드가 바로 종료되지 않게 만드는 코드
        oddThread.join();
        evenThread.join();
        t3.join();


        System.out.println("8. main 종료");
    }
}

/*
class Thread{
    Runnable task;
    Thread(){

    }
    Thread(Runnable r){
        task = r;
    }
    public void start(){
        // OS로부터 스레드를 할당받고...
        // 스케쥴러에 스레드를 등록하고...
        // 어쩌고 저쩌고...

        if(task == null){
            run();
        } else {
            task.run();
        }

    }

    public void run(){
        System.out.println("Thread&#xC758; run &#xC2E4;&#xD589;.");
}
*/
