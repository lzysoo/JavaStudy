package practices;

/**
 * 在控制台输出任意个不重复的1~big的随机数
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class RandomDemo {
    public static void main(String[] args) {
        /*Random r = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        int count = 0;
        while(count < 10){
            int n = r.nextInt(20) + 1;
            if(!arr.contains(n)){
                arr.add(n);
                count ++;
            }
        }

        for(Integer i:arr){
            System.out.println(i);
        }
        */
        //输出5个0~30的不重复的随机数
        method1(30,5);
        System.out.println("______________________");
        method2(30,5);
    }

    //用HashSet来写一个方法，产生任意个 1~n的不重复数字
    //big为最大范围，count为产生的随机数个数
    public static void method1(int big,int count){
        Random r = new Random();
        HashSet<Integer> st = new HashSet<>();
        while (st.size() < count){
            int num = r.nextInt(big) + 1;
            st.add(num);
        }

        for(Integer i:st)
            System.out.println(i);
    }

    //用ArrayList来写同样的方法
    public static void method2(int big,int count){
        Random r = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        int n = 0;
        while (n < count){
            int num = r.nextInt(big) + 1;
            if(!arr.contains(num)){
                arr.add(num);
                n ++;
            }
        }
        for(Integer i:arr)
            System.out.println(i);
    }
}
