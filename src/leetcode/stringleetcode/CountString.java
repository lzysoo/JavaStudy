package leetcode.stringleetcode;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * 统计字符串中每个字符出现的次数
 *
 * 1、定义一个方法
 * 2、定义一个HashMap集合，键（key）：Character   值（value）：Integer
 * 3、把字符串转化为字符数组
 * 4、遍历字符数组得到每一个字符
 * 5、拿刚刚得到的字符作为key到集合中去找值，看返回值
 *       若为null，说明该key不存在，就把该字符作为key，1作为value存储；
 *       若不为null，说明该key存在，就把value +1，然后重新存储该key和value
 * 6、定义一个字符串缓冲区变量
 * 7、遍历集合，得到键和值，按要求进行拼接
 * 8、把字符串缓冲区变量转换为字符串输出
 *
 */
public class CountString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        countString(s);
    }

    public static void countString(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        char[] chs = s.toCharArray();
        for (char ch:chs) {
            Integer value = map.get(ch);
            if(value == null)
                map.put(ch,1);
            else{
                value++;
                map.put(ch,value);
            }
        }

        StringBuilder sb = new StringBuilder();

        Set<Character> set = map.keySet();
        for (Character key:set){
            Integer value = map.get(key);
            sb.append(value).append(key);
        }
        String result = sb.toString();
        System.out.println(result);
    }
}
