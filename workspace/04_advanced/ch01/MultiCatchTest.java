package ch01;

public class MultiCatchTest {
    void main(String[] args) {
        divide4(100, new String[] {" hello  "}); // 정상
        divide4(100, new String[] {"   "});  // 문자없이 공백만 보내주었을때 ArithmeticException
        divide4(100, new String[] {});   // 배열을 비운 상태로 보내주었을때 ArrayIndexOutOfBoundsException
        divide4(100, new String[] {null});
        divide4(100, null);

        System.out.println("프로그램 종료");
    }

    // num1을 arr배열의  index 0 값을 꺼내서 앞뒤 공백을 제거한 후 문자열의 길이로 나눈 결과를 출력
    void divide(int num1, String[] arr){
        try{
        int num2 = arr[0].trim().length(); // str이 null일 경우 NullPointerException 발생
        int result = num1 / num2; // str이 ""일 경우 ArithmeticException 발생
        System.out.println(num1 + " / " + num2 + " = " + result);
        }catch(ArithmeticException | NullPointerException e){
            System.out.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("arr 사이즈가 0입니다.");
        }
    }

    void divide2(int num1, String[] arr){
        try{
            int num2 = arr[0].trim().length(); // str이 null일 경우 NullPointerException 발생
            int result = num1 / num2; // str이 ""일 경우 ArithmeticException 발생
            System.out.println(num1 + " / " + num2 + " = " + result);
        }catch (ArrayIndexOutOfBoundsException e){    // 위에서 에러를 잡아주기 위해 올려주기.
            System.out.println("arr 사이즈가 0입니다.");
        }catch(Exception e){    // NullPointerException 과 ArithmeticException의 상위 클래스(Exception)이기때문에 전달이 가능함.
            System.out.println(e.getMessage()); // getMessage는 Throwable이라는 최상위 클래스임.
            //위 구문은 다형성이 적용된 구문(아들 클래스 >> 부모 클래스로 지정됨)

//        }catch (ArrayIndexOutOfBoundsException e){    // 이미 catch(Exception e) 부분에서 캐치 되었기때문에 여기에 작성하면 오류남.
//            System.out.println("arr 사이즈가 0입니다.");
        }
    }

    // num1을 arr배열의  index 0 값을 꺼내서 앞뒤 공백을 제거한 후 문자열의 길이로 나눈 결과를 출력
    void divide3(int num1, String[] arr) {
        try {
            int num2 = arr[0].trim().length(); // str이 null일 경우 NullPointerException 발생, arr가 빈 배열인 경우 ArrayIndexOfBoundsException 에러가 발생
            int result = num1 / num2; // str이 ""일 경우 ArithmeticException 발생
            System.out.println(num1 + " / " + num2 + " = " + result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // num1을 arr배열의  index 0 값을 꺼내서 앞뒤 공백을 제거한 후 문자열의 길이로 나눈 결과를 출력
    void divide4(int num1, String[] arr) {
        if(arr != null && arr.length > 0 && arr[0] != null && arr[0].trim().length() > 0){
            int num2 = arr[0].trim().length(); // str이 null일 경우 NullPointerException 발생, arr가 빈 배열인 경우 ArrayIndexOfBoundsException 에러가 발생
            int result = num1 / num2; // str이 ""일 경우 ArithmeticException 발생
            System.out.println(num1 + " / " + num2 + " = " + result);
        }
    }
}

