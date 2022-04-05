package com.surprise;

import java.util.Scanner;

/*2. Integer to Roman 
Symbol       Value
	I             1
	V             5
	X             10
	L             50
	C             100
	D             500
	M             1000

Example:
Input: num = 58
Output: "LVIII"
Explanation: L = 50, V = 5, III = 3.*/
public class IntegerToRoman {
	static Scanner  scanner=new Scanner(System.in);
	public static void main(String[] args) {
		IntegerToRoman toRoman=new IntegerToRoman();
		toRoman.solving();
	}

	private void solving() {
		System.out.println("Enter your number : ");
		 int k=scanner.nextInt();
		 int n;
		 if(k>=1000) {
			  n=k/1000;
			 while(n-->0) {
			 System.out.print("M");}
			 k=k-(k/1000*1000);
		 }
		 if(k<1000&&k>=500) {
			 System.out.print("D");
			 k-=500;
		 }
		 if(k<500&&k>=100) {
			 n=k/100;
			 while(n-->0) {
			 System.out.print("C");}
			 k=k-(k/100*100);
		 }
		 if(k<100&&k>=50) {
			 System.out.print("L");
			 k-=50;
		 }
		 if(k<50&&k>=10) {
			 n=k/10;
			 while(n-->0) {
			 System.out.print("X");}
			 k=k-(k/10*10);
		 }
		 if(k<10&&k>=5) {
			 System.out.print("V");
			 k-=5;
		 }
		 if(k<5&&k>=1) {
			 while(k-->0) {
			 System.out.print("I");}
			 
		 }
		
	}

}
