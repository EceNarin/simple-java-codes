import java.util.Scanner;

/*
 * A Java code that returns the first 10 Prime Numbers after the number we entered.
 * Sample:
 * Input: 7
 * Output: 11 13 17 19 23 29 31 37 41 43
 */

public class PrimeNumber {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num = scan.nextInt();
		
		int i = num + 1;
		int count = 0;
		
		while(count<10) {
			for(int j=i-1; j>1; j--) {
				if(i%j == 0) {
					break;
				}
				if(j == 2) {
					System.out.println(i);
					count++;
				}
			}
			i++;
		}
	}
}