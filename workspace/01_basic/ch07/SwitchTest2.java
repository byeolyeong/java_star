package ch07;

// 회원 등급에 따라서 할인 혜택을 적용하는 예제    [LMS(마지막 프로젝트)에 해당 기능을 포함할 수 있음.]
// A. 골드 등급 : 50% 할인
// B. 실버 등급 : 30% 할인
// C. 브론즈 등급 : 10% 할인
// D. 일반 등급 : 0% 할인
public class SwitchTest2 {
    public static void main(String[] args) {
        int price = 10000;      // 정상가
        char grade = 'C';       // 회원 등급    대소문자 구별하기 때문에 맞춰서 작성하기.
        int discountRate = 0;   // 할인율(%)
        int lastPrice = price;  // 할인가


        //  if문 사용
        if (grade == 'A') {
            discountRate = 50;                                          // price * 1 - discountRate / 100; 으로 하면 소수점은 버리는 식이 되기 때문에,
                                                                        // (int)로 명시적 형변환을 시켜서 할인율 적용가로 계산 시켜주기
        } else if (grade == 'B') {
            discountRate = 30;
        } else if (grade == 'C') {
            discountRate = 10;
        } else if (grade == 'D') {
            discountRate = 0;
        }

        //  switch문 사용      if문을 쓰든, case를 쓰든 본인 자유
        switch (grade) {
            case 'A':       // grade == 'A'
                discountRate = 50;
                break;
            case 'B':       // grade == 'B'
                discountRate = 30;
                break;
            case 'C':       // grade == 'C'
                discountRate = 10;
                break;
            case 'D':       // grade == 'D'
                discountRate = 0;
                break;

        }

        lastPrice = (int) (price * (1 - discountRate / 100.0));     // if문에서 반복적으로 사용되는 코드이기 때문에 마지막으로 옮기기. (중복된 코드는 최대한 만들지 않기)

//                          "" 안에 완성형 문자를 만든 후, 변수를 넣어줘야하는 부분을 드래그를 하고 "를 입력하면 편하게 수정이 가능해짐.
        System.out.println("회원님은 " + grade + "등급이므로 정상가 " + price + "원에서 " + discountRate + "% 할인된 가격 " + lastPrice + "원 입니다.");
    }
}
