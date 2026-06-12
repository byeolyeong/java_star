package ch07;

// 입력받은 월(month)의 마지막 날짜를 출력하세요. (윤달은 계산하지 않음)
public class IfTest2 {
    public static void main(String[] args) {
        int month = 2;

        if (month < 1 || month > 12) {      // if문은 중첩이 가능함
            System.out.println("1~12 사이의 숫자만 가능합니다.");
//             System.exit(0); // (status 부분은 직접 입력 X / 0만 입력함.) 프로그램 강제 종료 - 0은 프로그램 종류 코드를 정의해준거임
//            백엔드 개발자는 System.exit 는 절대 안씀 = 현업에서도 안씀
        } else {
            // v01
            if (month == 1) {
                System.out.println("1월의 마지막 날은 31일 입니다.");
            } else if (month == 2) {
                System.out.println("2월의 마지막 날은 28일 입니다.");
            } else if (month == 3) {
                System.out.println("3월의 마지막 날은 31일 입니다.");
            } else if (month == 4) {
                System.out.println("4월의 마지막 날은 30일 입니다.");
            } else if (month == 5) {
                System.out.println("5월의 마지막 날은 31일 입니다.");
            } else if (month == 6) {
                System.out.println("6월의 마지막 날은 30일 입니다.");
            } else if (month == 7) {
                System.out.println("7월의 마지막 날은 31일 입니다.");
            } else if (month == 8) {
                System.out.println("8월의 마지막 날은 31일 입니다.");
            } else if (month == 9) {
                System.out.println("9월의 마지막 날은 30일 입니다.");
            } else if (month == 10) {
                System.out.println("10월의 마지막 날은 31일 입니다.");
            } else if (month == 11) {
                System.out.println("11월의 마지막 날은 30일 입니다.");
            } else if (month == 12) {
                System.out.println("12월의 마지막 날은 31일 입니다.");
            }


            // v02
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                System.out.println(month + "월의 마지막 날은 31일 입니다.");
            } else if (month == 2) {
                System.out.println(month + "월의 마지막 날은 28일 입니다.");
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                System.out.println(month + "월의 마지막 날은 30일 입니다.");
            }


//       ver.3
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                System.out.println(month + "월의 마지막 날은 31일 입니다.");
            } else if (month == 2) {
                System.out.println(month + "월의 마지막 날은 28일 입니다.");
//        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            } else {
                System.out.println(month + "월의 마지막 날은 30일 입니다.");
            }

//        ver.4
            if (month == 4 || month == 6 || month == 9 || month == 11) {
                System.out.println(month + "월의 마지막 날은 31일 입니다.");
            } else if (month == 2) {
                System.out.println(month + "월의 마지막 날은 28일 입니다.");
//        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            } else {
                System.out.println(month + "월의 마지막 날은 30일 입니다.");
            }
        }
    }
}
