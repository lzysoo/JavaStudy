package leetcode.HotLeetcode;

/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * 说明：
 *
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
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

    //这种方法开辟了新的空间
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

    //如果不能开辟新的空间怎么实现呢？
    //用亦或，两个相同的数亦或之后为0，这样把所有数亦或，即为只出现过一次的数
    public static int singleNumber1(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
        }
        return result;
    }
}
