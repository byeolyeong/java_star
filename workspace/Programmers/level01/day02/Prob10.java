package level01.day02;

public class Prob10{
    // 프로그래머스 기초 Day2 - 10 문자열 겹쳐쓰기
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = my_string.substring(s, s+overwrite_string.length());
        return my_string.substring(0, s) + overwrite_string + my_string.substring(s + overwrite_string.length());
    }
}

