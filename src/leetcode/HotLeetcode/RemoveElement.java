package leetcode.HotLeetcode;

/**
 * 删除数组中与给定值相等的元素
 * eg：
 *    nums：【2,3,3,2】，val:3
 *    【2,2】 返回 2
 */

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3,3,2,2,4};
        int val = 3;
        System.out.println(removeElement(nums,val));
    }

    public static int removeElement(int[] nums,int val){
        int i = 0;
        for (int n:nums){
            if(n != val)
                nums[i++] = n;
        }
        return i;
    }
}
