package practices.written;

public class MaxAdjacent {
    public static void main(String[] args) {
        int[] arr = {1,11,23,24};
        maxAdjacent(arr);
    }

    public static void maxAdjacent(int[] arr) {
        int max = 0;
        int i = 0;
        int j = 1;
        int k = 0;
        int temp;
        while (j < arr.length) {
            temp = Math.abs(arr[i] - arr[j]);
            if (max < temp) {
                max = temp;
                k = i;
            }
            i++;
            j++;
        }

        System.out.println(arr[k] + " " + arr[k +1]);
    }
}
