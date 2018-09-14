package practices;
/**
 *小Q有X首长度为A的不同的歌和Y首长度为B的不同的歌，现在小Q想用这些歌组成一个总长度正好为K的歌单，
 *     每首歌最多只能在歌单中出现一次，在不考虑歌单内歌曲的先后顺序的情况下，请问有多少种组成歌单的方法。
 * 	输入描述:
 * 	每个输入包含一个测试用例。
 * 	每个测试用例的第一行包含一个整数，表示歌单的总长度K(1<=K<=1000)。
 * 	接下来的一行包含四个正整数，分别表示歌的第一种长度A(A<=10)和数量X(X<=100)以及歌的第二种长度B(B<=10)和数量Y(Y<=100)。
 * 	保证A不等于B。 *
 *
 * 	输出描述:
 * 	输出一个整数,表示组成歌单的方法取模。因为答案可能会很大,输出对1000000007取模的结果。
 *
 * 	输入例子1:
 * 	5
 * 	2 3 3 3
 *
 * 	输出例子1:
 * 	9
 */

import java.util.Scanner;

public class QList {

    public static void main(String[] args) {
        // TODO 自动生成的方法存根
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine().toString();
        int len = Integer.parseInt(str1);
        String str = in.nextLine().toString();
        String[] inputInt = str.split(" ");
        int a = Integer.parseInt(inputInt[0]);
        int x = Integer.parseInt(inputInt[1]);
        int b = Integer.parseInt(inputInt[2]);
        int y = Integer.parseInt(inputInt[3]);

        System.out.println(qlist(len,a,x,b,y));
    }

    private static long qlist(int len, int a, int x, int b, int y) {
        // TODO 自动生成的方法存根
        long mod = 1000000007;

        //数学归纳法：C(n,k) = C(n-1,k) + C(n-1,k-1),,即：杨辉三角
        // 构建杨辉三角
        int max = 101;
        long[][] tri = new long[max][max];
        tri[0][0] = 1;
        for(int i = 1;i<max;i++){
            tri[i][0] = 1;
            for(int j = 1;j<max;j++){
                tri[i][j] = (tri[i-1][j-1] + tri[i-1][j])%mod;
            }
        }

        long sum = 0;
        for(int i = 0;i<=len;i++){
            //从总长度循环找出一个合适的值

            //从x首歌中取出i/a,小于100
            //从y首歌中取出（len-i）/b,小于100
            //i是从a首歌中取出的总长度，（len-i）是从b首歌中取出的总长度
            if(i%a==0 && (len-i)%b==0 && i/a<=100 && (len-i)/b<=100){
                //
                sum += tri[x][i/a]*tri[y][(len-i)/b]%mod;
//				System.out.println(sum);
            }
        }
        return sum%mod;
    }
}
