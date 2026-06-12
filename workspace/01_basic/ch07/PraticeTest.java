package ch07;

import ch06.OperatorTest;

public class PraticeTest {
    public static void main(String[] args) {


//       if, if-else, else 를 활용
//        // 입력한 숫자가 8의 배수일 경우 "3의 배수입니다."를 출력하고
//        // 입력한 숫자가 8의 배수가 아닐 경우 홀수, 짝수 여부를 출력한다.
//        int num = 32000;
//
//        if(num % 8 == 0) {
//            System.out.println(num + ": 8의 배수가 맞습니다.");
//        } else if(num % 2 == 0) {
//            System.out.println(num + ": 짝수입니다.");
//        } else {
//            System.out.println(num + ": 홀수입니다.");
//        }

        // 입력받은 월의 마지막 일수를 입력하시오.(윤달은 제외.)
        int month = 111;

        if(month < 1 || month > 12){
            System.out.println("1~12 사이 숫자만 가능합니다.");
            System.exit(0);
        }
        if(month == 2) {
            System.out.println(month + "월의 마지막 날짜는 28일입니다.");
        } else if(month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println(month + "월의 마지막 날짜는 30일입니다.");
        } else {
            System.out.println(month + "월은 마지막 날짜는 31일입니다.");
        }
    }
}


