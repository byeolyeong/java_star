package level01.day03;

public class Prob11 {
    // 프로그래머스 기초 Day3 - 11 문자열 섞기
    public static void main(String[] args){
        String a = "aaaaa";
        String b = "bbbbb";
        String answer = "";

        for(int i = 0; i < a.length(); i++){    // a의 length만큼 i를 반복 실행
            answer += a.toCharArray()[i]; // .toCharArray()를 이용해서 문자열을 char 배열로 생성
            answer += b.toCharArray()[i]; // .toCharArray()를 이용해서 문자열을 char 배열로 생성
            // 배열로 생성한 문자를 하나씩 누적해서 표현
            // a b a b a b....
        }

        System.out.println(answer);
    }
}