package practices;

/**
 * ����һ�����飬�����������ȡ��n�����ظ���Ԫ��
 * Ӧ�ã���һ�������1000���⣬���г�ȡ100�������һ���Ծ�
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayRandom {
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,7,8,9,10,24,35};
        int num = 6;
        arrayRandom(arr,6);
    }

    public static void arrayRandom(int[] arr,int num){
        Random r = new Random();
        List<Integer> list = new ArrayList<>();
        int n = 0;
        while(n < num){
            int a = arr[r.nextInt(arr.length)];
            if(!list.contains(a)) {
                list.add(a);
                n++;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
