package ch03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

// 3. 파일(output.txt) => 표준출력장치(console)
// 해당 코드는 알고 있어야함
public class FileToConsole {
    void main(){
        try(
                // 다형성을 이용
           InputStream fis = new FileInputStream("output.txt")
        ){
            // 표준 입력 장치로부터 1byte 읽어온다.
            int readData = 0;

            while((readData = fis.read()) != -1){
                // 표준 출력 장치로 1byte 출력한다.
                System.out.write(readData);
            }
        } catch (IOException e){
            System.err.println("입출력 예외 발생 : " + e.getMessage());
        }
    }
}
