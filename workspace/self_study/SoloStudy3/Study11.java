package SoloStudy3;

public class Study11 {
    // 나도 코딩 chap 5 - 24~25 문자열
    public static void main(String[] args) {
        String s = "I like Java and Python and C."; // 드래그를 하고 오른쪽 아래를 보면 줄번호 : 글자수 로 적혀있음
        System.out.println(s);

        // 문자열의 길이
        System.out.println(s.length()); // 29 (length를 이용한 문자열의 길이 확인)

        // 대소문자 변환
        System.out.println(s.toUpperCase());    // toUpperCase() 는 모든 문자를 대문자로 변환해줌
        System.out.println(s.toLowerCase());    // toLowerCase() 는 모든 문자를 소문자로 변환

        // 포함 관계
        System.out.println(s.contains("Java")); // 포함이 되면 true,
        System.out.println(s.contains("C#"));   // 포함이 되지 않으면 false
        System.out.println(s.indexOf("Java"));  // 위치정보 7   (Java라는 글자의 시작 위치 정보를 알려줌)
        System.out.println(s.indexOf("C#"));    // 위치정보가 포함되지 않으면 -1
        System.out.println(s.indexOf("and"));   // 처음 일치하는 위치 정보(12)
        System.out.println(s.lastIndexOf("and"));   // 마지막으로 일치하는 위치 정보(23)
        System.out.println(s.startsWith("I like")); // 이 문자열로 시작하면 true (아니면 false)
        System.out.println(s.endsWith("."));    // 이 문자열로 끝나면 true(아니면 false)


        String s1 = "I like Java and Python and C.";

        // 문자열 반환
        System.out.println(s1.replace(" and",","));  // s1의 and를 ,로 변환
        System.out.println(s.substring(7)); // 인덱스 기준 7부터 시작 (이전 내용은 삭제)
        System.out.println(s.substring(s.indexOf("Java"))); // s.indexOf로 Java라는 글자를 찾은 후 Java부터 내용이 출력됨
        // "Java" 가 시작하는 위치부터 "." 이 시작하는 위치 바로 앞까지
        System.out.println(s.substring(s.indexOf("Java"),s.indexOf(".")));    // 시작 위치 부터 끝 위치 "직전"까지

        // 공백 제거
        s = "      I love Java.      ";
        System.out.println(s);
        System.out.println(s.trim());   // 앞뒤 공백 제거

        // 문자열 결합
        String s2 = "Java";
        String s3 = "Python";
        System.out.println(s2 + s3);    // JavaPython
        System.out.println(s2 + ", " + s3); // Java,Python
        System.out.println(s2.concat(",".concat(s3)));  // Java,Python
    }
}
