package ch11.capsule.ex02;

public class ScoreTest {
    public static void main(String[] args){
        Score haru = new Score(100, 90, 85);    // 전달받는 생성자의 값을 입력
        // 필드에 private 를 입력함으로써 필드의 직접 접근을 제한시킴.
//        haru.kor = 1000;

//        int haruSum = haru.sum();
//        System.out.println("하루의 총점 : " + haruSum);

//        double haruAvg = haru.avg();
        double haruAvg = haru.avg();    // private를 걸었기때문에, haru.sum() 이 나오지 않음
        System.out.println("하루의 평균 : " + haruAvg);

        haru.setMath(haru.getMath() + 5);

        haruAvg = haru.avg();
        System.out.println("하루의 평균 : " + haruAvg);
    }

}
