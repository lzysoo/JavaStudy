package practices.written;

/**
 * ����2018���в⿪���ԣ�
 * ��֪һ���Ϸ��������У����ж������Ʒ�ʹ������Ϊ��
 * ע�⣺
 *    �Ƴ���Ϊ������1���Ƴ���һ�������ţ�2���Ƴ�����һ�������ţ���֤����֮��������ԺϷ�
 *    ÿ���Ƴ���Ҫ��֤ʣ��������Ϊһ���Ϸ���������
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
     * �ж����������Ƿ�Ϸ�
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
                //ɾ�������ź��жϸ������Ƿ�Ϸ�������Ϸ��ݹ飬��������һ��������
                newList.remove(i);
                if(volid(newList)){
                    dfs(newList);
                }
            }
        }
    }


}
