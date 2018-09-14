package practices;

/**
 * 键盘录入多个数据，以0结束，并输出这些数据中的最大值
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BigInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>(); //因为不知道键盘录入数据的个数，所以用集合存储
        //以0结束，只要录入的不是0，就添加到集合中
        while (true){
            System.out.print("请输入数据：");
            int num = sc.nextInt();
            if (num != 0)
                arr.add(num);
            else
                break;
        }
        //集合转换为数组，并对数组排序
        Integer[] i = new Integer[arr.size()];
        arr.toArray(i);
        Arrays.sort(i);
        System.out.println("输入的最大值为：" + i[i.length - 1]);
    }
}
