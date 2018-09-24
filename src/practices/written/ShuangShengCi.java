package com.lzy.bytedance;
/**
 * 头条笔试题：键盘录入n组数据，每组数据中有m个字符串，判断每组数据中是否存在双生词，存在输出 yeah，不存在输出 sad
 * 思路：键盘录入n组数据，将n组数据放在一个list数组中
 *      每组数据有m个字符串，将m个字符串添加在一个list集合中
 *      直接遍历数组，再遍历集合取出字符串作比较
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShuangShengCi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        if (n <= 0)
            return;
        List[] arr = new List[n];
        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(sc.nextLine());
            List<String> list = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                String str = sc.nextLine();
                list.add(str);
            }
            arr[i] = list;
        }
//        boolean flag = false;
//        for (List list : arr) {
//            a:for (int i = 0; i < list.size() - 1; i++) {
//                for (int j = i + 1; j < list.size(); j++) {
//                    flag = shuangShengCi(list.get(i).toString(),list.get(j).toString());
//                    if(!flag){
//                        System.out.println("sad");
//                        break a;
//                    }
//                }
//            }
//        if(flag)
//            System.out.println("yeah");
//        }
        pairsOfWord(arr);
    }

    public static boolean shuangShengCi(String s,String s1){
        char[] chs = s.toCharArray();
       // StringBuilder sb = new StringBuilder(s);
        boolean flag = false;
        int i = 0;
        while(i < chs.length){
            StringBuilder sb1 = new StringBuilder();
            sb1 = sb1.append(s.substring(i,chs.length)).append(s.substring(0,i));
            if(sb1.toString().equals(s1)) {
                flag = true;
                break;
            }else if(sb1.reverse().toString().equals(s1)) {
                flag = true;
                break;
            }else{
                flag = false;
                i++;
                continue;
            }
        }
        return flag;
    }

    public static void pairsOfWord(List[] arr){
        for(List list : arr){
            a:for (int i = 0; i < list.size() - 1; i++) {
                String str1 = list.get(i).toString();
                for (int j = i + 1; j < list.size(); j++) {
                    String str2 = list.get(j).toString();
                    if(str1.length() == str2.length()){
                        for (int k = 0; k < str1.length(); k++) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(str1.substring(k , str1.length())).append(str1.substring(0 , k));
                            if(sb.toString().equals(str2) || sb.reverse().toString().equals(str2)){
                                System.out.println("yeah");
                                break a;
                            }
                        }
                    }
                    if (str1.length() != str2.length())
                        continue;
                    if (j == list.size() - 1){
                        System.out.println("sad");
                        break a;
                    }
                }
            }
        }
    }
}
