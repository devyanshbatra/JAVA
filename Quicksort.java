import java.util.Arrays;

public class QuickSortWorstCase {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        quickSortWorstCase(arr, 0, arr.length - 1);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void quickSortWorstCase(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSortWorstCase(arr, low, pivotIndex - 1);
            quickSortWorstCase(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low]; 
        int right = high;
        while (true) {
            while ( left <= right && arr[left] <= pivot) {
                left++;
            }
            while (left <= right && arr[right] >= pivot) {
                right--;
            }
            if (left <= right) {
                int temp = arr[left];
            }   
        }     
    }
}
