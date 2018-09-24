package leetcode.permutation;

/**
 * ʵ�ֻ�ȡ��һ�����еĺ������㷨��Ҫ���������������������г��ֵ�������һ����������С�
 * �����������һ����������У��������������г���С�����У����������У���
 * ����ԭ���޸ģ�ֻ����ʹ�ö��ⳣ���ռ䡣
 *
 * ������һЩ���ӣ�����λ������У�����Ӧ���λ���Ҳ��С�
 * 1,2,3 �� 1,3,2
 * 3,2,1 �� 1,2,3
 * 1,1,5 �� 1,5,1
 */

public class NextPermutation {

    public void nextPermutation(int[] nums) {
        int len = nums.length;
        if (len<2)  return ;

        int[] res = new int [len];

        /* �ӵ����ڶ���Ԫ�ؿ�ʼ���Ӻ���ǰ���ҵ���һ������(��Ԫ��>ǰԪ��)�����
         * ��ʱ����¼ǰԪ���±�k����[k+1,n-1]Ϊһ����������������
         * ��ô������ֻ��Ҫ��һ����nums[k]�����С����nums[k]����
         */
        int lastEle = nums[len-1];
        int k = len-2;
        for (; k >= 0; k--){
            if (lastEle > nums[k])  break;
            else {
                lastEle = nums[k];
                continue;
            }
        }

        // ��ǰ����Ϊ������У�����֮
        if (k < 0) {
            for (int i = 0; i < (len+1) / 2; i++) {
                swap(nums, i, len-1-i);
            }
        } else {
            // ��nums[k+1,n-1]��Ѱ�Ҵ���nums[k]����С��
            int index = 0;
            for (int i = len-1; i > k; i--) {
                if (nums[i] > nums[k]) {
                    swap(nums, i, k);
                    index = i;
                    break;
                }
            }
            // indexΪ0����ʾ��ǰnums[k]С���������һ������ֱ�ӽ���k��len-1
            if (index == 0){
                swap(nums, k, len-1);
            }
            // ��nums[k+1,n-1]����
            for (int i = k+1; i < (k + len + 2) / 2; i++) {
                swap(nums, i, k + len-i);
            }
        }
        return ;
    }

    // ����Ԫ��
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
