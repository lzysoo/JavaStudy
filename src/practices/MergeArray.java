package practices;

/**
 * 将两个升序序列合并为一个序列后且有序
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeArray {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7,9};
        int[] arr2 = {2,4,6,8,10};
        mergeArray(arr1,arr2);
    }

    public static void mergeArray(int[] arr1,int[] arr2){
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr1.length; i++) {
            if(!list.contains(arr1[i]))
                list.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            if(!list.contains(arr2[i]))
                list.add(arr2[i]);
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
