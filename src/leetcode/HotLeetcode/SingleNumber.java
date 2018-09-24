package leetcode.HotLeetcode;

/**
 * ����һ���ǿ��������飬����ĳ��Ԫ��ֻ����һ�����⣬����ÿ��Ԫ�ؾ��������Ρ��ҳ��Ǹ�ֻ������һ�ε�Ԫ�ء�
 *
 * ˵����
 *
 * ����㷨Ӧ�þ�������ʱ�临�Ӷȡ� ����Բ�ʹ�ö���ռ���ʵ����
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {3,4,5,3,4,6,5};
//        singleNumber(arr);
        System.out.println(singleNumber(arr));
    }

    //���ַ����������µĿռ�
    public static int singleNumber(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(Integer.valueOf(arr[i])))
                map.put(Integer.valueOf(arr[i]),1);
            else
                map.put(Integer.valueOf(arr[i]),2);
        }
        Set<Integer> set = map.keySet();
        for(Integer key:set) {
            if (map.get(key) == 1)
                //System.out.println(key);
                return key.intValue();
        }
        return 1;
    }

    //������ܿ����µĿռ���ôʵ���أ�
    //�����������ͬ�������֮��Ϊ0����������������򣬼�Ϊֻ���ֹ�һ�ε���
    public static int singleNumber1(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
        }
        return result;
    }
}
