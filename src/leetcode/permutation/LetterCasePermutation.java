package leetcode.permutation;

/**
 * 给定一个字符串S，通过将字符串S中的每个字母转变大小写，我们可以获得一个新的字符串。返回所有可能得到的字符串集合。
 * eg：
 *     Input: S = "a1b2"
 *     Output: ["a1b2", "a1B2", "A1b2", "A1B2"]
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LetterCasePermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        List<String> list = letterCasePermutation(S);
        for (int j = 0; j < list.size(); j++) {
            System.out.print(list.get(j) + " ");
        }
    }

    public static List<String> letterCasePermutation(String S) {
        List<String> list = new ArrayList<>();
        String temp = "";
        letter(list,S,temp,0);
        return list;
    }

    public static void letter(List<String> list,String S,String temp,int index){

        if (S.length() == temp.length())
            list.add(temp);

        if (index == S.length())
            return;

        temp += S.charAt(index);
        letter(list,S,temp,index + 1);
        temp = temp.substring(0,temp.length() - 1);

        if (S.charAt(index) >= 'a' && S.charAt(index) <= 'z'){//小写字母a-z
            temp += (char)(S.charAt(index) + 'A' - 'a');
            letter(list,S,temp,index + 1);
        }else if(S.charAt(index) >= 'A' && S.charAt(index) <= 'Z'){//大写字母A-Z
            temp += (char)(S.charAt(index) + 'a' - 'A');
            letter(list,S,temp,index + 1);
        }
    }
}
