package ch08;

public class ForTest5 {
    public static void main(String[] args) {
//        star1();        //star1 이라는 매서드를 호출.
//        star2();
//        star3();
        star4();
    }

    // *
    // **
    // ***
    // ****
    // *****
//    static void star1() {
//        for(int i = 0; i < 1; i++){
//            System.out.print("*");
//        }
//        System.out.println();
//
//        for(int i = 0; i < 2; i++) {
//            System.out.print("*");
//        }
//        System.out.println();
//
//        for(int i = 0; i < 3; i++) {
//            System.out.print("*");
//        }
//        System.out.println();
//
//        for(int i = 0; i < 4; i++) {
//            System.out.print("*");
//        }
//        System.out.println();
//
//        for(int i = 0; i < 5; i++) {
//            System.out.print("*");
//        }
//        System.out.println();
//    }


    // *
    // **
    // ***
    // ****
    // ***** .. ** ( 50개 )

//    static void star2() {
        // 중첩 for문          보충 설명들어보기
//        for (int i = 0; i < 50; i++){
//            for(int k = 0; k < i+1; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

    // *****
    // ****
    // ***
    // **
    // *
//    static void star3() {
//        for (int i = 0; i < 5; i++) {
//            for (int k = 0; k < 5 - i; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

//        *
//       **
//      ***
//     ****
//    *****

    static void star4() {
        for (int i = 0; i < 5; i++) {
            for (int k = 0; k < (5 - 1 - i); k++) {   // 스페이스( )를 출력하는 부분
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {  // *을 출력하는 부분
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
