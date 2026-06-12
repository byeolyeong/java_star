package SoloStudy2;

public class StudyQuiz2 {
    public static void main(String[] args){
        // 어린이 키에 따른 놀이기그 탑승 여부를 확인하는 프로그램을 작성하시오.
        // 키가 120 cm 이상인 경우에만 탑승 가능
        // 삼항 연산자 이용
        // 실행 결과 :
        // 키가 115 cm이므로 탑승이 불가능합니다.
        // 키가 121cm이므로 탑승 가능합니다.

        int a = 115;
        String c = 120 >= a ? "탑승이 가능합니다"  : "탑승이 불가능합니다.";

        int b = 121;
        String d = 120 >= b ? "탑승이 가능합니다"  : "탑승이 불가능합니다.";

        System.out.println("키가 " + b + "cm 이므로 " + c);
        System.out.println("키가 " + a + "cm 이므로 " + d);
    }
}
