package all_sort;

public class SortTest {
    public static void main(String[] args) {
        int[] arr = {13,2,1,9,4,0,18,3,7};
//        SortMethod.bubbleSort(arr);
//        System.out.print("ð������");
//        SortMethod.selectSort(arr);
//        System.out.print("ѡ������");
//        SortMethod.insertSort(arr);
//        System.out.print("��������");
//        SortMethod.quickSort(arr,0,arr.length - 1);
//        System.out.print("��������");
//        SortMethod.shellSort(arr);
//        System.out.print("ϣ������");
//        SortMethod.mergeSort(arr,0,arr.length - 1);
//        System.out.print("�鲢����");
        SortMethod.heapSort(arr);
        System.out.println("������");
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
