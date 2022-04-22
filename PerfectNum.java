import java.util.Scanner;

/*
 * A Java code checking the number is a Perfect Number or not.
 * Any number can be a Java Perfect Number if the sum of its positive divisors excluding the number itself is equal to that number.
 * Samples:
 * Input: 6
 * Output: 6 is a Perfect Number
 * Input: 7
 * Output: 7 is not a Perfect Number
 */

public class PerfectNum {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a number:");
        int num = scan.nextInt();
        isPerfect(num);  
	}

	private static void isPerfect(int num) {
		int sum = 0;
		
		for(int i=2; i<=num; i++) {
			if(num%i == 0) {
				sum += (num/i);
			}
		}
		// System.out.println(sum);
		
		if(sum == num) {
			System.out.println(num + " is a Perfect Number");
		} else {
			System.out.println(num + " is not Perfect Number");
		}
	}
}