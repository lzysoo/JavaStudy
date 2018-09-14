package practices.written_test;

/**
 *海康威视测试笔试：丑数
 * 找出第n个丑数
 * 注意：
 *     丑数就是只包含质因数 2, 3, 5 的正整数。
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UglyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(GetUglyNumber_Solution(10));
    }

    public static void bestPrintContinuousNum(int target){
        int n=target;
        List<List> list1 = new ArrayList();
        for(int i=2;(2*i-1)*(2*i-1)-1<8*n;i++){//将求根转化为平方。例如 i<sqrt(x)-->i*i<n
            if((n-i*(i-1)/2)%i==0){
                List list2 = new ArrayList();
                int x=(n-i*(i-1)/2)/i;
                int j=0;
                while(j<i){
//                    System.out.print(x+" ");
                    list2.add(x);
                    x++;
                    j++;
                }
//                System.out.println(list2.size());
                list1.add(list2);
//                System.out.println();
            }
        }
        for (Object o : list1.get(list1.size() - 1)) {
            System.out.print(o.toString() + " ");
        }

    }

    public static int GetUglyNumber_Solution(int n) {
        int[] arr = new int [n];
        if(n == 0)
            return 0;
        arr[0]=1;
        int t2 = 0,t3 = 0,t5 = 0; //第一个丑数为1，放入数组第一个元素
        for(int i = 1; i < n; i++) {
            arr[i] = Math.min(arr[t2] * 2,Math.min(arr[t3] * 3,arr[t5] * 5));//通过1依次乘2，3，5找到后面的丑数，再通过找到的丑数依次乘2,3,5找到后面的，排序即可
            if(arr[t2] * 2 == arr[i])
                t2++;
            if(arr[t3] * 3 == arr[i])
                t3++;
            if(arr[t5] * 5 == arr[i])
                t5++;
        }
        return arr[n - 1];
    }
}
