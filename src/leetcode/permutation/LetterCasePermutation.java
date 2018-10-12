package leetcode.permutation;

/**
 * ����һ���ַ���S��ͨ�����ַ���S�е�ÿ����ĸת���Сд�����ǿ��Ի��һ���µ��ַ������������п��ܵõ����ַ������ϡ�
 * eg��
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

        if (S.charAt(index) >= 'a' && S.charAt(index) <= 'z'){//Сд��ĸa-z
            temp += (char)(S.charAt(index) + 'A' - 'a');
            letter(list,S,temp,index + 1);
        }else if(S.charAt(index) >= 'A' && S.charAt(index) <= 'Z'){//��д��ĸA-Z
            temp += (char)(S.charAt(index) + 'a' - 'A');
            letter(list,S,temp,index + 1);
        }
    }
}
