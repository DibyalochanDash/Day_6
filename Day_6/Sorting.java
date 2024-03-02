package Day_6;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
	
		int arr[]= {-1,-4,3,5,-15,4};
       
		GoodInteger(arr);
	}

	private static void GoodInteger(int[] arr) {
	     
		Arrays.sort(arr);
		
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == i) {
				count++;
			}
			
		}
		System.out.println(count);
	}

}
