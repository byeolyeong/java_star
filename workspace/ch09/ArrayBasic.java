package ch09;

public class ArrayBasic {
    public static void main(String[] args) { // main 매서드의 String[] 배열 / 매서드 내에서 만들어지는 코드들이 지역변수라고 함
        // scores int 배열을 선언하고 생성하세요.(크기는 3)
        int[] scores = new int[3];

        // names String 배열을 선언하고 생성하세요.(크기는 3)
//        String[] names = new String[3];
        String[] names = new String[5];

        // scores 배열의 각 요소에 값을 할당
        scores[0] = 1;
        scores[1] = 2;
        scores[2] = 3;

        // names 배열의 각 요소에 값을 할당
        names[0] = "하나";
        names[1] = "둘";
        names[2] = "셋";
        names[3] = "넷";
        names[4] = "다섯";
        // scores 배열의 두 번째 요소값을 출력
        System.out.println("scores 두번째 요소값 : " + scores[1]);

        // names 배열의 모든 요소값을 출력
//        System.out.println("names 첫번째 요소값 : " + names[0]);
//        System.out.println("names 두번째 요소값 : " + names[1]);
//        System.out.println("names 세번째 요소값 : " + names[2]);
//        System.out.println("names 네번째 요소값 : " + names[3]);
//        System.out.println("names 다섯번째 요소값 : " + names[4]);

        for (int i = 0; i < names.length; i++) {        // 공식임 한 줄 통째로 외우는게 좋음
            System.out.println(names[i]);       // i = 0 names[0] = 나무, i = 1 names[0] = 나무, ....
        }
    }
}
