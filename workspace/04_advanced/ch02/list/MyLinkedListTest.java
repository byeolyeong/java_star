package ch02.list;

public class MyLinkedListTest {
    void main() {
        // MyLinkedList 객체를 생성한다
        MyList arr = new MyLinkedList();

        // MyArray에 "데이터-0"부터 "데이터-4"까지의 문자열을 담는다.(appendTo())
        for(int i=0; i<5; i++){
            arr.add("데이터-" + i);
        }

        // MyLinkedList에 담긴 모든 요소를 출력한다. [데이터-0, 데이터-1... 데이터-4]
        System.out.println("모든 데이터의 값 : " + arr);

        // MyLinkedList에 0번째 요소를 출력한다. 데이터-0 (get())
        System.out.println(arr.get(0));

        // MyLinkedList에 3번째 요소를 출력한다. 데이터-3 (get())
        System.out.println(arr.get(3));

        // index 2를 삭제한다. (delete)
        arr.remove(2);

        // MyLinkedList에 담긴 모든 요소를 출력한다 [데아터-0, 데이터-1, 데이터-3, 데이터 -4]
        System.out.println("모든 데이터의 값 : " + arr);

        // index 2에 데이터-5를 삽입한다 (appendTo())
        arr.add(2,"데이터-5");

        // MyLinkedList에 담긴 모든 요소를 출력한다 [데이터-0, 데이터-1, 데이터-5, 데이터-3, 데이터 -4]
        System.out.println("모든 데이터의 값 : " + arr);

        // 맨 앞에 위치에 데이터-6을 추가한다.(appendTo())
        arr.add("데이터-6");
//        arr.addFirst("데이터-6");

        // MyLinkedList에 담긴 모든 요소를 출력한다 [데이터-0, 데이터-1, 데이터-5, 데이터-3, 데이터-4, 데이터-6]
        System.out.println("모든 데이터의 값 : " + arr);

        // MyLinkedList에 담긴 요소의 개수를 출력한다.
        System.out.println("갯수 : " + arr.size());
    }
}
