package ch14;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        String input = "Hello 123 3.14 Java"; // 토큰 4개
//        String input = "Hello 123 3.14";  // 토큰 3개
//        String input = "Hello 123"; // 토큰 2개
        Scanner scanner = new Scanner(input); // 위 문자열에 대해서 작동을 하는 코드임(토큰 하나씩 읽어줌)

        // 1. next(): 단어 읽기
        System.out.println("첫번째 토큰: " + scanner.next()); // Hello

        // 2. nextInt(): 정수로 읽기
        System.out.println("두번째 토큰: " + scanner.nextInt()); // 123

        // 3. nextDouble(): 실수로 읽기
        System.out.println("세번째 토큰: " + scanner.nextDouble()); // 3.14
        // 더블 값을 달라고 코드를 구현했기때문에, 3번째 토큰이 없으면 에러가 남(Exception in thread)
        // 특정 메서드를 호출했을때 그 메서드가 약속된 결과를 보여주지 못할 때 나는 에러.

        // 4. hasNext(): 다음 읽을 토큰 존재 여부 확인
        if (scanner.hasNext()) {    // if 조건문으로 4번째 토큰으로 꺼낼 내용이 있는지 확인
            System.out.println("네번째 토큰: " + scanner.next()); // Java
        }

        // 5. hasNext(): 다음 읽을 토큰 존재 여부 확인
        if (scanner.hasNext()) {    // if 조건문으로 5번째 토큰으로 꺼낼 내용이 있는지 확인
            System.out.println("다섯번째 토큰: " + scanner.next()); // 토근이 더 없으므로 실행 안됨
        }
    }
}