package practices.dailywritten;

/**
 * 爱奇艺往届秋招测开笔试：字符串价值
 *
 * 有一种有趣的字符串价值计算方式:统计字符串中每种字符出现的次数,然后求所有字符次数的平方和作为字符串的价值
 * 例如: 字符串"abacaba",里面包括4个'a',2个'b',1个'c',于是这个字符串的价值为4 * 4 + 2 * 2 + 1 * 1 = 21
 * 牛牛有一个字符串s,并且允许你从s中移除最多k个字符,你的目标是让得到的字符串的价值最小。
 *
 * 思路：先统计字符串中每个字符出现的次数，然后把这些数字放入一个数组中
 *      遍历数组，每次都要重新排下序，然后在最大值上减1，直到调整 k 次（这个地方要注意，并不是每次都将最大值去掉，而是平摊）
 *      遍历数组，依据题意 计算字符串价值
 */

import java.util.*;

public class CalStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = Integer.parseInt(sc.nextLine());
        System.out.println(calStrings(s,k));

    }

    public static int calStrings(String s,int k) {
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c))
                map.put(c,1);
            else
                map.put(c,map.get(c)+1);
        }
        int[] nums = new int[map.size()];
        int i = 0;
        Set<Character> set = map.keySet();
        for(Character key : set) {
            nums[i++] = map.get(key);
        }

//        for (int i = list.size() - 1; i >= 0; i--) {
//            if (k > list.get(i))
//                k = k - list.get(i);
//            else if (k <= list.get(i) && k > 0){
//                sum = sum + (list.get(i) - k) * (list.get(i) - k);
//                k = 0;
//            }else
//                sum = sum + list.get(i) * list.get(i);
//        }

        for (int j = 0; j < k; j++) {
            Arrays.sort(nums);
            if (nums[nums.length - 1] > 0)
                nums[nums.length - 1]--;
        }
        int sum = 0;
        for (int j = 0; j < nums.length && nums[j] != 0; j++) {
            if (nums[j] == 0)
                break;
            else
                sum = sum + nums[j] * nums[j];
        }

        return sum;
    }
}
