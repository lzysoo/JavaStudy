package practices;
/**
 * ˼·�������⹹���һ����������ȱ�����ȡ��֧���洢
 *       ���ݴ洢�ķ�֧������·�����ȣ���������
 *
 * ���룺
 * 3
 * 2
 * 0 2 3
 * 2 0 1
 * 3 1 0
 * �����
 * [4, 4, 3]
 * [4, 2, 5]
 * [3, 5, 2]
 */

import java.util.Arrays;
import java.util.Scanner;

public class JieLi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] map = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = in.nextInt();
            }
        }
        int[][] res = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = Integer.MAX_VALUE;
            }
        }
        int[] s = new int[m + 2];
        s[0] = n;
        solve(n, m, 1, n, s, map, res);
        for (int i = 0; i < res.length; i++) {
            System.out.println(Arrays.toString(res[i]));
        }
    }


    public static void solve(int n, int m, int t, int root, int[] s, int[][] map, int[][] res) {
        //���룺t:��ʾ�ӵڼ��㿪ʼ������root:��ʾ��ǰ���ڽ�㣬s:����������õ��ķ�֧
        if (t == (m + 2)) {
            int sum = 0;
            for (int j = 1; j < s.length - 1; j++) {
                sum += map[s[j]][s[j + 1]];
            }
            if (sum < res[s[1]][s[m + 1]])
                res[s[1]][s[m + 1]] = sum;
            //System.out.println(Arrays.toString(s));//����Ӹ���Ҷ��һ��֧·
        } else {
            int[] arr = find(n, root);
            for (int i = 0; i < arr.length; i++) {
                s[t] = arr[i];
                solve(n, m, t + 1, arr[i], s, map, res);
            }
        }
    }

    public static int[] find(int n, int root) {//���ݵ�ǰ����ȡ���ܵ�������������ĸ�
        int[] arr;
        if (root == n) {
            arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = i;
            }
        } else {
            arr = new int[n - 1];
            int t = 0;
            for (int i = 0; i < n; i++) {
                if (i == root) continue;
                arr[t] = i;
                t++;
            }
        }
        return arr;
    }
}




