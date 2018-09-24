package leetcode.HotLeetcode;

/**
 * 比较版本号：version1 > version2 ,return 1
 *           version1 < version2 ,return -1
 *           version1 = version2 ,return 0
 *
 * 这道题需要注意的点：
 *      1、切割时 “.” 的转义
 *      2、切割后每个数字的格式其实是字符串，需要转换
 */

public class CompareVersion {
    public static void main(String[] args) {
        String version1 = "3.02";
        String version2 = "3.2.1";
        System.out.println(compareVersion(version1,version2));
    }

    public static int compareVersion(String version1,String version2){
        String[] strs1 = version1.split("\\\\.");
        String[] strs2 = version2.split("\\\\.");
        int length = Math.max(strs1.length,strs2.length);
//        int result = 0;
//        a:for (int i = 0; i < length; i++) {
//            int n1 = i < version1.length() ? Integer.valueOf(strs1[i]).intValue() : 0;
//            int n2 = i < version2.length() ? Integer.valueOf(strs2[i]).intValue() : 0;
//            if (i == length - 1 && n1 == n2)
//                result = 0;
//            if (n1 < n2){
//                result = -1;
//                break a;
//            }else if (n1 > n2) {
//                result = 1;
//                break a;
//            }else
//                continue;
//        }
//        return result;

        for (int i = 0; i < length; i++) {
            Integer v1 = i < version1.length() ? Integer.parseInt(strs1[i]): 0;
            Integer v2 = i < version2.length() ? Integer.parseInt(strs2[i]) : 0;
            int compare = v1.compareTo(v2);
            if (compare != 0)
                return compare;
        }
        return 0;
    }
}
