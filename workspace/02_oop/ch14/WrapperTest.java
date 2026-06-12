package ch14;

public class WrapperTest {
    public static void main(String[] args) {
        // 1. parseInt(), parseDouble(), parseBoolean() 등 문자열 파싱
        int num1 = Integer.parseInt("100"); // 가장 많이 사용함.
        double num2 = Double.parseDouble("3.14");
        boolean bool = Boolean.parseBoolean("true");

        System.out.println(num1); // 100
        System.out.println(num2); // 3.14
        System.out.println(bool); // true

        // 2. valueOf(): 기본 타입을 래퍼 객체로 변환
        Integer wrapperInt = Integer.valueOf(500);
        System.out.println(wrapperInt); // 500

        // 3. 오토 박싱과 오토 언박싱
        Integer boxedNum = 200; // 오토 박싱
        int unboxedNum = boxedNum; // 오토 언박싱
        System.out.println(unboxedNum); // 200

        // 배열은 어떤 타입의 데이터를 저장할 때 선언하기 때문에
//        String[] aArr = {"Hello", "Java"};
//        int[] Arr = {1, 2, 6, 7};

        // 숫자와 문자를 동시에 배열 선언을 하고싶을때 Object[] 배열을 선언하면 같이 선언이 가능함
//        Object[] oArr = {1, 3, 5, "Hello", "Java"};
        Object[] oArr = {"Hello", "Java",  new Integer(100)};
        String elem1 = (String)oArr[0]; // Object[]에 0번 인덱스를 꺼내서 사용할때 Object가 나와서 명시적 형변환을 해줘야함
        // 이러한 이유때문에 Object[] 를 잘 사용하지 않음.(= 꺼내서 사용하기 귀찮음)
    }
}