package level01.day05;

public class Prob21 {
    // 프로그래머스 기초 Day5 - 코드 처리하기
    public String solution(String code) {
        String ret = "";
        int mode = 0;
        for(int i = 0; i < code.length(); i++) {
            char ch = code.charAt(i);

            if (ch == '1') {
                if (mode == 0) {
                    mode = 1;
                } else {
                    mode = 0;
                }
            } else {
                if (mode == 0) {
                    if (i % 2 == 0)
                        ret += ch;
                } else {
                    if (i % 2 != 0) {
                        ret += ch;
                    }
                }
            }
        }
        if (ret.isEmpty()){
            return "EMPTY";
        }
        return ret;
    }

    void main() {
        System.out.println(solution("abc1abc1abc"));

    }
}
