package ch09;

//  국어, 영어, 수학 점수를 이용하여 총점과 평균을 계산
public class ScoreArrayTest {
    public static void main(String[] args){
//        int kor = 100;    해당 데이터들은 아래에 배열을 선언했기때문에 불필요한 데이터가 됨.
//        int eng = 90;
//        int math = 85;

//        // 배열의 순서 : 선언 -> 생성 -> 할당

          // 1. 배열 선언, 생성, 초기화를 각각
//        int[] haruScore;  // 1-1. 배열 선언(데이터 타입(int)뒤에 []를 붙여서 '배열'을 선언 시켜주기) 한 종류의 데이터 타입만 담을 수 있음
//        haruScore = new int[3]; // 1-2. 배열 생성(갯수 지정), 12byte의 메모리(힙) 할당하고 그 주소를 반환 // =  (haruScore는 int 타입 배열인데, int 타입 배열을 3개 만듦(new int[3]))

        // 2. 배열 선언과 생성을 동시에
//        int[] haruScore = new int[3]; // 2-1. 선언과 생성
//
//        haruScore[0] = 100; // 1-3, 2-2. 배열 요소에 값 할당 (index([])를 이용해서 배열에 접근)
//        haruScore[1] = 95;
//        haruScore[2] = 85;


        // 3. 배열 선언, 생성, 초기화(값 할당)를 동시에.

//        int[] haruScore = new int[]{100, 90, 85};   // new int[]{여기 안에 넣어주는 값이 인덱스 값으로 순서대로 지정됨} 그래서 []안에 수를 지정해줄 필요가 없음.
        int[] haruScore = {100, 90, 85};    //new int[]는 생략 가능

        System.out.println("국어 : " + haruScore[0]);
        System.out.println("영어 : " + haruScore[1]);
        System.out.println("수학 : " + haruScore[2]);

        int sum = haruScore[0] + haruScore[1] + haruScore[2];   // 총점       배열은 인덱스 범위 안에 있는 값만 사용하기 (배열 범위를 벗어나면 ArrayIndexOutOfBoundsException 이라는 오류가 뜸)
        double avg = sum / 3.0; // 평균값, 91.66666

        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + avg);

    }
}
