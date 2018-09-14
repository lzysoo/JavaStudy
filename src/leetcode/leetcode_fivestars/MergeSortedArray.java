package leetcode.leetcode_fivestars;

/**
 * ����������������nums1��nums2������
 * ����������ϲ��ұ�֤�ϲ�������
 *
 * ˵������ʼ�� nums1 �� nums2 ��Ԫ�������ֱ�Ϊ m �� n��
 */

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,9,12,34,45};
        int[] nums2 = {2,4,10};
        mergeSortedArray(nums1,6,nums2,3);
        System.out.println();
        mergeSortedArray1(nums1,nums2);
    }

    public static void mergeSortedArray(int[] nums1,int m,int[] nums2,int n){
        int i = m - 1;
        int j = n - 1;
        int[] nums = new int[m + n];
        int k = m + n - 1;
        while(i >= 0 && j >= 0)
            nums[k--] = (nums1[i] > nums2[j]) ? nums1[i--] : nums2[j--];
        //���nums1�����ˣ�˵��ʣ�µģ���С����Щ������nums2�ģ����ȥ�ͺ���
        while(j >= 0)
            nums[k--] = nums2[j--];
        //���nums2�����ˣ�˵��ʣ�µģ���С����Щ������nums1�ģ����ȥ�ͺ���
        while (i >= 0)
            nums[k--] = nums1[i--];

        for (int l = 0; l < nums.length; l++) {
            System.out.print(nums[l] + " ");
        }
    }

    public static void mergeSortedArray1(int[] nums1,int[] nums2){
        int i = nums1.length - 1;
        int j = nums2.length - 1;
        int[] nums = new int[nums1.length + nums2.length];
        int k = nums.length - 1;
        while(i >= 0 && j >= 0)
            nums[k--] = (nums1[i] > nums2[j]) ? nums1[i--] : nums2[j--];
        //���nums1�����ˣ�˵��ʣ�µģ���С����Щ������nums2�ģ����ȥ�ͺ���
        while(j >= 0)
            nums[k--] = nums2[j--];
        //���nums2�����ˣ�˵��ʣ�µģ���С����Щ������nums1�ģ����ȥ�ͺ���
        while (i >= 0)
            nums[k--] = nums1[i--];

        for (int l = 0; l < nums.length; l++) {
            System.out.print(nums[l] + " ");
        }
    }
}
