package practices;

/**
 * �ڿ���̨�����������ظ���1~big�������
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
        //���5��0~30�Ĳ��ظ��������
        method1(30,5);
        System.out.println("______________________");
        method2(30,5);
    }

    //��HashSet��дһ����������������� 1~n�Ĳ��ظ�����
    //bigΪ���Χ��countΪ���������������
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

    //��ArrayList��дͬ���ķ���
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
