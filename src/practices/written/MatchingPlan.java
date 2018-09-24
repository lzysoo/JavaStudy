package practices.written;

/**
 * 京东2018秋招测开笔试：
 * 已知一个合法括号序列，问有多少种移法使该序列为空
 * 注意：
 *    移除分为两步：1、移除第一个左括号；2、移除任意一个右括号，保证操作之后的序列仍合法
 *    每次移除后要保证剩余序列仍为一个合法括号序列
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class MatchingPlan {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> list = new ArrayList<>();
//        while(sc.hasNext()){
//            list.clear();
            String s = sc.nextLine();
            char[] chs = s.toCharArray();
            for(int i = 0; i < s.length(); i++){
                list.add(chs[i]);
            }
            total = 0;
            dfs(list);
            System.out.println(total);
//        }
    }


    private static int total = 0;
    /**
     * 判断括号序列是否合法
     * @return
     */
    public static Boolean volid(ArrayList<Character> list){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) == '('){
                stack.push('(');
            }else{
                if(stack.isEmpty() || stack.pop() != '(')
                    return false;
            }
        }
        return stack.isEmpty();
    }

    public static void dfs(ArrayList<Character> list){
        if(list.isEmpty()){
            total++;
            return ;
        }
        ArrayList<Character> newList = null;
        Character lft = list.remove(0);
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) == ')'){
                newList = (ArrayList)list.clone();
                //删除右括号后判断该序列是否合法，如果合法递归，否则检查下一个右括号
                newList.remove(i);
                if(volid(newList)){
                    dfs(newList);
                }
            }
        }
    }


}
