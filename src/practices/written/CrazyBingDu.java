package practices.written;

/**
 * ·è¿ñ²¡¶¾
 */

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class CrazyBingDu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String str = sc.nextLine();
        String[] strs = str.split(" ");
        int[] arr = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            arr[i] = Integer.parseInt(strs[i]);
        }

        crazyBingDu(arr);

    }

    public static void crazyBingDu(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i]))
                map.put(arr[i],1);
            else
                map.put(arr[i],map.get(arr[i]) + 1);
        }
        Set<Integer> set = map.keySet();
        for(Integer key:set){
            if (map.get(key) > arr.length / 2)
                System.out.println(key);
        }
    }
}
