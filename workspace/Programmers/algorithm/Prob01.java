package algorithm;

import java.util.*;

public class Prob01 {
    public String solution(String[] participant, String[] completion) {
        String result = "";

        Map<String, Integer> map = new HashMap<>();

        // 1. 참가자 명단 구성
        for (String name : participant) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        // 2. 완주 명단 제외
        for (String name : participant) {
            map.put(name, map.get(name) - 1);
        }

        // 3. 미완주 선수 반환
        for(String name : map.keySet()){
            if(map.get(name) != 0) {
                result = name;
            }
        }
        return result;
    }



    void main(){
        String[] participant = {"hello", "World", "hello", "Java"};
        String[] completion = {"hello", "World", "Java"};
        String result = solution(participant, completion);
        if(result.equals("hello")) {
            System.out.println("통과");
        } else {
            System.out.println(result);
        }


        String[] participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion2 = {"josipa", "filipa", "marina", "nikola"};

        String result2 = solution(participant2, completion2);
        if(result2.equals("vinko")) {
            System.out.println("통과");
        } else {
            System.out.println(result);
        }
    }
}
