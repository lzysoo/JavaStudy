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
            System.out.println(list.get(j));
        }
    }

    public static List<String> letterCasePermutation(String S) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        list.add(S);
        char[] chs = S.toCharArray();
        int i = 0;
        while (i < chs.length) {
            if (chs[i] >= '0' && chs[i] <= '9')
                sb.append(chs[i]);
            if (chs[i] >= 'A' && chs[i] <= 'Z')
                sb.append(String.valueOf(chs[i]).toLowerCase());
            if (chs[i] >= 'a' && chs[i] <= 'z')
                sb.append(String.valueOf(chs[i]).toUpperCase());
            i++;
        }
        list.add(sb.toString());
        return list;
    }
}
