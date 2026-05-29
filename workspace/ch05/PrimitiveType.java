package ch05;

public class PrimitiveType {
    void main(){    // main 메서드 : 자바 프로그램의 시작점
        int age;   // 1. 변수 선언
        age = 25;   // 2. 변수에 값 할당 (= 은 대입연산자)
        System.out.println(age);
        age = 30;   // 3. 변수에 값을 재할당
        System.out.println(age);
//        age = -180;
//        System.out.println(age);      // << 주석이라고 함. 비활성화 하고 싶은 코드를 드래그를 한 후 ctrl + /를 누르면 주석이 들어감.


        int score = 100;    // 변수 선언과 동시에 값 할당
        System.out.println(score);
//        score = 300;
//        System.out.println(score);
//        score = -120;
//        System.out.println(score);


        byte b = 127;   // byte는 -128 ~ 127 범위를 가짐.
        System.out.println(b);


        short s = 10000;
        System.out.println(s);   // System.out 는 많이 쓸거기 때문에 sout 만 치면 인텔리제이 기능에서 자동으로 입력됨

        int num = 1000000000;
        System.out.println(num);

        long bigNum = 10000000000L;     // long 타입으로 선언을 했기때문에 숫자 뒤에 l을 붙어 long로 지정.
        System.out.println(bigNum);


        double pi = 3.141592;
        System.out.println(pi);
        System.out.println(pi * 5 * 5);     // 반지름이 5인 원의 넓이를 계산
        System.out.println(3.141592 * 4 * 4);       // 반지름이 4인 원의 넓이를 계산

        float shortPi = 3.14F;      // 해당 코드의 3.14 뒤에 F를 붙인건 해당 수를 float로 지정해주기 위함임
        System.out.println(shortPi);


        boolean isGood = true;
        System.out.println(isGood);

        boolean isMan = false;
        System.out.println(isMan);

        char grade = 'A';
        System.out.println(grade);

        grade = 'B';
        System.out.println(grade);


        // 문자열 : 2글자 이상의 문자들을 저장
        // 큰따옴표(")로 문자를 묶어서 표현
        String firstName = "멋쟁이";
        String lastName = "사자처럼";
        System.out.println(firstName);
        System.out.println(lastName);


        // final : 상수 선언 (바뀔 필요가 없는 부분을 지정해주는거)
        final double PI = 3.14;

        System.out.println(PI * 5 * 5);     // 반지름이 5인 원의 넓이를 계산


//        PI = 3.141592;    // 상수는 재할당을 할 수 없음 (final을 붙였기 때문에 PI = 3.141592; 를 하게 되면 에러가 뜸.)
        System.out.println(PI * 4 * 4);       // 반지름이 4인 원의 넓이를 계산
    }
}
