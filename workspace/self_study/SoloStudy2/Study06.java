package SoloStudy2;

public class Study06 {
    public static void main(String[] args){
        // 나도 코딩 chap 4 - 17 산술 연산자
        // 산술연산자

        // 일반 연산
        System.out.println(4 + 2);  // 6
        System.out.println(4 - 2);  // 2
        System.out.println(4 * 2);  // 8
        System.out.println(4 / 2);  // 2
        System.out.println(5 / 2);  // 2 (소수점이 생기는데 int형으로 계산이 되어서 소수가 잘림)
        System.out.println(4 % 3);  // 1    %는 나머지 계산

        // 우선 순위에 따른 연산
        System.out.println(2 + 2 * 2);  // 6
        System.out.println(( 2 + 2 ) * 2 ); //8
        System.out.println(2 + (2 * 2));    // 6

        //변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c = a + b;

        c = a + b;
        System.out.println(c);  // 30

        c = a - b;  // 10
        System.out.println(c);

        c = a * b;
        System.out.println(c);  // 200

        c = a / b;
        System.out.println(c);  // 2

        c = a % b;
        System.out.println(c);


        // 증감 연산 ++, --
        int val;
        val = 10;
        System.out.println(val);    // 10
        System.out.println(++val);  // 11   먼저 계산한 후 출력
        System.out.println(val);    // 11

        val = 10;
        System.out.println(val);    // 10
        System.out.println(val++);  // 10   먼저 출력을 한 후 계산
        System.out.println(val);    // 11

        val = 10;
        System.out.println(val);    // 10
        System.out.println(--val);  // 9
        System.out.println(val);    // 9

        val = 10;
        System.out.println(val);    // 10
        System.out.println(val--);  // 10
        System.out.println(val);    // 9

        // 은행 대기번호 표
        int waiting = 0;
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 : 0
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 : 1
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 : 2
        System.out.println("총 대기 인원" + waiting);    // 대기 인원 : 3


    }
}
