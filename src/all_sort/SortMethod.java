package all_sort;

/**
 * ���������㷨��Ϊ��С��������
 */
public class SortMethod {

    //ð�����򣬸��Ӷ�ΪO(n2)���ȶ�
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

    //ѡ�����򣬸��Ӷ�ΪO(n2�������ȶ�
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

    //�������򣬸��Ӷ�ΪO(n2)���ȶ�
    public static void insertSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];  //tempΪ������Ԫ��
            int j = i - 1;  //jΪ�������е�ĩβԪ�ص��±�
            while(j >= 0 && temp < arr[j]){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    //ϣ��������С�������򣩣����Ӷ�ΪO(n1.3/nlogn)�����ȶ�
    public static void shellSort(int[] arr){
        for (int gap = arr.length / 2; gap > 0 ; gap /= 2) { //�趨����
            for (int i = gap; i < arr.length; i++) { //���ÿһ����ֱ�Ӳ�������
                int j = i;
                while(j - gap >= 0 && arr[j] < arr[j - gap]){
                    int temp = arr[j];
                    arr[j] = arr[j - gap];
                    arr[j - gap] = temp;
                    j = j - gap; //�ص���⣺�����ÿһ������������ʱ����Ҫ�Ƚϸ��������������е�ÿһ��Ԫ�أ�j = j - gap
                }
            }
        }
    }

    //�������򣬸��Ӷ�ΪO(nlogn)�����ȶ�
    public static void quickSort(int[] arr,int left,int right){
        int index;
        if(left < right){
            index = partition(arr,left,right);
            quickSort(arr,left,index - 1);
            quickSort(arr,index + 1,right);
        }
    }
    //���һ��Ԫ��Ϊ��׼������Ҫ�ȴ��ұ��ƶ�����ΪҪ����������׼���������ڻ�׼����ߣ�����������������j���ֵ�
    public static int partition(int[] arr,int left,int right){
        int temp = arr[left];//��׼
        int i = left;
        int j = right;
        while(i != j){
            while(arr[j] >= temp && j > i) //���ұ߿�ʼ���ұ�tempС������û����j--
                j--;
            while(arr[i] <= temp && i < j) //����߿�ʼ���ұ�temp�������û����i++
                i++;
            if(i < j){ //���߸����ҵ��󽻻�Ԫ��
                int n = arr[i];
                arr[i] = arr[j];
                arr[j] = n;
            }
        }
        //�ҵ������i������׼���Ԫ�ؽ���λ�ã�������i
        arr[left] = arr[i];
        arr[i] = temp;
        return i;
    }


    //�����򣬸��Ӷ�ΪO(nlogn)�����ȶ�
    /**
     * 1�������鹹����һ���󶥶ѣ��˶�Ϊ��ʼ����������
     * 2�����Ѷ�Ԫ��R[1]���βԪ��R[n]��������ʱ�õ��µ�������(R1,R2,����Rn-1)���µ�������(Rn),������R[1,2��n-1]<=R[n]��
     * 3�����ڽ������µĶѶ�R[1]����Υ���ѵ����ʣ������Ҫ�Ե�ǰ������(R1,R2,����Rn-1)����Ϊ�¶ѣ�Ȼ���ٴν�R[1]��������
     *    ���һ��Ԫ�ؽ������õ��µ�������(R1,R2��.Rn-2)���µ�������(Rn-1,Rn)�������ظ��˹���ֱ����������Ԫ�ظ���Ϊn-1��
     *    ���������������ɡ�
     */
    public static void heapSort(int[] arr){
        //�����󶥶�
        for (int i = arr.length/2 - 1; i >= 0 ; i--) {
            adjustHeap(arr,i,arr.length);
        }
        //����Ԫ��+�����ѽṹ
        for (int j = arr.length - 1; j > 0 ; j--) {
            swap(arr,0,j);
            adjustHeap(arr,0,j);
        }
    }
    //�����󶥶ѣ����ǵ������̣������ڴ󶥶��ѹ����Ļ����ϣ�
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
    //����Ԫ��
    public static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


    //�鲢����
    /**
     * �Ѵ��������зֳ����������У�ʹÿ������������Ȼ�������������кϲ����������������
     */

    public static void mergeSort(int[] data, int left, int right){
        if (left >= right)
           return ;
        // �ҳ��м�����
        int center = (left + right) / 2;
        // �����������еݹ�
        mergeSort(data, left, center);
        // ���ұ�������еݹ�
        mergeSort(data, center + 1, right);
        // �ϲ�
        merge(data, left, center, right);

    }

    /**
     *
     * ������������й鲢���鲢ǰ��2�����������򣬹鲢����Ȼ����
     * @param data
     * �������
     * @param left
     * ������ĵ�һ��Ԫ�ص�����
     * @param center
     * ����������һ��Ԫ�ص�������center+1���������һ��Ԫ�ص�����
     * @param right
     * ���������һ��Ԫ�ص�����
     */

    public static void merge(int[] data, int left, int center, int right) {
        // ������ʱ����
        int[] tmpArr = new int[data.length];
        // �������һ��Ԫ������
        int mid = center + 1;
        // third ��¼��ʱ���������
        int third = left;
        // �����������һ��Ԫ�ص�����
        int tmp = left;
        while (left <= center && mid <= right) {
            // ������������ȡ����С�ķ�����ʱ����
            if (data[left] <= data[mid]){
                tmpArr[third++] = data[left++];
            } else{
                tmpArr[third++] = data[mid++];
                // count+=center-left+1;
            }
        }
        // ʣ�ಿ�����η�����ʱ���飨ʵ��������whileֻ��ִ������һ����
        while (mid <= right) {
            tmpArr[third++] = data[mid++];
        }
        while (left <= center) {
            tmpArr[third++] = data[left++];
        }
        // ����ʱ�����е����ݿ�����ԭ������,��ԭleft-right��Χ�����ݱ����ƻ�ԭ���飩
        while (tmp <= right){
            data[tmp] = tmpArr[tmp++];
        }
    }
}
