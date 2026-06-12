package ch09;

//  국어, 영어, 수학 점수를 이용하여 총점과 평균을 계산
public class ScoreTest {
    public static void main(String[] args){
        int kor = 100;
        int eng = 90;
        int math = 85;

        int sum = kor + eng + math;     // 총점
        double avg = sum / 3.0;      // 평균       3.0을 입력해서 double 값으로 형변환 시켜서 계산
//        avg = Math.round(avg);      // 소수 첫째자리 반올림, 92
//        avg = Math.round(avg * 10) / 10.0;      // 소수 둘째자리 반올림. 91.7
        // 소수점을 오른쪽으로 한번 옮긴 후 계산한 다음, 다시 소수점을 원위치 시켜서 값을 내어줌 = 91.666 * 10을 먼저 계산하고 916.6666... 에서 반올림을 한 후 10으로 다시 나눠서 계산
        avg = Math.round(avg * 100) / 100.0;  // 소수 셋째자리 반올림(더블로 형변환 시켜주는거 잊지 않기)

        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + avg);

    }
}
