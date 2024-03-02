package Day_6;

public class SearchInRange {
	
	public static void main(String[] args) {
		
		int arr[] = {2,6,5,4,9,7,3};
		int target = 7;
		
		int res =SearchRange(arr,target,3 , 6);
		System.out.println(res);
	}

	private static int SearchRange(int[] arr, int target, int i, int j) {
		if (arr.length == 0) {
			return -1;
		}
		for (int j2 = i; j2 <= j; j2++) {
			
			if (arr[j2] ==target) {
				return j2;
			}
		}
		return -1;
	}

}
