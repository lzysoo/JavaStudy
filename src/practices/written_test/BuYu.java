package practices.written_test;

/**
 * ��ҵ�ﲶ�㣺
 */

public class BuYu {
    public static void main(String[] args) {
        int j = 0,k = 0,l = 0,m = 0,n = 6,x = 0;
        while (n > 5) {
            j = 4 * (n - 1) / 5;
            k = 4 * (j - 1) / 5;
            l = 4 * (k - 1) / 5;
            m = 4 * (l - 1) / 5;
            if (n % 5 == 1 && j % 5 == 1 && k % 5 == 1 && l % 5 == 1 && m % 5 == 1) {
                System.out.println("���ٺϻﲶ�㣺" + n + "��");
                System.out.println("A��B��C��D��E�ֱ����������Ϊ��" + n + "��" + j + "��" + k + "��" + l + "��" + m + "��");
                break;
            }
            n++;
        }
    }
}
