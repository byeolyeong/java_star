package SoloStudy3;

public class StudyQuiz3 {
    public static void main(String[] args){
        // 주민등록번호에서 생년월일 및 성별까지만 출력하는 프로그램 작성

        // 주민등록번호는 13자리 숫자로 구성
        // 앞 6자리는 생년월일 정보, 뒷 7자리 중 첫 버째 숫자는 성별 정보
        // 입력 데이터는 - 을 포함한 14자리 문자열 형태

        // 예시
        // 901231-1234567 인 경우 901231-1 까지 출력
        // 030708-4567890 인 경우 030708-4 까지 출력

        String s1 = "901231-1234567";   // 주민등록번호 13자리
        System.out.println(s1.substring(s1.indexOf("9"),s1.lastIndexOf("2")));
        String s2 = "030708-4567890";
        System.out.println(s2.substring(s2.indexOf("0"),s2.indexOf("5")));

        // substring(처음, 끝) : 시작위치를 포함하고, 끝 위치 이전의 문자까지만 출력하는 메서드
        // 1번 해설.
        System.out.println(s1.substring(0,8));  // 0 위치부터 8 위치 직전까지 출력

        // 2번 해설.
        System.out.println(s1.substring(0, s1.indexOf("-") + 2));   // 0위치부터 하이픈 위치 +2 직전까지
    }
}
