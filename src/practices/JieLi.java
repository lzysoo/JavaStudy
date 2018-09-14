package practices;
/**
 * 思路：把问题构造成一棵树，先深度遍历获取分支并存储
 *       根据存储的分支，计算路径长度，做出处理
 *
 * 输入：
 * 3
 * 2
 * 0 2 3
 * 2 0 1
 * 3 1 0
 * 输出：
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
        //输入：t:表示从第几层开始遍历，root:表示当前所在结点，s:用来存遍历得到的分支
        if (t == (m + 2)) {
            int sum = 0;
            for (int j = 1; j < s.length - 1; j++) {
                sum += map[s[j]][s[j + 1]];
            }
            if (sum < res[s[1]][s[m + 1]])
                res[s[1]][s[m + 1]] = sum;
            //System.out.println(Arrays.toString(s));//输出从根到叶的一条支路
        } else {
            int[] arr = find(n, root);
            for (int i = 0; i < arr.length; i++) {
                s[t] = arr[i];
                solve(n, m, t + 1, arr[i], s, map, res);
            }
        }
    }

    public static int[] find(int n, int root) {//根据当前结点获取它能到达的所有子树的根
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




