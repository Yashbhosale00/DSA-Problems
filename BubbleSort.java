import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[]arr = {10, 80, 30, 90, 40, 50, 70};
        int n = arr.length;

        for (int i = 0;i < n -1; i ++){
            for(int j = 0 ; j < n - i - 1;j++){
                if (arr[j]>arr[j +1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }   
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
