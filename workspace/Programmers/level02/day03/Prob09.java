package level02.day03;

public class Prob09 {
    public int solution(int num1, int num2) {
        int answer = -1;
        answer = num1 % num2;
        return answer;
    }
    void main() {
        System.out.println(solution(3, 2));
    }
}

