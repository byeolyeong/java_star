package SoloStudy2;

public class Study07 {
    public static void main(String[] args) {
        // 나도 코딩 chap 4 - 19 대입 연산자
        // 대입 연산자
        int num = 10;
        num = num + 2;  // num에 10이 대입 되어있기 때문에, num + 2 를 해도 됨
        System.out.println(num);    // 12

        num = num - 2;
        System.out.println(num);    // 10

        num = num * 2;
        System.out.println(num);    // 20

        num = num / 2;
        System.out.println(num);    // 10

        num = num % 2;
        System.out.println(num);    // 0    대입 연산을 통해 num 을 계속 업데이트 해줌.

        // 복합 대입 연산자
        num = 10;
//        num = num + 2;
        num += 2;
        System.out.println(num);    // 12

        num -= 2;
        System.out.println(num);    // 10

        num *= 2;
        System.out.println(num);    // 20

        num /= 2;
        System.out.println(num);    // 10

        num %= 2;
        System.out.println(num);    // 0
    }
}
