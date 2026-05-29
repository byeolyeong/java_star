package ch09;

public class ArrayException {
    public static void main(String[] args){
        // 1. NullPointerException
        String[] strArr = {"haru", "namu", "brong"};
        System.out.println(strArr[0]);

        int[] ageArr = null;    // 이렇게 하면  NullPointerException이 뜸
//        int[] ageArr = new int[3];

        if(ageArr != null){
            System.out.println(ageArr[0]);
        }

        System.out.println("main 실행 완료.");

        // 2. ArrayIndexOutOfException
        if(strArr.length > 3){
            System.out.println(strArr[3]);
        }

        System.out.println("main 실행 완료.");
    }
}
