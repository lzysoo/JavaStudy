package wangyi;
import java.util.Scanner;

public class LeastMajorityMul {
    public static void main(String[] args) {

        /*
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int i=1;
        int count =0;

        while (i>0){
            if(i%a == 0) count++;
            if(i%b == 0) count++;
            if(i%c == 0) count++;
            if(i%d == 0) count++;
            if(i%e == 0) count++;
            if (count >= 3)
                break;
            count = 0;
            i++;

        }
        System.out.println(i);
        */

        //改良版
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int n = 1;
        int count = 0;
        while(n > 0){
            for (int i = 0; i < arr.length; i++) {
                if(n % arr[i] == 0)
                    count++;
            }
            if (count >= 3)
                break;
            count = 0; //要记录每个n能够被五个数中的几个整除，，所以每循环一次都要置为0
            n++;
        }
        System.out.println(n);
    }


}
