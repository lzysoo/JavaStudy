package practices.dailywritten;

import java.util.*;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            list.add(arr[i]);
        }

        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            char[] chs = list.get(i).toString().toCharArray();
            Arrays.sort(chs);
            list1.add(Integer.valueOf(String.valueOf(chs)));
        }
        Collections.sort(list1);
        System.out.println(list1.get(list1.size() - 1));
    }
}
