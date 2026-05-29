package ch08;

// 첫 달에 1원을 받고 매달 두 배씩 받을때
// 몇 달이 지나야 급여가 1억을 넘기는가?

// 어떤 조건을 표현할 때에는 while 문이 용이함(조건문이 횟수 기반이 아닌 다른거로 정의될때)
public class WhileTest2 {
    public static void main(String[] args){
        int month = 1;  // 근무 달
        int sal = 1;    //월급

        while(sal < 100000000) {
            month++;
            sal *= 2;
        }

        System.out.println(month + "달의 급여: " + sal);
    }
}
