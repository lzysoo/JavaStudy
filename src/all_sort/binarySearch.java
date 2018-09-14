package all_sort;

public class binarySearch {

    //若想记录循环和递归的次数，则添加两个变量count1,count2
    private int count1 = 0;
    private int count2 = 0;

    public int getCount1() {
        return count1;
    }

    public int getCount2() {
        return count2;
    }

    //循环实现二分查找
    public int binarySearch1(int[] arr,int findValue){
        int low = 0;
        int high = arr.length - 1;
        if(findValue < arr[low] || findValue > arr[high] || low > high)
            return -1;
        while (low <= high){
            count1++;
            int mid = (low + high)/2;
            if(findValue == arr[mid])
                return mid;
            else if (findValue < arr[mid])
                high = mid -1;
            else
                low = mid + 1;
        }
        return -1;
    }

    //递归实现二分查找
    public int binarySearch2(int[] arr,int findValue,int low,int high){
        count2++;
        int mid = (low + high) / 2;
        if(findValue < arr[low] || findValue > arr[high] || low > high)
            return -1;
        if(findValue == arr[mid])
            return mid;
        else if(findValue < arr[mid])
            return binarySearch2(arr, findValue, low, mid - 1);
        else
            return binarySearch2(arr, findValue, mid + 1, high);
    }

    public static void main(String[] args) {
        binarySearch bs = new binarySearch();
        int[] arr = {2,5,6,8,9,13,18};
        int findValue = 2;
        int low = 0;
        int high = arr.length - 1;
        bs.binarySearch1(arr,findValue);
        int count1 = bs.getCount1();
        bs.binarySearch2(arr,findValue,low,high);
        int count2 = bs.getCount2();
        System.out.println("循环的次数为："+count1);
        System.out.println("递归的次数为："+count2);
    }
}
