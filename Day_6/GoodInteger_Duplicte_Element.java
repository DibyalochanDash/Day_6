package Day_6;

import java.util.Arrays;

public class GoodInteger_Duplicte_Element {
     public static void main(String[] args) {
		
    	 int arr[]= {-4,-2,3,3,5,5,5,5,8,8,8,8,8,10,17};
    	 
    	 GoodIntegerDuplicate(arr);
	}

	private static void GoodIntegerDuplicate(int[] arr) {
		Arrays.sort(arr);
		
		int count = 0;
		
		int lesscount = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i-1]) {
				lesscount = i;
			} 
			if (arr[i] == lesscount) {
				count++;
			}
		}
		System.out.println(count); // Time complexity O(nlog n)
	}
}
