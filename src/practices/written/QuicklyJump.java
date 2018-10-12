package practices.written;

import java.util.Scanner;

public class QuicklyJump {
    public static int t = 3;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String str = sc.nextLine();
        String[] strs = str.split(" ");
        int [] arr = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            arr[i] = Integer.parseInt(strs[i]);
        }
        System.out.println(quicklyJump(n,arr));
    }

    public static int quicklyJump(int n,int[] arr){
        int sum = t;
        int count = 0;
        if (sum == n)
            return count;
        a:for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (sum == n || t + arr[i] >= n) {
                count++;
                break a;
            }
        }
        return count;
    }
}
