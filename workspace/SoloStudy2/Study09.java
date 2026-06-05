package SoloStudy2;

public class Study09 {
    public static void main(String[] args){
        // 논리 연산자
        boolean 김치찌개 = true;
        boolean 계란말이 = true;
        boolean 제육볶음 = true;

        // 하나라도 true 이면 true로 결과가 나옴.
        System.out.println(김치찌개 || 계란말이 || 제육볶음);   // || 는 or의 의미를 표헌함
        // 모든 변수들이 true면 true, 하나라도 false면 false로 결과가 나옴
        System.out.println(김치찌개 && 계란말이 && 제육볶음);   // && 는 and의 의미를 표현함

        // And 연산
        System.out.println((5 > 3) && (3 > 1)); // 5는 3보다 크고, 3은 1보다 크다.(true)
        System.out.println((5 > 3) && (3 < 1)); // 5는 3보다 크고, 3은 1보다 작다.(false)

        // Or 연산
        System.out.println((5 > 3) || (3 > 1)); // 5는 3보다 크거나, 3은 1보다 크다. (true)
        System.out.println((5 > 3) || (3 < 1)); // 5는 3보다 크거나, 3은 1보다 작다. (true)
        System.out.println((5 < 3) || (3 < 1)); // 5는 3보다 작거나, 3은 1보다 작다. (false)

//        System.out.println(1 < 3 < 5);    // 이런식으로 하면 에러가 남. 무조건 하나씩 비교해주기.

        // 논리 부정 연산자 : 해당 식의 반대 결과를 보여줌.
        System.out.println(!true);  // false
        System.out.println(!false); // true
        System.out.println(!(5 == 5));  //false
        System.out.println(!(5 == 3));  // true
    }
}
