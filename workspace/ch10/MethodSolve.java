package ch10;

// 세 과목의 총점과 평균을 계산하는 메서드를 작성하고 이를 출력하는 프로그램을 작성하세요.
public class MethodSolve {
    // int[] 점수를 전달받아서 총점을 계산하는 반환하는 메서드(sum)
    int sum(int[] scores) {
        int total = 0;
        for(int score : scores){
            total += score;
        }
        return total;
    }


    // int[] 점수 배열을 전달받아서 평균을 계산해서 반환하는 메서드(avg)    총점만으로는 계산을 못함.
    // 평균은 소수도 표현해야한다.
    double avg(int[] scores){
        int total = sum(scores);
        double scoreAvg = (double)total / scores.length;
        return Math.round(scoreAvg*10) / 10.0;        // Math.round는 long타입이기 때문에 둘 중 하나가 실수 타입이 되어야함.
    }

    // int[] 점수를 전달 받아서 출력하는 메서드(printScore)
    // 출력 예시 :
    // 총점 : 268, 평균 : 89.7
    void printScore(int[] scores){      // 반환 값이 없기때문에 void를 붙여줌
        int total = sum(scores);
        double scoreAvg = avg(scores);     //double 은 int로 형변환을 안해줌
        System.out.println("총점 : " + total + ", 평균 : " + scoreAvg);
    }

    void main(){
        // haru는 국어, 영어, 수학 점수가 각각 80, 70, 56이다.
        // namu는 국어, 영어, 수학 점수가 각각 90, 77, 80이다.
        // brong이는 국어, 영어, 수학 ㅈ머수가 각각 100, 99, 88이다.

        // 이 셋의 총점과 평균을 구해서 출력하세요.

        int[] haruScore = {80, 70, 56};
        int[] namuScore = {90, 77, 80};
        int[] brongScore = {100, 99, 88};

        printScore(haruScore);
        printScore(namuScore);
        printScore(brongScore);

    }
}
