package ch09;

public class Practice {
    public static void main(String[] args){

//        // 최대값 출력하기.(회고)
        int[] arr = {8, 3, 15, 2, 9};   // 배열 선언
        int max = arr[0];       // 할당

        for(int i=1; i<arr.length; i++){        // for 반복문을 이용한 배열 검사
            if(arr[i] > max){   // if문을 이용해서 i가 max값보다 커지면 max값을 i로 변경하는 조건 부여
                max = arr[i];   // i값이 max와 같아야함
            }
        }

        System.out.println(max);    // 최대값 출력

        // 원하는 숫자 찾기
    }

}

