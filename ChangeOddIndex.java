package JavaAssignment2;

public class ChangeOddIndex {
	public static void main(String[] args) {
		String test = "changes";
		char[]charArray = test.toCharArray();
		for(int i =0;i< charArray.length; i++) {
			if(i%2!=0) {
				charArray[1]= Character.toUpperCase(charArray[i]);
			}
		}
		for(int i=0;i<charArray.length;i++) {
			System.out.println(charArray[i]);
		}
		
	}
		
	}


