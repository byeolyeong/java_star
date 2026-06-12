package ch08;

public class ForSolve {
    public static void main(String[] args){
        int sum = 0;

        // 1~ 100까지의 합계
        for(int i = 0; i <= 100; i++){
            sum += i;
        }
        System.out.println("1~100까지의 합계: " +sum);


        // 1~ 100까지의 홀수 합계
        sum = 0;
        for(int i = 0; i <= 100; i+=2){     // i: 1, 3, 5, 7, 9.... i값을 2씩 누적시켜주기(i+=2)
            sum += i;
        }
        System.out.println("1~100까지의 합계: " +sum);

//        sum = 0;
//        for(int i = 0; i <= 100; i++){
//            if (1 % 2 != 0) {
//                sum += 1;
//            }
//        }
//        System.out.println("1~100까지의 합계: " +sum);

        // 1~ 100까지의 짝수 합계
        sum = 0;    //  sum을 0으로 초기화를 시켜줌
        for(int i = 2; i <= 100; i+=2){     // i를 2부터 시작해서 2씩 누적시켜주기
            sum += i;
        }
        System.out.println("1~100까지의 합계: " +sum);

//        int num = Integer.parseInt(args[0]);
//        int sum = 0;
//
//        for(int i = 1; i <= num; i++) {
//            sum += i;
//            System.out.println("i: " + i + ", sum: " + sum);
//        }
//        System.out.println("1부터 " + num + "까지의 합계: " + sum);
    }
}
