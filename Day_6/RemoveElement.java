package Day_6;

public class RemoveElement {
	
	public static void main(String[] args) {
		
		int arr[] = {3,2,2,3};
		int k = 3;
		
		int res = Remove(arr,k);
		System.out.println(res);
	}

	private static int Remove(int[] arr, int k) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != k) {
				arr[count] = arr[i];
				count++;
			}
		}
		return count;
	}

}
