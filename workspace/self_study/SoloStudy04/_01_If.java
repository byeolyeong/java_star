package SoloStudy04;

public class _01_If {
    public static void main(String[] args){
        // 조건문 If
        int hour = 15;  // 오후 3시

        // if문 내에서 하나의 문장을 실행할 때는 { } 생략 가능
        if(hour < 14)
            System.out.println("아이스 아메리카노 +1");

        // if문 내에서 두개 이상의 문장을 실행할 때는 { } 생략 불가능
        if (hour < 14) {
            System.out.println("아이스 아메라카노 +1");
            System.out.println("샷 추가");
        }
        System.out.println("커피 주문 완료");
    }
}
