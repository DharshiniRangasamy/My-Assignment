package JavaAssignment2;

import java.util.Arrays;

public class FindsecoundLargestnumber {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		int length =arr.length;
		System.out.println("secound largest  number is "+ arr[length-2]);
		
		

	}

}
