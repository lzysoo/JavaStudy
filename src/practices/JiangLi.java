package practices;

import java.util.Scanner;

public class JiangLi {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.next();
        String[] num = s.split(",");
        int[] arr = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            arr[i] = Integer.parseInt(num[i]);
        }
//        int j = sc.nextInt();
//        int[] arr = new int[j];
//        for (int i = 0; i < arr.length - 1; i++) {
//            arr[i] = sc.nextInt();
//        }
        int sum = 1;
        int n = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] < arr[i + 1])
                n += 1;
            else if(arr[i] > arr[i + 1])
                n -= 1;
            else
                n = 1;
            sum = sum + n;
        }
        System.out.println(sum);
    }

}
