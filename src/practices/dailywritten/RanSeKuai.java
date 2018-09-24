package practices.dailywritten;

/**
 * 爱奇艺往届秋招测开笔试：红和绿
 * 有一些排成一行的正方形。每个正方形已经被染成红色或者绿色。
 * 现在可以选择任意一个正方形然后用这两种颜色的任意一种进行染色,这个正方形的颜色将会被覆盖。
 * 目标是在完成染色之后,每个红色R都比每个绿色G距离最左侧近。问：最少需要涂染几个正方形。
 * 如样例所示: s = RGRGR
 * 我们涂染之后变成RRRGG满足要求了,涂染的个数为2,没有比这个更好的涂染方案。
 */

import java.util.Scanner;

public class RanSeKuai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int res = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == 'R')
                res++;
        }
        int min = res;
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) == 'R'){
                res--;
                if(res < min)
                    min = res;
            }else{
                res++;
            }
        }
        System.out.println(min);
    }
}
