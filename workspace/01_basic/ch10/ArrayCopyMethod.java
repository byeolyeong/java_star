package ch10;

import java.util.Arrays;

public class ArrayCopyMethod {

    // 전달받은 배열의 모든 요소를 출력하는 메서드
    static void printArr(int[] arr, String name){
        System.out.print(name + " : ");
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
//        for(int elem : arr){
//            System.out.println(elem + " ");
//        }
        System.out.println();
    }

    // 원본 배열과 복사 배열을 출력한 후 값을 수정하고 다시 출력한다
    static void testArr(int[] original, int[] shallow){
        // original, shallow의 모든 요소를 출력
        printArr(original, "원본 배열");
        printArr(shallow, "복사 배열");

        //shallow[0] 값을 수정
        shallow[0] = 99;
        original[0] = 88;

        // original, shallow의 모든 요소를 출력
        printArr(original, "원본 배열");
        printArr(shallow, "복사 배열");
    }



    public static void main(String[] args){

        int[] original = {10, 20, 30, 40, 50};  // 원본 배열

        System.out.println(" ---- 1. 얕은 복사 ---- ");
        // 1. 얕은 복사(Shallow Copy)
        int[] shallow = original;   // original의 주소를 복사해 shallow에 넣음

        testArr(original,shallow);

        // 2. 깊은 복사 - 수동 복사(for 문 사용)
        System.out.println(" ---- 2. 깊은 복사 - 수동 복사(for 문 사용) ---- ");
        original = new int[]{10, 20, 30, 40, 50};
        shallow = new int[original.length];

        // 원본 배열의 각 요소를 복사해서 복사본에 지정
        for(int i=0; i< original.length; i++){
            shallow[i] = original[i];
        }

        testArr(original,shallow);

        // 3. 깊은 복사 (System.arraycopy() 이용)       // 해당 부분 회고시간 보충 설명듣기
        System.out.println(" ---- 3. 깊은 복사 (System.arraycopy() 이용 ----");
        original = new int[]{10, 20, 30, 40, 50};
        shallow = new int[original.length];

        // original 배열의 index 0뷰터 끝까지 shallow 에 복사
        System.arraycopy(original, 0, shallow, 0, original.length); // 배열 복사하는 매서드

        testArr(original,shallow);

        // 4. 깊은 복사 (Arrays.copyOf() 이용)
        System.out.println(" ---- 4. 깊은 복사 (Arrays.copyOf() 이용 ----");
        original = new int[]{10, 20, 30, 40, 50};
        shallow = Arrays.copyOf(original, original.length);

        testArr(original,shallow);
    }
}
