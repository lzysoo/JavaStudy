package practices.dailywritten;

/**
 * 爱奇艺往届秋招测开笔试：判断题
 * 考试包括n道判断题,每做对一道题获得1分,在考试中一共猜测了t道题目的答案是"正确",其他的牛牛猜为"错误"。
 * 实际上n道题中有a个题目的答案应该是"正确",但是不知道具体是哪些题目
 * 计算可能获得的最高的考试分数是多少。
 */

import java.util.Scanner;

public class IsCorrect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int[] arr = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        int sum = 0;
        int n = arr[0];
        int t = arr[1];
        int a = arr[2];
        if (t == a)
            sum = n;
        else if (t > a)
            sum = a + (n - a - (t - a));
        else
            sum = t + (n - a);
        System.out.println(sum);
    }
}
