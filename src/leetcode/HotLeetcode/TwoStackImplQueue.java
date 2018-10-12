package leetcode.HotLeetcode;
/**
 * 两个栈实现一个队列
 * 思想：
 *      入队：stack1若不为空，直接将元素压入stack1；若为空，将stack2元素逐个倒入到stack1中，再将元素压入stack1
 *      出队：若stack2不为空，直接弹出stack2栈顶元素；若为空，将stack1元素逐个倒入stack2中，再弹出栈顶元素
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
