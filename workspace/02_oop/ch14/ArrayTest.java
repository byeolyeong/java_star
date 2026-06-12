package ch14;

import java.util.Arrays;

class ResizableArray {
    private String[] elements;  // class를 만들때는 private이 기본값
    private int size;   //

    // 초기 용량을 전달해서 객체를 생성
    public ResizableArray(int initialCapacity) {
        elements = new String[initialCapacity];
        size = 0;
    }

    // 배열의 마지막에 해당 요소를 추가한다.
    public void add(String elem) {
        // 배열의 크기가 다 찼으면 2배 크기로 증가
        if (size == elements.length) {    // 만약 size가 배열과 같을때 배열을 늘려라
            // 배열 늘리기(기존 크기의 2배)
            String[] tempList = new String[elements.length * 2];    // 기존 배열의 2배 큰 배열을 생성
            for (int i = 0; i < elements.length; i++) {
                tempList[i] = elements[i];
            }
            elements = tempList;
        }
        elements[size++] = elem;  // elem 을 elements[]에 담아줌
        // elements[size++] 랑 size++; 같기 때문에 아랫줄에 size++을 작성해도 됨.
    }

    public String get(int index) {
        return elements[index];
    }

    public String toString() {
        return Arrays.toString(elements);
    }
}

public class ArrayTest {
    public static void main(String[] args) {
        // 배열 생성
        ResizableArray list = new ResizableArray(2);


        // 배열에 데이터 추가
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Orange");
        list.add("Orange");


        System.out.println("인덱스 1의 요소 : " + list.get(1));
        System.out.println(list);
    }
}

