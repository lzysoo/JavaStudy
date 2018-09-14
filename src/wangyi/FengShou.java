package wangyi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FengShou {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] q = new int[m];
        for (int i = 0; i < q.length; i++) {
            q[i] = sc.nextInt();
        }

        int sum = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
                sum +=arr[i];
                list.add(sum);
        }

        for (int i = 0; i < q.length; i++) {
            for (int j = 0; j < list.size(); j++) {
                if (q[i] < list.get(j)){
                    System.out.println(j + 1);
                    break;
                }
            }
        }
    }
}
