package SoloStudy;

public class Study5 {
    public static void main(String[] args){
        // 형변환
        // 정수형에서 실수형으로
        // 실수형에서 정수형으로


        // int to double
        int score = 93;
        System.out.println(score);
        System.out.println((double)score);  // 변수 앞에 (double)을 붙여줌으로써 정수를 실수로 형변환 시킴.

        // float, double to int
        float score_f = 93.3F;
        double score_d = 85.5;
        System.out.println((int)score_f);
        System.out.println((int)score_d);

        // 정수, 실수 연산
        score = 93 + (int)98.8; // 93 + 98
        System.out.println(score);

        score_d = (double)93 + 98.8;    // 자동 형변환이 되어서 93 앞에 double을 붙일 필요가 없음
        System.out.println(score_d);

        // 변수에 형변환 된 데이터 넣기
        double convertedScoreDouble = score;    // 191 > 191.0
        // int > long > float > double  (자동 형변환)

        int convertedScoreInt = (int)score_d;    // 191.8 -> 191
        // double > float > long > int 로 형변환 할땐 수동 형변환

        // 숫자를 문자열로
        String s1 = String.valueOf(93);
        s1 = Integer.toString(93);
        System.out.println(s1);

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2);

        // 문자열을 숫자로
        int i = Integer.parseInt("93");    // ()안에 들어있는 문자열을 정수로 변환해 i에 넣어줌
        System.out.println(i);
        double d = Double.parseDouble("98.8");
        System.out.println(d);

//        int error = Integer.parseInt("자바"); // 문자열을 정수로 바꿔줄때 문자를 넣으면 에러가 걸림
    }
}
