package ch06;

public class OperatorTest {
    static void main() {
        int num1 = 5;
        int num2 = 28;
        int num3, num5; // 동시에 선언하고싶으면 , 를 붙이면 됨. 보통은 하나씩 선언 시킴
        double num4;

        num3 = num2 * num1;
//        num4 = num2 / (double)num1; // 이렇게 했을때 num4가 int로 지정 되어있으면 오류가 발생함.
        num4 = num2 / (double) num1;
        num5 = num2 % num1;

        System.out.println("28 * 5 = " + num3);
        System.out.println("28 / 5 = " + num4);
        System.out.println("28 % 5 = " + num5);

        System.out.println("++5 = " + ++num1);  // 6 (num1이 5이니까 ++가 앞에 있으니 +1을 해서 6이 됨)
        System.out.println("6++ = " + num1++);  // 6 (num1이 6인데 ++가 뒤에 있으니 먼저 6이라는 값을 사용한 후 나중에 더하기를 실행해서 6이 됨)
        System.out.println("num1 = " + num1);   // 7

        int a = 3;
        boolean b = (++a + 10) >= 14 && (2 + 3 * ++a) > 10;
        System.out.println(b);  // true
        System.out.println(a);  // 5


    }
}
