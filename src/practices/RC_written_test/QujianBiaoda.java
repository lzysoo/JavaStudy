package practices.RC_written_test;

import java.util.Scanner;

public class QujianBiaoda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int count = 1;
        int temp = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] == nums[i] + 1)
                continue;
            else {
                count++;
                continue;
            }
        }
        System.out.println(count);
    }
}
