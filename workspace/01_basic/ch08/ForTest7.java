package ch08;

public class ForTest7 {
    public static void main(String[] args){
        int sum = 0;
        for(int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {   // 짝수일 때
                continue;
            }
            sum += i;   //continue가 실행되면 이건 실행되지 않고 다음 단계로 넘어감.
        }
        System.out.println("1~100까지의 합계: " +sum);

        //1 ~ 100 합계
        int num = 1;
        sum = 0;
        while(true) {
            sum += num; // 0, 1, 3, 6, 10, 15, 21 ....
            num++; // 1, 2, 3, 4, ...
            if(num > 100){
                break;  //while문 중단
            }
        }
        System.out.println("1~100까지의 합계 : " + sum);
    }
}
