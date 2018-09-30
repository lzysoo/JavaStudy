package practices.written;

/**
 * 联想笔试：
 * 输入一个字符串，输出按字典序的所有字符串
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ArrayList<String> list = permutation(s);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static ArrayList<String> permutation(String s) {
        ArrayList<String> list = new ArrayList<>();
        if (s == null || s.length() == 0)
            return list;
        HashSet<String> set = new HashSet<>();
        fun(set,s.toCharArray(),0);
        list.addAll(set);
        Collections.sort(list);
        return list;
    }

    public static void fun(HashSet<String> set,char[] chs,int n) {
        if (n == chs.length) {
            set.add(new String(chs));
            return;
        }

        for (int i = n; i < chs.length; i++) {
            swap(chs,i,n);
            fun(set,chs,n + 1);
            swap(chs,i,n);
        }
    }

    public static void swap(char[] chs,int i,int j){
        if (i != j) {
            char t = chs[i];
            chs[i] = chs[j];
            chs[j] = t;
        }
    }
}
