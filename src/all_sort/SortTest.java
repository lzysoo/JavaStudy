package all_sort;

public class SortTest {
    public static void main(String[] args) {
        int[] arr = {13,2,1,9,4,0,18,3,7};
//        SortMethod.bubbleSort(arr);
//        System.out.print("√∞≈›≈≈–Ú");
//        SortMethod.selectSort(arr);
//        System.out.print("—°‘Ò≈≈–Ú");
//        SortMethod.insertSort(arr);
//        System.out.print("≤Â»Î≈≈–Ú");
//        SortMethod.quickSort(arr,0,arr.length - 1);
//        System.out.print("øÏÀŸ≈≈–Ú");
//        SortMethod.shellSort(arr);
//        System.out.print("œ£∂˚≈≈–Ú");
//        SortMethod.mergeSort(arr,0,arr.length - 1);
//        System.out.print("πÈ≤¢≈≈–Ú");
        SortMethod.heapSort(arr);
        System.out.println("∂—≈≈–Ú");
        printArray(arr);

  }

    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1)
                System.out.println(arr[i] + "]");
            else
                System.out.print(arr[i] + ",");
        }
    }
}
