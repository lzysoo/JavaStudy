package leetcode.leetcode_fivestars;

/**
 *给定一个数组和一个目标数，输出数组中和为目标数的两个数的下标
 * eg：【2,7,11,12】，targe = 9
 *      输出【0,1】
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class twoSum {
    public static void main(String[] args) {

       // Scanner sc = new Scanner(System.in);
       // int target = sc.nextInt();
        int[] nums = new int[]{1,2,3,4,5};
        int[] result = two_sum1(nums,5);
        System.out.println("[" + result[0] + result[1] + "]");
    }
    
    public static int[] two_Sum(int[] nums,int target){
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    result = new int[]{i,j};
                }
            }
        }
        return result;
    }

    public static int[] two_sum1(int[] nums,int target){
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[1] = i;
                result[0] = map.get(target - nums[i]);
            }
            map.put(nums[i], i);
        }
        return result;
    }
}
