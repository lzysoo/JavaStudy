package leetcode.HotLeetcode;

/**
 * 两个队列实现一个栈
 * 思想：
 *      入栈：所有元素压入queue1
 *      出栈：把queue1中的元素出队压入queue2，queue1中只剩下一个元素，弹出；
 *           此时queue1为空，再将queue2的元素出队压入queue1中，queue2中只剩一个元素时弹出
 */

import java.util.LinkedList;
import java.util.Queue;

public class TwoQueueImplStack {
    private Queue<Integer> queue = new LinkedList<>();

    public void push(int x){
        queue.add(x);
        for (int i = 1; i < queue.size(); i++){
            queue.add(queue.remove());
        }
    }

    public int pop(){
        return queue.remove();
    }

    public int top(){
        return queue.peek();
    }

    public boolean empty(){
        return queue.isEmpty();
    }
}
