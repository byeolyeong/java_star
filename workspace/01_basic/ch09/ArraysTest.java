package ch09;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args){
        int[] arr = {3,6,7,8,5,3,5,6,8,2,3};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {2, 1, 3};
        int[] arr4 = {1, 2, 3};
        // 1. arr의 모든 요소를 출력하세요.
        // 3,6,7,8,5,3,5,6,8,2,3
        for(int i=0; i<arr.length; i++){    // 배열의 모든 요소는 해당 코드가 공식임.
//            System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr));       // Arrays.toString << 이 부분은 타이핑치다가 선택을 해줘야함.
        // Arrays.toString : 배열을 문자열로 변환하는 매서드.

        // 2. arr3 와 arr4의 모든 요소가 같은 값을 가지고 있는지 출력하세요.
        // arr2, arr3 다름
        // arr2, arr4 같음
//        System.out.println(arr2 == arr3);   //false 주소가 서로 다르기 때문에 해당 코드로는 false가 나타남.
//        System.out.println(arr2 == arr4);   //false

//        boolean isEqual = true; // 두 배열의 모든 요소가 같으면 true, 아니면 false (처음에 같다고 설정을 한 후)
//        for(int i=0; i<arr2.length; i++){
//            if(arr2[i] == arr3[i]){ // 어느 하나가 같냐고 물어보고
//                isEqual = false;    // 하나라도 틀리면 실행하지않음(false)
//                break;
//            }
//        }
//        System.out.println("arr2, arr3 " + (isEqual ? "같음" : "다름"));
//
//        isEqual = true; // 두 배열의 모든 요소가 같으면 true, 아니면 false (처음에 같다고 설정을 한 후)
//        for(int i=0; i<arr2.length; i++){
//            if (arr2[i] == arr4[i]) { // 어느 하나가 같냐고 물어보고
//                isEqual = false;    // 하나라도 틀리면 false
//                break;
//            }
//        }
//        System.out.println("arr2, arr4 " + (isEqual ? "같음" : "다름"));

        System.out.println("arr2, arr3 " + Arrays.equals(arr2, arr3));  // 두 배열에 대한 요소가 완전히 동일한 값인지 체크함
        System.out.println("arr2, arr3 " + Arrays.equals(arr2, arr4));






        // 3. arr 요소의 최소값과 최댓값을 구하세요.(어려움)
        // 최소값 : 2
        // 최대값 : 8
        int min = arr[0];
        int max = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){       // 비교할 값이 최소값보다 작을 경우
                min = arr[i];       // 최소값을 교체한다.
            }
            if(arr[i] > max){       // 비교할 값이 최대값보다 작을 경우
                max = arr[i];       // 최대값을 교체한다.
            }
        }

//        System.out.println("최소값 : " + min);
//        System.out.println("최대값 : " + max);

        Arrays.sort(arr);
        System.out.println("최소값 : " + arr[0]);
        System.out.println("최대값 : " + arr[arr.length-1]);

        // 4. arr의 요소를 오름차순으로 정렬하세요.(어려움)
        // int[] arr = {3,6,7,8,5,4,5,6,8,2,3}
        // 2,3,3,3,5,5,6,6,7,8,8
//        for(int i=0; i<arr.length; i++){
//            for(int k=i; k<arr.length-1; k++){      // int k=0
//                // arr[k+1]로 인해 인덱스를 벗어나기 때문에 arr.length-1 을 해줘야 인덱스 값을 안벗어남
//                if(arr[i] > arr[k+1]){
//                    //arr[i] <-> arr[k+1]
//                    int temp = arr[i];
//                    arr[i] = arr[k+1];
//                    arr[k+1] = temp;
//                }
//            }
//        }

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
