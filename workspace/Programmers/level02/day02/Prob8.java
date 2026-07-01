package level02.day02;


public class Prob8 {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }


    void main() {
        System.out.println(java.util.Arrays.toString(solution(new int[]{1, 2, 3, 4, 5})));
        System.out.println(java.util.Arrays.toString(solution(new int[]{1, 2, 100, -99, 1, 2, 3})));
    }
}
