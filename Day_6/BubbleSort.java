package Day_6;

public class BubbleSort {
	public static void main(String[] args) {
		
		int arr[] = {5,7,6,4,10,-2,6,8};
		
		BubbleSorts(arr);
	}

	private static void BubbleSorts(int[] arr) {
		int N = arr.length;
		for (int i = 0; i < N-1; i++) {
			for (int j = 0; j < N-1-i; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
