package ch09;

public class ArrayMulti {
    public static void main(String[] args) {
        // 1. 다차원 배열 생성(2행 3열)
        int[][] matrix = new int[3][3];
        matrix[0][1] = 10;
        matrix[1][2] = 20;

        // 2. 다차원 배열 생성 (초기화와 동시)
        int[][] matrix2 = {
                {10, 20, 30},
                {40, 50},
                {70, 80, 90, 100}
        };

        // 3. 배열의 모든 요소를 출력
//        System.out.println(matrix2[0][0]);
//        System.out.println(matrix2[0][1]);
//        System.out.println(matrix2[0][2]);    위 3개에 대한 for문 1개
//        System.out.println(matrix2[1][0]);
//        System.out.println(matrix2[1][1]);
//        System.out.println(matrix2[1][2]);    위 3개에 대한 for문 1개 사용해서 중첩 for문으로 출력

        //for(int i=0; 1<3; i++){
//            System.out.println(matrix2[0][i]);
//        }
//        for(int i=0; 1<3; i++){
//            System.out.println(matrix2[1][i]);
//        }
//    }
//}

//        for (int i=0; i<matrix2.length; i++) {   //행은 2번
//            for (int k=0; k<matrix2[i].length; k++) {   // 열 / k를 matrix2의 i가 입력되어있는만큼 출력
//                System.out.println("i : " + i + ", k : " + k);
//                System.out.println(matrix2[i][k]);  //matrix2[행][열] 출력
//            }
//        }
        for (int[] numArray : matrix2) {    //  3회 반복,  numArray = matrix2[0] 가변배열도 강화된 for문을 이용할 수 있다
            for (int num : numArray) {  // 2, 3, 4 반복
                // 10, 20, 30
                // 40, 50
                // 70, 80, 90, 100
                System.out.println(num);
            }
        }

    }
}


