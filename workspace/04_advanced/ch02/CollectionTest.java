package ch02;

import java.util.*;

public class CollectionTest {
    void main(){
//        String[] fruits = new String[5];
//        fruits[0] = "바나나";
//        fruits[1] = "사과";
//        fruits[2] = "오렌지";
//        fruits[3] = "파인애플";
//        fruits[4] = "수박";

//        바나나
//        사과
//        오렌지
//        파인애플
//        수박
//        사과


        // List
        // 데이터 중복 가능
        // 순서 정보 유지
        // 3개 다 모두 같은 결과를 도출함
//        ArrayList<String> fruits = new ArrayList<>(); // ArrayList는 addFirst, addLast 성능이 안좋음 // 기억해두기
//        LinkedList<String> fruits = new LinkedList<>();   addFirst, addLast 는 LinkedList의 전용 메서드라고 생각하면 됌
//        Vector<String> fruits = new Vector<>(); // 멀티 스레드에서 유리


        // set
        // 데이터 중복 X
        // 순서 정보 X
        // 저장한 순서대로 안나옴
//        HashSet<String> fruits = new HashSet<>(); // 기억해두기

//        바나나
//        사과
//        수박
//        오렌지
//        파인애플

        // 저장한 순서가 아닌, 정렬 기능을 가지고 있음(ㄱㄴㄷ, abc)
//        TreeSet<String> fruits = new TreeSet<>();

        // 저장한 순서를 유지(중복은 하나만 표현)
//        LinkedHashSet<String> fruits = new LinkedHashSet<>();

        Set<String> fruits = new LinkedHashSet<>();
;
        fruits.add("바나나"); // LinkedList 전용 메서드
        fruits.add("사과");
        fruits.add("오렌지");
        fruits.add("파인애플");
        fruits.add("수박");
        fruits.add("사과");



        printFruits(fruits);    // 배열
    }

    // 전달받은 과일 목록을 출력한다.
//    void printFruits(String[] fruits){
//        for(String fruit : fruits){
//            System.out.println(fruit);
//        }
//    }
//

    // List, Set, Queue 의 공통 부모 클래스
    void printFruits(Collection<String> fruits){
        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }

    // 아래 모든 코드들은 List의 자식 클래스이기 때문에 List만 선언하면 모든 List 자식 클래스를 사용할 수 있다
//    void printFruits(List<String> fruits){
//        for(String fruit : fruits){
//            System.out.println(fruit);
//        }
//    }
//
//    void printFruits(Set<String> fruits){
//        for(String fruit : fruits){
//            System.out.println(fruit);
//        }
//    }

//    void printFruits(ArrayList<String> fruits){
//        for(String fruit : fruits){
//            System.out.println(fruit);
//        }
//    }
//
//    void printFruits(LinkedList<String> fruits){
//        for(String fruit : fruits){
//            System.out.println(fruit);
//        }
//    }
//
//    void printFruits(Vector<String> fruits){
//        for(String fruit : fruits){
//            System.out.println(fruit);
//        }
//    }

//    void printFruits(HashSet<String> fruits){
//        for(String fruit : fruits){
//            System.out.println(fruit);
//        }
//    }
//
//    void printFruits(TreeSet<String> fruits){
//        for(String fruit : fruits){
//            System.out.println(fruit);
//        }
//    }
}
