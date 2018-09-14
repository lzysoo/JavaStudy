package all_sort;

/**
 * 以下排序算法均为从小到大排序
 */
public class SortMethod {

    //冒泡排序，复杂度为O(n2)，稳定
    public static void bubbleSort(int[] arr){
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    //选择排序，复杂度为O(n2），不稳定
    public static void selectSort(int[] arr){
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    //插入排序，复杂度为O(n2)，稳定
    public static void insertSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];  //temp为待插入元素
            int j = i - 1;  //j为已排序列的末尾元素的下标
            while(j >= 0 && temp < arr[j]){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    //希尔排序（缩小增量排序），复杂度为O(n1.3/nlogn)，不稳定
    public static void shellSort(int[] arr){
        for (int gap = arr.length / 2; gap > 0 ; gap /= 2) { //设定步长
            for (int i = gap; i < arr.length; i++) { //针对每一组做直接插入排序
                int j = i;
                while(j - gap >= 0 && arr[j] < arr[j - gap]){
                    int temp = arr[j];
                    arr[j] = arr[j - gap];
                    arr[j - gap] = temp;
                    j = j - gap; //重点理解：在针对每一组做插入排序时，需要比较该组已排序序列中的每一个元素，j = j - gap
                }
            }
        }
    }

    //快速排序，复杂度为O(nlogn)，不稳定
    public static void quickSort(int[] arr,int left,int right){
        int index;
        if(left < right){
            index = partition(arr,left,right);
            quickSort(arr,left,index - 1);
            quickSort(arr,index + 1,right);
        }
    }
    //设第一个元素为基准，则需要先从右边移动，因为要将交汇点与基准交换，放在基准的左边，所以这个点必须是由j发现的
    public static int partition(int[] arr,int left,int right){
        int temp = arr[left];//基准
        int i = left;
        int j = right;
        while(i != j){
            while(arr[j] >= temp && j > i) //从右边开始，找比temp小的数，没有则j--
                j--;
            while(arr[i] <= temp && i < j) //从左边开始，找比temp大的数，没有则i++
                i++;
            if(i < j){ //两边各自找到后交换元素
                int n = arr[i];
                arr[i] = arr[j];
                arr[j] = n;
            }
        }
        //找到交汇点i，将基准与该元素交换位置，并返回i
        arr[left] = arr[i];
        arr[i] = temp;
        return i;
    }


    //堆排序，复杂度为O(nlogn)，不稳定
    /**
     * 1、将数组构建成一个大顶堆，此堆为初始的无序序列
     * 2、将堆顶元素R[1]与堆尾元素R[n]交换，此时得到新的无序区(R1,R2,……Rn-1)和新的有序区(Rn),且满足R[1,2…n-1]<=R[n]；
     * 3、由于交换后新的堆顶R[1]可能违反堆的性质，因此需要对当前无序区(R1,R2,……Rn-1)调整为新堆，然后再次将R[1]与无序区
     *    最后一个元素交换，得到新的无序区(R1,R2….Rn-2)和新的有序区(Rn-1,Rn)。不断重复此过程直到有序区的元素个数为n-1，
     *    则整个排序过程完成。
     */
    public static void heapSort(int[] arr){
        //构建大顶堆
        for (int i = arr.length/2 - 1; i >= 0 ; i--) {
            adjustHeap(arr,i,arr.length);
        }
        //交换元素+调整堆结构
        for (int j = arr.length - 1; j > 0 ; j--) {
            swap(arr,0,j);
            adjustHeap(arr,0,j);
        }
    }
    //调整大顶堆（仅是调整过程，建立在大顶堆已构建的基础上）
    public static void adjustHeap(int[] arr,int i,int length){
        int temp = arr[i];
        for (int k = i * 2 + 1; k < length; k = k * 2 + 1) {
            if(k + 1 < length && arr[k] < arr[k + 1])
                k++;
            if(arr[k] > temp){
                arr[i] = arr[k];
                i = k;
            }
            else
                break;;
        }
        arr[i] = temp;
    }
    //交换元素
    public static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


    //归并排序
    /**
     * 把待排序序列分成若干子序列，使每个子序列有序，然后把有序的子序列合并成整体有序的序列
     */

    public static void mergeSort(int[] data, int left, int right){
        if (left >= right)
           return ;
        // 找出中间索引
        int center = (left + right) / 2;
        // 对左边数组进行递归
        mergeSort(data, left, center);
        // 对右边数组进行递归
        mergeSort(data, center + 1, right);
        // 合并
        merge(data, left, center, right);

    }

    /**
     *
     * 将两个数组进行归并，归并前面2个数组已有序，归并后依然有序
     * @param data
     * 数组对象
     * @param left
     * 左数组的第一个元素的索引
     * @param center
     * 左数组的最后一个元素的索引，center+1是右数组第一个元素的索引
     * @param right
     * 右数组最后一个元素的索引
     */

    public static void merge(int[] data, int left, int center, int right) {
        // 申请临时数组
        int[] tmpArr = new int[data.length];
        // 右数组第一个元素索引
        int mid = center + 1;
        // third 记录临时数组的索引
        int third = left;
        // 缓存左数组第一个元素的索引
        int tmp = left;
        while (left <= center && mid <= right) {
            // 从两个数组中取出最小的放入临时数组
            if (data[left] <= data[mid]){
                tmpArr[third++] = data[left++];
            } else{
                tmpArr[third++] = data[mid++];
                // count+=center-left+1;
            }
        }
        // 剩余部分依次放入临时数组（实际上两个while只会执行其中一个）
        while (mid <= right) {
            tmpArr[third++] = data[mid++];
        }
        while (left <= center) {
            tmpArr[third++] = data[left++];
        }
        // 将临时数组中的内容拷贝回原数组中,（原left-right范围的内容被复制回原数组）
        while (tmp <= right){
            data[tmp] = tmpArr[tmp++];
        }
    }
}
