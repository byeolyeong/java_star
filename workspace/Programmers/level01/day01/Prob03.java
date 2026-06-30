package level01.day01;

import java.util.Scanner;

public class Prob03 {
    public static void main(String[] args) {
        // 프로그래머스 기초 Day1 - 03 문자열 반복해서 출력하기
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        for(int i = 1; i <= 5; i++){
            System.out.print(str);
        }
    }
}
