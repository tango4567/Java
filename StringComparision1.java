import java.util.Scanner;

class StringComparision1 {

	public static void main(String[] args) {
		
		String name1 = "Bob";
		String name2 = new String("Bob");
		String name3 = "Bob";
		// 1st case
		if (name1 == name2) {
			System.out.println("The strings are equal.");
		} else {
			System.out.println("The strings are unequal.");
		}
		// 2nd case
		if (name1 == name3) {
			System.out.println("The strings are equal.");
		} else {
			System.out.println("The strings are unequal.");
		}
	}
}