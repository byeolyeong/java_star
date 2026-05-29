package ch08;

//      1부터 지정한 수까지의 합계를 구하시오.
public class WhileTest {
    public static void main(String[] args){     //(String[변수]로 전달되는 args){
        // 명령행 매개변수
        // java ch08.WhileTest 10 20(명령행 매개변수)
        // args[0] -> 10
        // args[1] -> 20
        int num = Integer.parseInt(args[0]);        // String을 int로 변환
        int i = 1;  // i를 초기화 1, 2, 3, 4, .... (1씩 증가) for문 1번
        int sum = 0;


        // 반복문 없이 구현 = 하드코딩
//        sum = sum + i;  // 0 + 1
//        System.out.println("i: " + i + ", sum :" + sum);    // i: 1, sum: 1
//        i++;    // i = 2
//
//        sum = sum + i;  // 1 + 2
//        System.out.println("i: " + i + ", sum :" + sum);    // i: 2, sum: 3
//        i++;    // i = 3
//
//        sum += i;   // sum = sum + i; 1 + 2 + 3
//        System.out.println("i: " + i + ", sum :" + sum);    // i: 3, sum: 6
//        i++;
//
//        sum = sum + i;
//        System.out.println("i: "+ i + ", sum: " + sum);
//        i++;
//
//        sum = sum + i;
//        System.out.println("i: " + i + ", sum: " + sum);
//        i++;

        // while 반복문.
        while(i <= num) {       // 조건문 for문 2번   (i가 num이하 일때 i를 누적시킨 후 sum을 증가시킴)
            sum += i;   // 왼쪽 변수에 오른쪽 값을 누적을 시킴(for문 4번)
            System.out.println("i: " + i + ", sum: " +sum);
            i++;    // i 증감식 for문 3번
        }

        System.out.println("1부터 " + num + "까지의 합계: " + sum);
    }
}
