package ch07;

// 입력한 숫자가 3의 배수일 경우 "3의 배수입니다."를 출력하고
// 입력한 숫자가 3의 배수가 아닐 경우 홀수, 짝수 여부를 출력한다.
// if 연산자는 무수히 많아질 수 있는 연산자임.
// if (조건문) { }; 이렇게 하면 안됨.(마크 표시이기 때문에 세미콜론은 붙이지 않는거임.)
public class IfTest {
    public static void main(String[] agrs) {
        int num = 18;

//        if (num % 3 == 0) {
//            System.out.println(num + ": 3의 배수입니다.");
//        }
//        if (num % 3 != 0) {
//            System.out.println(num + ": 3의 배수가 아닙니다.");
//        }

        if (num % 3 == 0) {
            // 조건문이 ture일 경우 실행되는 블럭
            System.out.println(num + ": 3의 배수입니다.");
        } else if (num % 2 == 0) {
            System.out.println(num + ": 짝수 입니다.");
        } else {
            //조건문이 false일 경우 실행되는 블럭
            System.out.println(num + ": 홀수 입니다.");
        }
    }
}
