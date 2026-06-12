package ch05;

public class TypeCastingTest {
    static void main() {
        int a = 2100000000;
//        double b = (double)a;   // 명시적 형변환이 필요 없음.(a를 double로 변환, int >> double) << (double)은 굳이 할 필요가 없음. Java 컴파일러가 알아서 처리해줌
        double b = a;   // 자동 형변환(a가 double로 변환)

        System.out.println(a);
        System.out.println(b);

        double pi = 3.14;
        int p = (int) pi; // 명시적 형변환 필요.(pi를 int로 변환,  double -> int)

        System.out.println(pi);
        System.out.println(p);
    }
}
