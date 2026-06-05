package SoloStudy2;

public class Study10 {
    public static void main(String[] args){
        // 삼항 연산자
//        결과 = (조건) ? (참의 경우 결과값) : (거짓의 경우 결과값)
        int x = 3;
        int y = 5;
        int max = (x > y) ? x : y;
        System.out.println(max);    // 5

        int min = (x < y) ? x : y;
        System.out.println(min);    // 3

        boolean b = (x == y) ? true : false;
        System.out.println(b);  // false

        String s = (x != y) ? "다름" : "같음";
        System.out.println(s);  // 다름

    }
}
