package JavaAssignment2;

public class Palindrome {

	public static void main(String[] args) {
	String input= "Madam";
	char[]charArray = input.toCharArray();
	for(int i = charArray.length-1; i>=0; i--) {
		System.out.print(charArray[i]);
	}
	

	}

}
