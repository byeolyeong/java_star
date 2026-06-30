package level01.day02;

import java.util.Scanner;


public class Prob08 {
    public static void main(String[] args) {
        // 프로그래머스 기초 Day2 - 08 문자열 돌리기
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        for(int i = 0; i<a.length(); i++){
            System.out.println(a.charAt(i));
        }
    }
}

