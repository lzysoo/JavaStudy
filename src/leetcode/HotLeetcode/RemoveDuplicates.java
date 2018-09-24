package leetcode.HotLeetcode;

/**
 * ɾ�������������ظ���Ԫ�أ�ʹ��ÿ��Ԫ�����ֻ����һ��
 * Ҫ��
 *     ��ԭ�����в��������ÿ����µĿռ䣬��󷵻�������ĳ���
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
     * ����һ���������飬����Ҫ��ԭ��ɾ���ظ����ֵ�Ԫ�أ�ʹ��ÿ��Ԫ�����������Σ������Ƴ���������³��ȡ�
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
