package SoloStudy3;

public class Study12 {
    public static void main(String[] args){
        // 나도 코딩 chap 5 - 26 문자열 비교
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2));  // s1 과 s2의 내용이 같으면 true, 아니면 false (false)
        System.out.println(s1.equals("Java"));  //s1의 문자와 Java라는 내용이 같은지 비교 (true)
        System.out.println(s2.equalsIgnoreCase("python")); // 대소문자 구분 없이 문자열이 같은지 확인(true)

        // 문자열 비교 심화
        // Java에서 내용을 비교할 때는 비교 연산자(==)이 아닌, equals()를 사용해야함.

        // 메모리의 어떤 공간에 1234 라는 데이터가 저장되있음.
        s1 = "1234";    // 벽에 붙은 메모지의 비밀번호 정보 (참조)
        // 1234 데이터가 있는 곳에 있는 데이터를 그대로 씀
        s2 = "1234";
        System.out.println(s1.equals(s2));  // true (내용을 비교)
        System.out.println(s1 == s2);   // true (참조를 비교)

        s1 = new String("1234"); // s1과 s2가 참조하는 데이터 공간이 서로 다름.
        s2 = new String("1234");
        System.out.println(s1.equals(s2));  // true (내용을 비교했을때는 같음.)
        System.out.println(s1 == s2);   // false (참조하는 공간을 비교를 했을 때 다르기 때문에 결과는 false)
    }
}
