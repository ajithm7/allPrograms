package interview;

import java.util.Scanner;
/*Write a program to implement the following case for any other inputs.
Sample Input : 13
Sample Output : 14, 16, 17, 15
To find output :
a)Print even numbers in ascending order following the input until a prime 
number is reached, 
b) then print the odd numbers in descending order preceding the prime 
number until the input is reached.*/
public class PrimeEvenOdd extends FindPrimeNumber {
	public static void main(String[] args) {
		PrimeEvenOdd prime = new PrimeEvenOdd();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = scanner.nextInt();
		scanner.close();
		prime.process(number);
	}

	public void process(int number) {
		//ArrayList<Integer> list = new ArrayList<>();
		int n = number + 1;
		/*
		 * String odd = ""; String even = "";
		 */
		while (!(checkPrime(n))) {
			//list.add(n);
			n++;
		}
		//list.add(n);
		int []array=new int[n-number];
		for(int i=number+1,j=0,k=1;i<=n;i++) {
			if(i%2==0) {
				array[j]=i;
				j++;
			}else {array[array.length-k]=i;k++;}
		}
		for(int a:array) {
			System.out.print(a+" ");
		}
		
		/*
		 * for (int i = 0; i < list.size(); i++) { if (list.get(i) % 2 == 0) { even +=
		 * list.get(i) + ","; } else { odd = list.get(i) + "," + odd; } } even = even +
		 * odd; System.out.println(even.substring(0, even.length() - 1));
		 */
	}

}
//random access file