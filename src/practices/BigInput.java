package practices;

/**
 * ����¼�������ݣ���0�������������Щ�����е����ֵ
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BigInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>(); //��Ϊ��֪������¼�����ݵĸ����������ü��ϴ洢
        //��0������ֻҪ¼��Ĳ���0������ӵ�������
        while (true){
            System.out.print("���������ݣ�");
            int num = sc.nextInt();
            if (num != 0)
                arr.add(num);
            else
                break;
        }
        //����ת��Ϊ���飬������������
        Integer[] i = new Integer[arr.size()];
        arr.toArray(i);
        Arrays.sort(i);
        System.out.println("��������ֵΪ��" + i[i.length - 1]);
    }
}
