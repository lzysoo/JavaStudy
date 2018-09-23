package leetcode.leetcode_string;

import java.util.Scanner;

public class ToLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String lstr = str.toLowerCase();//用的String的toLowerCase方法
        System.out.println(lstr);

        ToLowerCase tl = new ToLowerCase();
        System.out.println(tl.toLowerCase(str));
        //System.out.println(tl.toLowerCase1(str));
    }

    public String toLowerCase(String str){
        if(str == null)
            return null;
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if(ch[i] >= 'A' && ch[i] <= 'Z')
                ch[i] += 32;//小写字母比大写字母大32
        }
        String s = new String(ch);
        return s;
    }

    /*
    错误的方法，最后的 字符c 不能转换为字符串
    public String toLowerCase1(String str){
        if(str == null)
            return null;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c >= 'A' && c <= 'Z')
                c += 32;
            String s = new String(c);
            return s;
        }
    }
    */
}
