package ch02.queue;

import java.util.Stack;

public class StackTest {
    void main(){
        Stack stack = new Stack();

        // 담을때 push, 꺼낼때 pop 결과는 후입선출
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println(stack.size());

        // 꺼낼때 peek를 쓰면 값을 제거하지않고 결과를 보여줌
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.size());
    }
}
