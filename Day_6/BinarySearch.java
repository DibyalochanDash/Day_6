package Day_6;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6, 7, 8, 9}; // Sorted array
        int k = 3;
        
        boolean res = binarySearch(arr, k);
        System.out.println(res);
    }

    private static boolean binarySearch(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;
        
        while (low <= high) {
            int mid = (low + high)/ 2;
            
            if (arr[mid] == k) {
                return true;
            } else if (arr[mid] < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}
