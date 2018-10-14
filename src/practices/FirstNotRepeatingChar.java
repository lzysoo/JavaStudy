package practices;

/**
 * 返回一个字符串中首次出现的只出现了一次的字符及该字符的下标
 */

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class FirstNotRepeatingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int index = firstNotRepeatingChar(s);
        System.out.println(index + "=" + s.charAt(index));
    }

    public static int firstNotRepeatingChar(String s){
        HashMap<Character,Integer> map  = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i)))
                map.put(s.charAt(i),1);
            else
                map.put(s.charAt(i),map.get(s.charAt(i)) + 1);
        }
        Set<Character> set = map.keySet();
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }
}
