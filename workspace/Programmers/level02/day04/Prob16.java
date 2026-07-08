package level02.day04;

public class Prob16 {
    // 프로그래머스 입문 Day4 - 배열의 평균 값
    public double solution(int[] numbers) {
        int num = 0;
        double answer = 0;

        for (int number : numbers) {
            num += number;
        }
        answer = (double) num / numbers.length;
        return answer;
    }


    void main() {
        System.out.println((solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10})));
        System.out.println((solution(new int[]{89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99})));
    }
}
