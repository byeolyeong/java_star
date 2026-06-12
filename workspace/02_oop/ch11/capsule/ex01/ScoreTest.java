package ch11.capsule.ex01;

public class ScoreTest {
    public static void main(String[] args){
        Score haru = new Score();
        haru.kor = 100;
        haru.eng = 90;
        haru.math = 85;
//        int haruSum = haru.sum();
//        System.out.println("하루의 총점 : " + haruSum);

//        double haruAvg = haru.avg();
        double haruAvg = haru.avg();    // private를 걸었기때문에, haru.sum() 이 나오지 않음
        System.out.println("하루의 평균 : " + haruAvg);
    }

}
