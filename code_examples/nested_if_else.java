public class EvenOdd {
	public static void main(String[] args) {

		int num = 8;

		if (num % 2 == 0) {
			if (num<10) {
				System.out.println(num + " is even number less than 10");
			} else {
				System.out.println(num + " is even number greater than 10");
			}
		} else {
			System.out.println(num + " is odd");
		}

	}
}