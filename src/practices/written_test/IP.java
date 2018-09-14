package practices.written_test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 头条笔试：确定IP
 */

public class IP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if (str.length() < 4 || str.length() > 12) {
            System.out.println(0);
        } else {
            List<String> list = new ArrayList<>();
            int[] arr = new int[]{1, 2, 3};
            int sum = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    for (int k = 0; k < 3; k++) {
                        for (int l = 0; l < 3; l++) {
                            int a = arr[i] + arr[j];
                            int b = a + arr[k];
                            int c = b + arr[l];
                            sum = arr[i] + arr[j] + arr[k] + arr[l];
                            if (sum == str.length()) {
                                if (str.substring(0, arr[i]).length() > 1
                                        && str.substring(0, arr[i]).charAt(0) == '0')
                                    continue;
                                if (str.substring(arr[i], a).length() > 1
                                        && str.substring(arr[i], a).charAt(0) == '0')
                                    continue;
                                if (str.substring(a, b).length() > 1
                                        && str.substring(a, b).charAt(0) == '0')
                                    continue;
                                if (str.substring(b, c).length() > 1
                                        && str.substring(b, c).charAt(0) == '0')
                                    continue;
                                list.add(arr[i] + "." + arr[j] + "." + arr[k] + "." + arr[l]);
                            }
                        }
                    }
                }
            }
            for (String s : list) {
                System.out.println(s);
            }
            System.out.println(list.size());
        }
    }
}
