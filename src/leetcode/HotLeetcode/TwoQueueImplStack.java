package leetcode.HotLeetcode;

/**
 * ��������ʵ��һ��ջ
 * ˼�룺
 *      ��ջ������Ԫ��ѹ��queue1
 *      ��ջ����queue1�е�Ԫ�س���ѹ��queue2��queue1��ֻʣ��һ��Ԫ�أ�������
 *           ��ʱqueue1Ϊ�գ��ٽ�queue2��Ԫ�س���ѹ��queue1�У�queue2��ֻʣһ��Ԫ��ʱ����
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
