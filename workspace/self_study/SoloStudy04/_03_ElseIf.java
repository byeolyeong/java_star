package SoloStudy04;

public class _03_ElseIf {
    static void main() {
        // 조건문 Else if
        // 처음 조건이 성립되면 처음 조건에 대한 결과값을 출력. (if)
        // 처음 조건이 성립되지 않고 그 다음 조건이 성립되면 그 다음 조건에 대한 결과값을 출력 (else if)
        // 위 조건이 모두 성립되지 않았을때 마지막 조건의 결과값을 출력 (else)

        // 한라봉 에이드가 있으면 +1
        // 또는 망고 주스가 있으면 +1
        // 또는 아이스 아메리카노 +1

        boolean hallabongAde = true; // 한라봉 에이드
        boolean mangoJuice = true; // 망고주스

        if(hallabongAde) {  // 한라봉에이드가 있다는 조건이니  ==true는 생략 가능
            System.out.println("한라봉 에이드 +1");
        } else if (mangoJuice) {
            System.out.println("망고 주스 +1");
        } else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #1");

        // else if 는 여러번 사용 가능
        hallabongAde = false;
        mangoJuice = false;
        boolean orangeJuice = true;

        if(hallabongAde) {  // 한라봉에이드가 있다는 조건이니  ==true는 생략 가능
            System.out.println("한라봉 에이드 +1");
        } else if (mangoJuice) {
            System.out.println("망고 주스 +1");
        } else if (orangeJuice){
            System.out.println("오렌지 주스 +1");
        } else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #2");

        // else는 없어도 가능
        hallabongAde = false;
        mangoJuice = false;
        orangeJuice = false;

        if(hallabongAde) {  // 한라봉에이드가 있다는 조건이니  ==true는 생략 가능
            System.out.println("한라봉 에이드 +1");
        } else if (mangoJuice) {
            System.out.println("망고 주스 +1");
        } else if (orangeJuice){
            System.out.println("오렌지 주스 +1");
        }
        System.out.println("커피 주문 완료 #3");




    }
}
