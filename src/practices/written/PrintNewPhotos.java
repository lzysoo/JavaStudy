package practices.written;

/**
 * DVTE笔试编程题：
 * 1-11---1  把 - 换成 00，不能用字符串的替换方法
 * 输入：一个字符串，一个数字
 * 输出：当替换后的字符串成长度大于该数字时，返回null
 *      否则，输出替换后的字符串
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
