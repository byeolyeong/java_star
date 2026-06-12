package ch08;

public class DoWhileTest {
    public static void main(String[] args) {
        int num;        // 6이 되지 않는 어떤 값이 있어야함

        do {        //  do-while문이라 최초 한 번은 무조건 실행을 한 후 반복문 진행.
            num = (int) (Math.random() * 6) + 1;
            System.out.println(num);
        } while(num != 6);
    }
}
