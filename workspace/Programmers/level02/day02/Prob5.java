package level02.day02;

public class Prob5 {
    public int solution(int num1, int num2) {
        int answer = num1 * 1000 / num2;
        return answer;
    }

    void main(){
        System.out.println(solution(3, 2));
    }
}
