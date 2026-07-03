package ch04.echo;

import java.io.*;
import java.net.Socket;

public class EchoClient {
    void startClient(){
        try(
                // 서버에 접속 요청 (localhost:50000)
                Socket s = new Socket("localhost", 50000);
//                Socket s = new Socket("dain2.iptime.org", 50000);

        ){
            // 키보드에서 줄 단위로 읽기 위한 Stream
            BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
            // Socket에서 데이터를 읽을 수 있는 Stream 생성
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            // Socket으로 데이터를 전송할 수 있는 Stream 생성
            // PrintWriter를 사용한 후 autoFlush를 true로 설정해서 자동으로 줄바꿈을 넣어줌
            PrintWriter out = new PrintWriter(new OutputStreamWriter(s.getOutputStream()), true);

            System.out.println("서버 접속 완료");
            String readData = "";

            while((readData = key.readLine()) != null){
                out.println(readData);
                String echoData = in.readLine();   // 클라이언트에 메세지 반송
                System.out.println(echoData); // 클라이언트의 메세지를 서버에도 출력
            }

        } catch(IOException e){
            System.out.println("네트워크 오류 발생 : " + e.getMessage());
        }
    }

    void main(){
        startClient();
    }
}
