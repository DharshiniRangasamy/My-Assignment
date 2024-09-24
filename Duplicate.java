package JavaAssignment2;

public class Duplicate {

	public static void main(String[] args) {
		int[] count = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		int length = count.length;
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (count[i] == count[j]) {

					System.out.println("Duplicate found: " + count[i]);

				}
			}
		}
	}
}
