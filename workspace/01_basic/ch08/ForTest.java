package ch08;


// 횟수를 표현할 때에는 for 문이 용이함
public class ForTest {
    public static void main(String[] args){

        int num = Integer.parseInt(args[0]);
        int sum = 0;

        for(int i = 1; i <= num; i++) { // for(while 1/ while 2 / while 3) 순서
            sum += i;   // while문 4번
            System.out.println("i: " + i + ", sum: " +sum);     //  횟수를 기반으로 작동을 시킬땐 for문, 어떠한 조건을 가지고 작동을 하는건 while문
        }

        System.out.println("1부터 " + num + "까지의 합계: " + sum);
    }
}