package leetcode.leetcode_fivestars;

/**
 * ����������������ָ���򣨴������ң��͵��򣨴������󣩶�����һ��������
 * �ж�һ�����ǲ��ǻ������֣����������true���������false
 * eg: 121  true
 *     -121 false
 *
 */

public class PalindromeNumber {
    public static void main(String[] args) {
        int n = 12233221;
        int n1 = -121;
        int n2 = 120;
        System.out.println(isPalindromeNumber(n));
        System.out.println(isPalindromeNumber(n1));
        System.out.println(isPalindromeNumber(n2));
}

    public static boolean isPalindromeNumber(int n){
        //nС��0�����ܱ�10����ʱ����ֱ�ӷ��� false
        if(n < 0 || (n != 0 && n % 10 ==0))
            return false;
        int reverse = 0;
        // ����Ϊ n > reverse ������Ϊ���������ǽ�n��һ�뷭ת��˳�����ѷ�ת�Ĳ��ֺ�δ��ת������ȣ����ָ���Ϊż��������
        // δ��ת���� = �ѷ�ת / 10 (���ָ���Ϊ������)����˵������ n Ϊ������
        while (n > reverse){
            reverse = reverse * 10 + n % 10;
            n = n / 10;
        }
        return (n == reverse || n == reverse / 10);
    }
}
