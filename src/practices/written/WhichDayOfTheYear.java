package practices.written;

/**
 * ���ֱ��ԣ�
 * ���������գ��жϸ������Ǵ���ݵĵڼ���
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
