package TeamStudy;

import java.util.Scanner;

public class TeamStudy {
    public static void main(String[] args) {

//        // 최대값 출력하기.(회고)
        int[] arr = {8, 3, 15, 2, 9};   // 배열 선언
        int max = arr[0];       // 할당

        for (int i = 1; i < arr.length; i++) {        // for 반복문을 이용한 배열 검사
            if (arr[i] > max) {   // if문을 이용해서 i가 max값보다 커지면 max값을 i로 변경하는 조건 부여
                max = arr[i];   // i값이 max와 같아야함
            }
        }

        System.out.println(max);    // 최대값 출력

        // 원하는 숫자 찾기

        System.out.println("배열 안에서 원하는 숫자 찾기");
        int[] arr1 = {5, 8, 2, 10, 7};
        System.out.println("숫자를 입력하세요.");

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        for (int j = 0; j < arr.length; j++) {
            if (num == arr1[j]) {
                System.out.println("해당 숫자는 " + j + "에 있습니다.");

            } else {
                System.out.println("해당 숫자를 " + j + "에서 찾을 수 없습니다.");
            }
        }


        //중복되지 않은 숫자 찾기.(힌트 이중 반복분)
        int[] arr3 = {1, 1, 2, 3, 4, 5, 5, 6};
        for(int k=0; k!=arr3.length; k++){
            if(arr3[k] != arr3[k+1]) {
                k++;
                System.out.println("중복된 숫자의 개수는 " + k + "입니다.");
            }else {
                System.out.println("중복되지 않은 숫자의 개수는 " + k + "입니다.");
            }
        }


        // 빈도수 구하기
        int[] num2 = {9,5,4,2,5,7,9,2,5,0}; // num2 배열 생성
        int[] count = new int[10];  // count 배열 생성
        for(int i=0; i< count.length; i++){     // for문을 이용한 반복문
            int n = num2[i];    // 숫자 저장
            count[n]++;
        }
        for(int i=0; i< count.length; i++){
            System.out.println(i + "의 개수 : " + count[i]);
        }


        // 4명의 학생 각각의 국어, 영어, 수학 점수가 들어있습니다. 이 중 평균 점수가 80점 이상인 학생의 '점수 데이터 전체'만 따로 뽑아서 새로운 2차원 배열에 순서대로 복사해 넣고 출력하세요.

        int[][] scores = {
                {85, 90, 65},
                {75, 100, 80},
                {95, 80, 70},
                {60, 65, 90}
        };

        for(int i=0; i< scores.length; i++){
            for(int k=0; k> scores[i].length; i++){

            }
        }

    }
}



