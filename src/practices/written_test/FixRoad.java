package practices.written_test;

/**
 * 京东测开笔试：修路，求最大利润
 */

import java.util.*;

public class FixRoad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        if (n <= 0)
            return;

        int[] arr = new int[n - 1];
        Map<String[], Integer> map = new HashMap<>();
        for (int i = 0; i < n - 1; i++) {
            String str = sc.nextLine();
            if (str.length() != 3)
                return;
            String[] strs = str.split(" ");
            arr[i] = Math.abs(Integer.parseInt(strs[0]) - Integer.parseInt(strs[1]));
            map.put(strs, arr[i]);
        }
        Set<String[]> keys = new HashSet<>();
        for (String[] key : keys) {

        }
//        Arrays.sort(arr);
//        System.out.println(arr[0] * arr[arr.length - 1]);
    }
}