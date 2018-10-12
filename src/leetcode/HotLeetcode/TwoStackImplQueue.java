package leetcode.HotLeetcode;
/**
 * ����ջʵ��һ������
 * ˼�룺
 *      ��ӣ�stack1����Ϊ�գ�ֱ�ӽ�Ԫ��ѹ��stack1����Ϊ�գ���stack2Ԫ��������뵽stack1�У��ٽ�Ԫ��ѹ��stack1
 *      ���ӣ���stack2��Ϊ�գ�ֱ�ӵ���stack2ջ��Ԫ�أ���Ϊ�գ���stack1Ԫ���������stack2�У��ٵ���ջ��Ԫ��
 */

import java.util.Stack;

public class TwoStackImplQueue {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void push(Integer x){
        stack1.push(x);
    }

    public int pop(){
        if (stack2.isEmpty()){
            while (!stack1.isEmpty())
                stack2.push(stack1.pop());
        }
        return stack2.pop();
    }

    public int peek(){
        if (stack2.isEmpty()){
            while (!stack1.isEmpty())
                stack2.push(stack1.pop());
        }
        return stack2.peek();
    }

    public boolean empty(){
        return stack1.isEmpty() && stack2.isEmpty();
    }
}
