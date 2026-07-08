package ch09;

public class EnhancedFor {
    public static void main(String[] args){
        int[] scores = {90, 80, 75};    // 3과목
//        int[] scores = {100, 80, 70, 88};   // 4과목

        int sum = 0;    // 총점
        double avg = 0;     // 평균

        //과목 수와 상관없이 총점과 평균을 계산하세요.(과목 수가 달라져도 이 코드는 수정하지 않습니다.)

//        sum += scores[0];
//        sum += scores[1];
//        sum += scores[2];
//        sum += scores[3];   //sum을 해당 인덱스에 누적을 시켜주기. 반복이 되는 코드이기 때문에 for 문을 사용하기
//
//        avg = sum / 4.0;

        //일반 for문
//        for(int i=0; i<scores.length; i++)
//            int score = scores[i]
//            sum += score;
//        }

        //향상된 for문 (Enhanced for loop)
        for(int score: scores){     // int score = scores[i];
            sum += score;
        }


        avg = (double)sum / scores.length;      // int와 int의 연산이기 때문에 double을 붙여 형변환 시켜주기.

        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + avg);
    }
}
