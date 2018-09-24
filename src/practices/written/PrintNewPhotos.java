package practices.written;

/**
 * DVTE���Ա���⣺
 * 1-11---1  �� - ���� 00���������ַ������滻����
 * ���룺һ���ַ�����һ������
 * ��������滻����ַ����ɳ��ȴ��ڸ�����ʱ������null
 *      ��������滻����ַ���
 */

public class PrintNewPhotos {
    public static void main(String[] args) {
        String photo = "1-1--11";
        int max = 15;
        System.out.println(printNewPhotos(photo,max));
    }

    public  static String printNewPhotos(String photo,int maxLength) {
        StringBuilder sb = new StringBuilder();
        char[] chs = photo.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            if (chs[i] == '1')
                sb.append("1");
            if (chs[i] == '-')
                sb.append("00");
        }
        photo = sb.toString();
        if (photo.length() <= maxLength)
            return photo;
        else
            return "null";
    }
}
