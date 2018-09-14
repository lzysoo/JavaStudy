package leetcode.leetcode_fivestars;

/**
 * ����һ���������� nums������ǡ��������Ԫ��ֻ����һ�Σ���������Ԫ�ؾ��������Ρ� �ҳ�ֻ����һ�ε�������Ԫ�ء�
 * ˵����
 *  ��������˳�򲢲���Ҫ��������������ӣ� [5, 3] Ҳ����ȷ�𰸡�
 *  ����㷨Ӧ�þ�������ʱ�临�Ӷȡ����ܷ��ʹ�ó����ռ临�Ӷ���ʵ�֣�
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SingleNumberII {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,1,2,3,4,6,4,5};
        int[] arr = singleNumberII(nums);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }

    public static int[] singleNumberII(int[] nums) {
        int[] arr = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(Integer.valueOf(nums[i])))
                map.put(Integer.valueOf(nums[i]),1);
            else
                map.put(Integer.valueOf(nums[i]),2);
        }
        Set<Integer> set = map.keySet();
        int i = 0;
        for(Integer key:set) {
            if (map.get(key) == 1) {
                arr[i++] = key.intValue();
            }
        }
        return arr;
    }
}
