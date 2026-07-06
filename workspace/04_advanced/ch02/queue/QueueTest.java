package ch02.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    void main(){
        Queue queue = new LinkedList();

        // 담을때 add, 꺼낼때 remove 또는 offer, pool로 사용할 수 있음 결과는 선입선출
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);

        System.out.println(queue.size());

        // 꺼낼때 peek를 쓰면 값을 제거하지않고 결과를 보여줌
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        System.out.println(queue.size());
    }
}
