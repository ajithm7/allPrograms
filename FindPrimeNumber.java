package interview;
import java.util.Scanner;
public class FindPrimeNumber {

	public static void main(String[] args) {
		FindPrimeNumber prime = new FindPrimeNumber();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = scanner.nextInt();
		scanner.close();
		if (prime.checkPrime(number)) {
			System.out.println(number + " is prime number");
		} else
			System.out.println(number + " is not prime number");

	}

	public boolean checkPrime(int number) {
		
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}return true;
		
	}

}
