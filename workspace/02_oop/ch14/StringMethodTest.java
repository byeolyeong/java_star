package ch14;

public class StringMethodTest {
    public static void main(String[] args) {
        //문자열 비교는 비교연산자(==)이 아닌 equals를 사용해야함.
        String str = "Hello Java";

        // 1. length(): 문자열의 길이 조회
        System.out.println(str.length()); // 10

        // 2. charAt(): 특정 인덱스의 문자 조회
        System.out.println(str.charAt(6)); // J

        // 3. substring(): 부분 문자열 추출
        // 6번 인덱스부터 10번 인덱스 직전까지(인덱스의 시작은 0부터)
        System.out.println(str.substring(6, 10)); // Java
        // 4번 인덱스부터 끝까지
        System.out.println(str.substring(4)); // o Java

        // 4. equals(): 문자열 내용 비교(대소문자 하나만 틀려도 false)
        System.out.println(str.equals("Hello Java")); // true

        // 5. indexOf(): 특정 문자열이 시작되는 인덱스 반환
        System.out.println(str.indexOf("Java")); // 6
        System.out.println(str.indexOf("자바")); // -1    위치 정보가 없으면 -1의 값으로 표현됨

        // 6. replace(): 문자열 일부 치환
        System.out.println(str.replace("Java", "자바")); // Hello 자바

        // 원본 문자열은 불변
        System.out.println(str); // Hello Java

        // 7. split(): 구분자를 기준으로 문자열 분할
        String str2 = "Hello Java Programming"; // 인덱스[0] = Hello / 인덱스[1] = Java / 인덱스[2] = Programming
        String[] words = str2.split(" ");
        System.out.println(words[0]); // Hello
        System.out.println(words[1]); // Java
        System.out.println(words[2]); // Programming

        // 8. toLowerCase(): 소문자로 변환
        System.out.println(str.toLowerCase());

        // 9. toUpperCase() : 대문자로 변환
        System.out.println(str.toUpperCase());

        // 10. str에 "java" 문자열이 나오는 인덱스를 출력하시오(6을 출력)
        // 단, 대소문자는 구분하지 않습니다.
        System.out.println(str.toLowerCase().indexOf("java".toLowerCase()));  // 연달아서 사용할 수가 있음.
        System.out.println(str.toLowerCase().indexOf("Java".toLowerCase()));
        System.out.println(str.toLowerCase().indexOf("jaVA".toLowerCase()));

        // 11. trim() : 문자 앞 뒤의 공백을 제거
        String str3 = "       Hello World Java        ";
        System.out.println("[ " + str3 + " ]");
        System.out.println(str3.trim());

        // 12. 문자열이 "Hello" 로 시작하는가? true
        // startsWith() : 문자열이 입력한 값으로 시작되는지 true, false 로 알려줌.
        System.out.println(str.indexOf("Hello") == 0 ? true : false);
        System.out.println(str.startsWith("Hello"));    // 위 코드와 같은 코드임.

        // 13. "Hello Hello ..." 1000개로 이루어진 문자열 생성
        String str4 = "";
        for(int i=0; i<10; i++){
            str4 = str4 + "Hello ";
        }
        System.out.println(str4);
    }
}
