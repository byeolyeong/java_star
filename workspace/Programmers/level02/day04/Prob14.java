package level02.day04;

public class Prob14 {
    // 프로그래머스 입문 Day4 - 피자 나눠 먹기 2
    public int solution(int n) {
        if(n % 2 == 0)
            n /= 2;
        if(n % 3 == 0)
            n /= 3;
        return n;
    }

    void main() {
        System.out.println((solution(6)));
        System.out.println((solution(10)));
        System.out.println((solution(4)));
    }
}
