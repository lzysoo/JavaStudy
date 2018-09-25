package wangyi;
/**
 * 数位重排：重排数位后能被原数整除，则输出possible，否则输出impossible
 */

import java.util.*;

public class SequenceOfRearrangement {
    static char[] chars;
    static Integer input;
    static Set<Integer> set;

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t =sc.nextInt();
        String str = sc.nextLine();
        for (int k = 0; k < t; k++) {
            str = sc.nextLine();
            chars = str.toCharArray();
            input = Integer.valueOf(str);
            set = new HashSet<>();
            Arrays.sort(chars);
            set.add(Integer.valueOf(String.valueOf(chars)));
            boolean stop = false;
            int i,j;
            int n = chars.length;
            while (!stop){
                stop = true;
                i = n-2;
                j = n-1;
                while (i >= 0 && chars[i] >= chars[i+1]){
                    i--;
                }
                if (i<0)
                    break;
                while (chars[j] <= chars[i]){
                    j--;
                }
                if (j > i) {
                    swap(i,j);
                    reverse(i+1, n-1);
                    stop =false;
                    set.add(Integer.valueOf(String.valueOf(chars)));
                }
            }
            set.remove(input);
            Iterator<Integer> iterator= set.iterator();
            boolean flag = false;
            while (iterator.hasNext()){
                if (iterator.next()%input == 0){
                    flag =true;
                    System.out.println("Possible");
                    break;
                }
            }
            if (!flag)
                System.out.println("Impossible");
        }
    }

    private static void reverse(int i, int j) {
        while(i<j){ char temp = chars[i];
        chars[i++] = chars[j];
        chars[j--] = temp;
        }
    }

    private static void swap(int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

//    public static void sequenceOfRearrangement(int n) {
//        List<Integer> list = new ArrayList<>();
//        char[] chs = String.valueOf(n).toCharArray();
//        for (int i = 0; i < chs.length; i++) {
//            list.add(Integer.valueOf(chs[i]));
//        }
//        Collections.sort(list);
//
//        List<Integer> list2 = new ArrayList<>();
//        for (int i = 2; i < 10; i++) {
//            int m = n * i;
//            char[] chs2 = String.valueOf(m).toCharArray();
//            for (int j = 0; j < chs2.length; j++) {
//                list2.add(Integer.valueOf(chs2[j]));
//            }
//        }
//        Collections.sort(list2);
//
//        boolean flag = true;
//        for (int i = 0; i < list.size(); i++) {
//            if (!list2.contains(list.get(i))) {
//                flag = false;
//                break;
//            }
//        }
//
//        if (flag)
//            System.out.println("possible");
//        else
//            System.out.println("impossible");
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            sequenceOfRearrangement(arr[i]);
//        }
//    }
}
