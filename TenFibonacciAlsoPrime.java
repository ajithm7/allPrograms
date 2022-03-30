package com.suprise;


import java.util.Scanner;
// Write a program to find the first 10 fibonacci numbers that are also prime
//Two way of solving I use here
//One way is given as comment
public class TenFibonacciAlsoPrime {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		TenFibonacciAlsoPrime ten=new TenFibonacciAlsoPrime();
		ten.getPrime();

	}
	private void getPrime( ) {
		int n,fibo=0,a=0,b=1;
		int count=10;
		
		sc.close();
		while(count!=0) {
			//int prime=0;
			fibo+=a;
			a=b;
			b=fibo;
			n=fibo;
			
			  if (n == 1) continue;
			 
			if ((n % 5 != 0) && (n % 7 != 0) && (n == 2 || n == 3 || (n % 6 == 1 || n % 6 == 5))) {
				System.out.print(n + " ");
				count--;
			} /*
				 * for(int i=2;i<n/2;i++){ if(n%i==0){ prime++; break; } } if (n == 1 || n==0)
				 * continue; if(prime==0) { System.out.print(n + " "); count--;}
				 */
			
		}
			
		}

	}


