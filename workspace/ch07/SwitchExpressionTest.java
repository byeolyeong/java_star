package ch07;

public class SwitchExpressionTest {
    public static void main(String[] args){
        String role = "USER";   //문자열은 String 타입으로 선언
        switch (role){
            case "ADMIN":
                System.out.println("관리자 권한.");
                break;
            case "USER":
                System.out.println("일반 사용자 권한.");
                break;
            default:
                System.out.println("권한 없음.");
                break;
        }


//        switch expression 방식
        switch (role){
            case "ADMIN" -> System.out.println("관리자 권한");
            case "USER" -> System.out.println("일반 사용자 권한");
            default -> System.out.println("권한 없음");
        }

        String result = switch (role){          // 설명 다시 듣기.
            case "ADMIN" -> "관리자 권한";
            case "USER" -> "일반 사용자 권한";
            default -> "권한 없음";
        };  // 세미콜론을 붙여줘야함. // 설명 다시 듣기
        System.out.println(result);


        String day = "목요일";
        String type = switch (day){
            case "월요일", "화요일", "수요일", "목요일", "금요일" -> "평일";
            case "토요일", "일요일" -> "주말";
            default -> "잘못된 요일";
        };
        System.out.println(type);

        int score = 90;
        String grade = switch(score){
            case 100, 90 -> {
                System.out.println("훌룡한 성적입니다.");
                yield "A";      // 결과값 이외의 다른 텍스트를 하나 추가를 하고싶을때 텍스트를 넣은 후 yield 를 사용해서 최종 결과를 기입해준다.
            }
            case 80 -> "B";     // 결과값만 지정해줌
            case 70 -> "C";
            case 60 -> "D";
            default -> "F";
        };
        System.out.println("학점 : " + grade);

    }
}
