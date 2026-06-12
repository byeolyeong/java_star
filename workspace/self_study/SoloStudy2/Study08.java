package SoloStudy2;

public class Study08 {
    public static void main(String[] args){
        // 나도 코딩 chap 4 - 20 비교 연산자
        // 비교 연산자
        System.out.println(5 > 3);  // 5는 3보다 크다. (참이면 true, 거짓이면 false)
        System.out.println(5 >= 3); // 5는 3보다 크거나 같다.(true)
        System.out.println(5 >= 5); // 5는 5보다 크거나 같다.(true)
        System.out.println(5 >= 7); // 5는 7보다 크거나 같다.(false)

        System.out.println(5 < 3); // 5는 3보다 작다.(false)
        System.out.println(5 <= 3); // 5는 3보다 작거나 같다. (false)

        // 프로그램에서는 = 하나만 적게되면 대입 연산이 되기때문에 같은 값인지 비교하기 위해서는 ==을 해주어야한다.
        System.out.println(5 == 5); // 5는 5와 같다(true)
        System.out.println(5 == 3); // 5는 3과 같다(false)
        System.out.println(5 != 5); // 5는 5와 같지 않다.(false)
        System.out.println(5 != 3); // 5는 3과 같지 않다.(true)

    }
}
