package practices.written_test;

import com.sun.deploy.util.SyncAccess;
import linked_list.reverse_linkedList.ListNode;

import java.util.*;

/**
 * 字节跳动笔试题：求抖音红人的总数
 *
 */

public class CountDYReds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int m = Integer.parseInt(sc.nextLine());
        String[] strs = sc.nextLine().split(" ");
        int[] arr = new int[2 * m];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(strs[i]);
        }

        Map<Integer, List<Integer>> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length - 2; i += 2) {
            list.add(Integer.valueOf(arr[i + 1]));
            if (!list.contains(arr[i]))
                list.add(Integer.valueOf(arr[i]));
            map.put(Integer.valueOf(arr[i + 1]),list);
        }

        Set<Integer> set = map.keySet();
        for(Integer key:set) {
            List<Integer> value = map.get(key);
            for (Integer i:value) {
                if (value.get(i).equals(key)){
                    for (int j = 0; j < value.size(); j++) {
                        if (!list.contains(value.get(j)))
                            list.add(value.get(j));
                        map.put(key,list);
                    }
                }
            }
        }

        int count = 0;
        for(Integer key:set){
            List<Integer> value = map.get(key);
            if (value.size() == n)
                count++;
        }
        System.out.println(count);
    }
}
