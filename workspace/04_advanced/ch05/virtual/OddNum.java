package ch05.virtual;

// 또 다른 스레드를 만들고 싶을때 스레드 클래스를 상속 받기 해주어야함

/**
 * Thread를 만드는 방법 1번
 * 1. Thread를 상속 받는다.
 * 2. run 메서드를 오버라이딩 한다.(독립적인 Thread로 실행할 코드를 작성)
 */
public class OddNum implements Runnable{
    public void run(){
        System.out.println("2. " + Thread.currentThread().getName() + "홀수 출력 시작");
        // 1~ 10까지 홀수를 출력한다.
        for(int i =1; i<=10; i+=2){
            System.out.println("3. 홀수 : " + i);
        }
        System.out.println("4. 홀수 출력 종료");
    }
}
