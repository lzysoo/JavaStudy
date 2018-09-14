package leetcode.leetcode_fivestars;

/**
 * 给定一个整数数组 nums，其中恰好有两个元素只出现一次，其余所有元素均出现两次。 找出只出现一次的那两个元素。
 * 说明：
 *  结果输出的顺序并不重要，对于上面的例子， [5, 3] 也是正确答案。
 *  你的算法应该具有线性时间复杂度。你能否仅使用常数空间复杂度来实现？
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
