package practices.dailywritten;

/**
 * �������������в⿪���ԣ������
 * ��һЩ�ų�һ�е������Ρ�ÿ���������Ѿ���Ⱦ�ɺ�ɫ������ɫ��
 * ���ڿ���ѡ������һ��������Ȼ������������ɫ������һ�ֽ���Ⱦɫ,��������ε���ɫ���ᱻ���ǡ�
 * Ŀ���������Ⱦɫ֮��,ÿ����ɫR����ÿ����ɫG�������������ʣ�������ҪͿȾ���������Ρ�
 * ��������ʾ: s = RGRGR
 * ����ͿȾ֮����RRRGG����Ҫ����,ͿȾ�ĸ���Ϊ2,û�б�������õ�ͿȾ������
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
