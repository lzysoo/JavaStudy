package leetcode.leetcode_fivestars;

/**
 * NIG Game:
 *      ���������ѣ�������һ���� Nim��Ϸ����������һ��ʯͷ��ÿ�����������õ� 1 - 3 ��ʯͷ�� �õ����һ��ʯͷ���˾��ǻ�ʤ�ߡ�����Ϊ���֡�
 *      �����Ǵ����ˣ�ÿһ���������Ž⡣ ��дһ�����������ж����Ƿ�����ڸ���ʯͷ�����������Ӯ����Ϸ��
 */

public class NigGame {

    public boolean canWinNigName(int n){
        return !(n%4 == 0);
    }
}
