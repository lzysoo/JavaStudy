package practices;
/**
 *СQ��X�׳���ΪA�Ĳ�ͬ�ĸ��Y�׳���ΪB�Ĳ�ͬ�ĸ裬����СQ������Щ�����һ���ܳ�������ΪK�ĸ赥��
 *     ÿ�׸����ֻ���ڸ赥�г���һ�Σ��ڲ����Ǹ赥�ڸ������Ⱥ�˳�������£������ж�������ɸ赥�ķ�����
 * 	��������:
 * 	ÿ���������һ������������
 * 	ÿ�����������ĵ�һ�а���һ����������ʾ�赥���ܳ���K(1<=K<=1000)��
 * 	��������һ�а����ĸ����������ֱ��ʾ��ĵ�һ�ֳ���A(A<=10)������X(X<=100)�Լ���ĵڶ��ֳ���B(B<=10)������Y(Y<=100)��
 * 	��֤A������B�� *
 *
 * 	�������:
 * 	���һ������,��ʾ��ɸ赥�ķ���ȡģ����Ϊ�𰸿��ܻ�ܴ�,�����1000000007ȡģ�Ľ����
 *
 * 	��������1:
 * 	5
 * 	2 3 3 3
 *
 * 	�������1:
 * 	9
 */

import java.util.Scanner;

public class QList {

    public static void main(String[] args) {
        // TODO �Զ����ɵķ������
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
        // TODO �Զ����ɵķ������
        long mod = 1000000007;

        //��ѧ���ɷ���C(n,k) = C(n-1,k) + C(n-1,k-1),,�����������
        // �����������
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
            //���ܳ���ѭ���ҳ�һ�����ʵ�ֵ

            //��x�׸���ȡ��i/a,С��100
            //��y�׸���ȡ����len-i��/b,С��100
            //i�Ǵ�a�׸���ȡ�����ܳ��ȣ���len-i���Ǵ�b�׸���ȡ�����ܳ���
            if(i%a==0 && (len-i)%b==0 && i/a<=100 && (len-i)/b<=100){
                //
                sum += tri[x][i/a]*tri[y][(len-i)/b]%mod;
//				System.out.println(sum);
            }
        }
        return sum%mod;
    }
}
