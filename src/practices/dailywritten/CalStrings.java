package practices.dailywritten;

/**
 * �������������в⿪���ԣ��ַ�����ֵ
 *
 * ��һ����Ȥ���ַ�����ֵ���㷽ʽ:ͳ���ַ�����ÿ���ַ����ֵĴ���,Ȼ���������ַ�������ƽ������Ϊ�ַ����ļ�ֵ
 * ����: �ַ���"abacaba",�������4��'a',2��'b',1��'c',��������ַ����ļ�ֵΪ4 * 4 + 2 * 2 + 1 * 1 = 21
 * ţţ��һ���ַ���s,�����������s���Ƴ����k���ַ�,���Ŀ�����õõ����ַ����ļ�ֵ��С��
 *
 * ˼·����ͳ���ַ�����ÿ���ַ����ֵĴ�����Ȼ�����Щ���ַ���һ��������
 *      �������飬ÿ�ζ�Ҫ����������Ȼ�������ֵ�ϼ�1��ֱ������ k �Σ�����ط�Ҫע�⣬������ÿ�ζ������ֵȥ��������ƽ̯��
 *      �������飬�������� �����ַ�����ֵ
 */

import java.util.*;

public class CalStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = Integer.parseInt(sc.nextLine());
        System.out.println(calStrings(s,k));

    }

    public static int calStrings(String s,int k) {
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c))
                map.put(c,1);
            else
                map.put(c,map.get(c)+1);
        }
        int[] nums = new int[map.size()];
        int i = 0;
        Set<Character> set = map.keySet();
        for(Character key : set) {
            nums[i++] = map.get(key);
        }

//        for (int i = list.size() - 1; i >= 0; i--) {
//            if (k > list.get(i))
//                k = k - list.get(i);
//            else if (k <= list.get(i) && k > 0){
//                sum = sum + (list.get(i) - k) * (list.get(i) - k);
//                k = 0;
//            }else
//                sum = sum + list.get(i) * list.get(i);
//        }

        for (int j = 0; j < k; j++) {
            Arrays.sort(nums);
            if (nums[nums.length - 1] > 0)
                nums[nums.length - 1]--;
        }
        int sum = 0;
        for (int j = 0; j < nums.length && nums[j] != 0; j++) {
            if (nums[j] == 0)
                break;
            else
                sum = sum + nums[j] * nums[j];
        }

        return sum;
    }
}
