package Day_6;

public class OneUniqueElement_Find {

	public static void main(String[] args) {
	 
		int arr[] = {2,2,3,3,4,4,6,6,7,7,8,9,9,10,10,11,11,12,12,13,13};
  
		int res = One_Unique(arr);
		System.out.println(res);
	}

	private static int One_Unique(int[] arr) {
		
		if (arr[0]!=arr[1]) {
			return arr[0];
			
		}
		if (arr[arr.length-1] != arr[arr.length-2]) {
			return arr[arr.length-1];
		}
		int lo = 2;
		int hi = arr.length-3;
		
		while (lo <= hi) {
			int mid = (lo+hi)/2;
			if (arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]) {
				return arr[mid];
				
			}
			if (arr[mid]==arr[mid-1]) {
				mid--;
			}
			if (mid%2 == 0) {
				lo = mid+2;   
			}else {
				hi = mid -1;
			}
		}
		return -1;  // Time complexity O(logN)
	}

}
