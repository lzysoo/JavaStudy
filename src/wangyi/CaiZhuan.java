/*
一个字符串由大写字母组成，在这些字母所有的排列中，若一个排列中 相邻字母是不同的次数不超过一次，则这个排列是一个好看的排列
给定一个字符串，求这个字符串可以组成几个好看的排列

思路：
    当只有一种字母时，好看的排列有1个
    有2种字母时，好看的排列有2个
    有3种及以上的字母时，好看的排列为0个
    所以：需要统计字符串中一共有几种字母
*/
package wangyi;

import java.util.Scanner;

public class CaiZhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] count = new int[26];
        //统计字符串中每个字符出现的次数
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'A']++;
        }
        //统计字符串中一共有多少个不同的字符
        int num = 0;
        for (int i = 0; i < 26; i++) {
            if(count[i] != 0){
                num++;
            }
        }
        if(num == 1)
            System.out.println(1);
        else if(num == 2)
            System.out.println(2);
        else
            System.out.println(0);
    }
}
