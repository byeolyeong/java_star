package level01.day03;

public class Prob12 {
    public static void main(String[] args) {
        // 프로그래머스 기초 Day3 - 12 문자리스트를 문자열로 반환
        // 배열 생성과 동시에 선언
        String[] arr = {"a", "b", "c"};
        String answer = "";
        for(int i = 0; i < arr.length; i++){
            answer += arr[i];
        }
        System.out.println(answer);
    }
}
