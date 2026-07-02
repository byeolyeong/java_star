package ch03;

import java.io.IOException;

// 1. 표준입력장치(키보드) => 표준출력장치(console)
// 해당 코드는 알고 있어야함
public class KeyboardToConsole {
    void main(){
//      inputStream에는 read, OutputStream에는 write가 있음
        // read는 try-catch를 이용해서 exception을 잡아줘야함.
        try{
            // 표준 입력 장치로부터 1byte 읽어온다.
            // read메서드는 blocking이 되는 메서드임.(IO블로킹)
            // 그러므로 실행중인 상태에서 프로그램이 멈춰있음 ( = 값을 입력해야 실행이 됨)
            int readData = 0;

            // while문을 이용해 무한으로 읽어올 수 있게 만들어줌
            while((readData = System.in.read()) != -1){
                // 표준 출력 장치로 1byte 출력한다.
                // out는 buffer 이기 때문에 출력을 하지 않고 메모리가 삭제됨
                System.out.write(readData);
            }
        } catch (IOException e){
            System.err.println("입출력 예외 발생 : " + e.getMessage());
        }
    }
}
