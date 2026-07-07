package ch07;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorJUnitTest {
    private static Calculator calc;

    @BeforeAll  // 전체 테스트에서 딱 한번만 초기화 할 작업이 있다면 BeforeAll을 사용하고 static 클래스가 되어야함
    static void setUp(){
        calc = new Calculator();
    }

//    @BeforeEach   // 각 테스트에서 한번씩 초기화 하고싶으면 BeforeEach
//    void setUp(){
//        calc = new Calculator();
//    }

    @Test
    @DisplayName("두 정수의 덧셈 검증 2, 3")
    void add(){
        int result = calc.add(2, 3);
        assertEquals(5, result, "덧셈의 결과는 5여야 함");
    }

    @Test
    @DisplayName("두 정수의 덧셈 검증 3, 4")
    void add_3_4(){
        int result = calc.add(3, 4);
        assertEquals(7, result, "덧셈의 결과는 7이어야 함.");
    }

    @Test
    @DisplayName("두 정수의 나눗셈 검증 10, 6")
    @Disabled   // 테스트 대상에서 제외
    void divide(){
        double result = calc.divide(10, 6);    // 소수 셋째자리에서 반올림
        assertEquals(1.67, result, "10/6은 1.67이 되어야 함");
    }

    @Test
    @DisplayName("0으로 나누기 테스트")
    void divide_byZero(){
        assertThrows(ArithmeticException.class, () -> { // 클래스 객체, 함수형 인터페이스(람다식) 보내주기
            calc.divide(10,0);
        });
    }
}
