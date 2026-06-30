package level01.day02;

import java.util.Scanner;

public class Prob09 {
    public static void main(String[] args) {
        // 프로그래머스 기초 Day2 - 09 홀짝 구분하기
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 2 == 0){
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }
    }
}
