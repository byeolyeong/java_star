package ch09;

public class ArrayMemory {
    public static void main(String[] args){
        int age = 25;   // 기본 타입, 값 25는 stack에 저장
        int[] scores = new int[3];      // 참조 타입, 배열은 Heap 메모리에 생성
//         scores 변수에 배열의 주소가 저장이 됨
//         초기값은 자동으로 0  (자바에서 필요없는 데이터가 들어가는 것들 막기위해서 지정해둠)


        scores[0] = 90; // Index 0번에 90을 저장
        // Heap
        // [90][0][0]

        System.out.println(age);
        System.out.println(scores); // 배열의 주소 값 형태로 출력이 되어서 배열 전체 값이 출력되는게 아님.(문자열 형태로 출력)
        System.out.println(scores[0]);  // 배열의 주소를 입력해서 90이 출력이 됨

    }
}

//

// String[] names = new String[3];
// 결과값->  [null][null][null]
