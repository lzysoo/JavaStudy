package practices.written;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WordsByDeleting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mWord = sc.nextLine();
        int numWord = Integer.parseInt(sc.nextLine());
        String[] strs = new String[numWord];
        List<String> dictWords = new ArrayList<>();
        for (int i = 0; i < numWord; i++) {
            strs[i] = sc.nextLine();
            dictWords.add(strs[i]);
        }

        List<String> result = wordsByDeleting(mWord,numWord,dictWords);
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
    }

    public static List<String> wordsByDeleting (String mWord,int numWord,List<String> dictWords){
        List<String> list = new ArrayList<>();
        for (int i = 0; i < dictWords.size(); i++) {
            String s = dictWords.get(i);
            int k = 0;
            for (int j = 0; j < mWord.length(); j++) {
                if (k >= s.length())
                    break;
                if (mWord.charAt(j) == s.charAt(k))
                    k++;
            }
            if (k == mWord.length())
                list.add(s);
        }

        Collections.sort(list);
        return list;
    }
}
