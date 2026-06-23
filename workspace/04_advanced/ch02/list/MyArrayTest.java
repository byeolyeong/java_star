package ch02.list;

public class MyArrayTest {
    void main() {
        // 5개의 요소를 담을 수 있는 MyArray 객체를 생성
//        MyArray arr = new MyArray();
        MyList arr = new MyArray(5);

        // MyArray에 "데이터-0"부터 "데이터-4"까지의 문자열을 담는다.(append())
        for(int i=0; i<5; i++){
            arr.add("데이터-" + i);
        }

        // MyArray에 담긴 모든 요소를 출력한다. [데이터-0, 데이터-1... 데이터-4]
        System.out.println("모든 데이터의 값 : " + arr);

        // MyArray에 0번째 요소를 출력한다. 데이터-0 (getElem())
        System.out.println(arr.get(0));

        // MyArray에 3번째 요소를 출력한다. 데이터-3 (getElem())
        System.out.println(arr.get(3));

        // index 2를 삭제한다. (delete)
        arr.remove(2);

        // MyArray에 담긴 모든 요소를 출력한다 [데아터-0, 데이터-1, 데이터-3, 데이터 -4]
        System.out.println("모든 데이터의 값 : " + arr);

        // index 2에 데이터-5를 삽입한다 (append())
        arr.add(2,"데이터-5");

        // MyArray에 담긴 모든 요소를 출력한다 [데이터-0, 데이터-1, 데이터-5, 데이터-3, 데이터 -4]
        System.out.println("모든 데이터의 값 : " + arr);

        // 마지막 위치에 데이터 -6을 추가한다.
        arr.add("데이터-6");

        // MyArray에 담긴 모든 요소를 출력한다 [데이터-0, 데이터-1, 데이터-5, 데이터-3, 데이터-4, 데이터-6]
        System.out.println("모든 데이터의 값 : " + arr);

        // MyArray에 담긴 요소의 개수를 출력한다.
        System.out.println("갯수 : " + arr.size());
    }
}
