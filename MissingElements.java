package JavaAssignment2;

import java.util.Arrays;

public class MissingElements {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		for(int i= 0; 1<arr.length; i++) {
			if(i+1!= arr[i])
				System.out.println(i+2);
			break;
		}

	}

}
