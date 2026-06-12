package ch07;

// 나이에 따른 입장료 할인을 계산하는 프로그램을 작성하세요.
// 7세 이하 : 영유아 할인 100%
// 8 ~ 13세 : 어린이 50% 할인
// 14 ~ 19세 : 청소년 30% 할인
// 65세 이상 : 70% 할인
public class IfSwitchTest {
    public static void main(String[] args) {
        int age = 20;
        int price = 20000;

        double discountRate = 0.0; // 할인율(30% 할인의 경우 0.3)
        int lastPrice = price;

        // 요금을 계산하세요.

//    해당 문제는 if 문을 사용해야함. case가 너무 많기 때문에, switch문은 적합하지 않음.(범위를 표현할 때 if문 사용)
        if ( age <= 7 ) {
            discountRate = 1.0;
        } else if ( age <= 13 ) {    // age >= 8은 생략 가능함. (앞에 if 조건문에서 age 값이 미달했지 떄문에 age가 8을 표현중이기 때문)
            discountRate = 0.5;
        } else if ( age <= 19 ) {
            discountRate = 0.3;
        } else if ( age >= 65 ) {
            discountRate = 0.7;
        } else {
            discountRate = 0;
        }

        lastPrice = (int) (price * (1 - discountRate));

        System.out.println("나이가 " + age + "세 이므로 할인율 " + discountRate*100 + "% 가 적용되어 요금은 "+ lastPrice + "원 입니다.");

    }
}
