package com.surprise;

import java.util.Arrays;
import java.util.Scanner;

public class WordsDifferent {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		WordsDifferent wordDiff=new WordsDifferent();
		wordDiff.solving();
	}
	private void solving() {
		System.out.println("Enter two string : ");
		String s1 = scanner.next();
		String s2 = scanner.next();
		String lowerStringOne = s1.toLowerCase();
		String lowerStringTwo = s2.toLowerCase();
		lowerStringOne = toSort(lowerStringOne);
		lowerStringTwo = toSort(lowerStringTwo);
		
		
		int first=s1.length();
		int second=s2.length();
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		int length=second;
		int small=first;
		String longString=s2;
		String smallString=s1;
		if(first>second) {
			small=second;
			length=first;
			longString=s1;
			smallString=s2;
		}
		char sm[]=smallString.toCharArray();
		char lng[]=longString.toCharArray();
		
		for(int i=0;i<small;i++) {//something=>eghimnost
			for(int j=0;j<length;j++) {	//else=>eels
				if(sm[i]==lng[j]) {
					lng[j]='!';
			}
			}
		}
		for(char ch:lng) {
			if(ch==33) {
				continue;
			}
			System.out.print(ch);
		}
	}
	public String toSort(String s) {
		char charArray[] = s.toCharArray();
		Arrays.sort(charArray);
		String sortString = charArray.toString();
		return sortString;
	}

}
