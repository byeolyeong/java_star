package ch08;

//  6이 나올때까지 주사위를 던져보자
public class WhileTest3 {
    public static void main(String[] args){
        int testCount = 0;          // <<< while문 안에 있는 while문
        while(testCount < 100){
            int num = 0;
            int count = 0;

            while(num != 6){
                // 주사위 던지기
                // Math.random() : 0이상 1미만의 무작위 double 타입의 숫자를 반환
                num = (int)(Math.random() * 6) + 1;  // 0이상 5.99999....미만의 수를 int로 형변환해서 정수로 만들기. 0~5까지만 나오기때문에 마지막에 +1을 해주면 1~6까지 나옴
//            System.out.println(num);
                count++;
            }

            System.out.println("반복 횟수: " + count);
            testCount++;
        }


    }
}





