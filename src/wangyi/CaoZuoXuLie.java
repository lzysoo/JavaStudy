package wangyi;

import java.util.Scanner;

public class CaoZuoXuLie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        /*
        for (int i = n - 1; i >= 0 ; i -= 2) {
            System.out.print(arr[i] + " ");
        }
        for (int i = n % 2; i < n; i += 2) {
            if(i == n - 2)
                System.out.println(arr[i]);
            else
                System.out.print(arr[i] + " ");
        }
        */

        CaoZuoXuLie cz = new CaoZuoXuLie();
        cz.caoZuo(n,arr);
    }

    public int[] caoZuo(int n,int[] arr){
        for (int i = n - 1; i >= 0 ; i -= 2) {
            System.out.print(arr[i] + " ");
        }
        for (int i = n % 2; i < n; i += 2) {
            if(i == n - 2)
                System.out.println(arr[i]);
            else
                System.out.print(arr[i] + " ");
        }
        return arr;
    }
}
