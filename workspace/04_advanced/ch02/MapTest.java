package ch02;

import com.sun.source.tree.Tree;

import java.util.*;

public class MapTest {
    void main(){

        // 제네릭 문법을 적용함 <> 활용
//        Map<String, String> fruits = new HashMap<>(); // 가장 가볍고 가장 빠름
//        Map<String, String> fruits = new TreeMap<>();   // 기본키 값으로 오름차순 정렬
        Map<String, String> fruits = new LinkedHashMap<>(); // 키 값 기준 담은 순서 그대로 출력


        fruits.put("월", "바나나");  // ("key","value")
        fruits.put("화", "사과");
        fruits.put("수", "오렌지");
        fruits.put("목", "파인애플");
        fruits.put("수", "수박");
        fruits.put("금", "AppLe");

        String fridayFruit = fruits.get("금").toUpperCase();   // 명시적 형변환.
        System.out.println("금요일에 먹은 과일 : " + fridayFruit);

        printFruits(fruits);    // 배열
    }


    // List, Set, Queue 의 공통 부모 클래스
    void printFruits(Map<String, String> fruits){
        System.out.println("월요일에 먹을 과일 : " + fruits.get("월"));
        System.out.println("월요일에 먹을 과일 : " + fruits.get("수"));

        System.out.println("요일별 모든 과일 출력");
//        for(String key : fruits.keySet()){
//            System.out.println(key + " : " + fruits.get(key));
//        }

        // <String, String> 을 하지 않으면 getKey() 와 getValue()가 Object를 반환하기때문에 명확하게 String으로 받겠다고 지정해주기
        for(Map.Entry<String, String> entry : fruits.entrySet()){
            String key = entry.getKey();
            String fruit = entry.getValue();
            System.out.println(key + " : " + fruit);
        }
    }
}

