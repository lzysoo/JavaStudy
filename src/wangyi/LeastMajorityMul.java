package wangyi;
import java.util.Scanner;

public class LeastMajorityMul {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] strs = s.split(",");
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.valueOf(strs[i]);
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
