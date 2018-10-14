package practices.written;

/**
 * 快手笔试：
 * 输入年月日，判断该日期是次年份的第几天
 */

import java.time.LocalDate;
import java.util.Scanner;

public class WhichDayOfTheYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        LocalDate date = LocalDate.of(y,m,d);
        System.out.println(date.getDayOfYear());

    }
}
