package practices.RC_written_test;

/**
 * �������������в⿪���ԣ�ƴ��������
 * ������ľ��,���ȷֱ���a,b,c�����԰���һһ��ľ����������,
 * Ŀ������������ľ������һ��������,����ϣ����������ε��ܳ�Խ��Խ�á�
 *
 * ˼·���������������ж� ������С��֮���Ƿ������һ������������ֱ�Ӽ����ܳ���
 *      ���������������1��Ȼ�����������ٴαȽ�
 */

import java.util.Arrays;
import java.util.Scanner;

public class PinJieTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int[] arr = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        int perimeter;
        while (true){
            Arrays.sort(arr);
            if (arr[0] + arr[1] > arr[2]) {
                perimeter = arr[0] + arr[1] + arr[2];
                break;
            }
            else
                arr[2]--;
        }
        System.out.println(perimeter);

    }
}
