package SoloStudy04;

public class _02_Else {
    static void main() {
        // 조건문 If Else
        int hour = 10;
        if(hour < 14){  // 오후 2시 이전이면 실행
            System.out.println("아이스 아메리카노 +1");
        } else {    // 그 외의 경우이면 실행(위에 if조건문이 충족되면 해당 문구는 스킵)
            System.out.println("아이스 아메리카노 디카페인 +1");
        }
        System.out.println("커피 주문 완료");

        // 오후 2시이거나 모닝커피를 마신 경우
        hour = 10;
        boolean morningCoffee = false;
        if(hour >= 14 || morningCoffee == true){    // 오후 2시이거나 모닝커피를 마신 경우
            System.out.println("아이스 아메리카노 (디카페인 +1)");
        } else {    // 그 외의 경우이면
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #2");
    }
}
