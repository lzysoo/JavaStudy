package leetcode.HotLeetcode;

/**
 * 删除有序数组中重复的元素，使得每个元素最多只出现一次
 * 要求：
 *     在原数组中操作，不得开辟新的空间，最后返回新数组的长度
 */

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,2,2,3};
        System.out.println(removeDuplicates(arr));
        System.out.println(removeDuplicates2(arr));
    }

    public static int removeDuplicates(int[] nums) {
//        int n = 0;
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] == nums[i - 1])
//                n++;
//            nums[i - n] = nums[i];
//        }
//        return nums.length - n;

        int i = 0;
        for(int n:nums){
            if (i < 1 || n > nums[i - 1])
                nums[i++] = n;
        }
        return i;
    }

    /**
     * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素最多出现两次，返回移除后数组的新长度。
     * @param nums
     * @return
     */

    public static int removeDuplicates2(int[] nums) {
        int i = 0;
        for(int n:nums){
            if (i < 2 || n > nums[i - 2])
                nums[i++] = n;
        }
        return i;
    }
}
