package com.surprise;

import java.util.Scanner;

/*  3. Roman to Integer
	Symbol       Value
	I             1
	V             5
	X             10
	L             50
	C             100
	D             500
	M             1000

Example:
Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3
*/
public class RomanToInteger {
	static Scanner  scanner=new Scanner(System.in);
	public static void main(String[] args) {
		RomanToInteger romenInteger=new RomanToInteger();
		romenInteger.solving();
	}
	private void solving() {
		System.out.println("Enter your number : ");
		 String k=scanner.nextLine();
		 int n=0;
		 for(int i=0;i<k.length();i++) {
		 char ch=k.charAt(i);
		 switch(ch) {
		 case 'M'->n+=1000;
		 case 'D'->n+=500;
		 case 'C'->n+=100;
		 case 'L'->n+=50;
		 case 'X'->n+=10;
		 case 'V'->n+=5;
		 case 'I'->n+=1;}
		 }
		System.out.println(n);
	}


}
