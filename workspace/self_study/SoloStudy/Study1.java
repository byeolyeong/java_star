package SoloStudy;

public class Study1 {
    // 나도 코딩 chap 3 - 8~10 자료형, 변수
    public static void main(String[] args){

        //        int, long, float, double, char, String, boolean
        String name = "나도 코딩";
        int hour = 15;


        System.out.println(name + ", 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + " , 배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A';       // '' < 여기엔 한 글자만 들어감
        name = "윤승영";       // name 이라는 변수의 값을 수정해줌
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;    // 참, 거짓
        System.out.println("이번 시험에 합격하셨을까요?" + pass);

        double d = 3.141592;
        float f = 3.14123456789F;    // float은 float자료형으로 만들어주기 위해서 변수 값 뒤에 f를 붙여주어야 함.
        System.out.println(d);
        System.out.println(f);      //  float은 소수 6자리까지는 정확하게 나오지만, 그 이후의 자리는 반올림을 해서 출력이 됨.

        long l = 1000000000000l;    // int보다 큰 범위를 가진 long은 long자료형으로 만들어주기 위해서 변수 값 뒤에 l을 붙여줘야함
        l = 1_000_000_000_000l;     // 눈으로 보기 편하게 하기 위해서 해준 것이기 때문에 출력이 되진 않음.
        System.out.println(l);


    }
}
