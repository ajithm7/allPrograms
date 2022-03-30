package com.suprise;

import java.util.Arrays;
import java.util.Scanner;
// Write a program to check whether the given two strings are anagrams of each other.

public class Anagram {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Anagram anagram = new Anagram();
		anagram.aragramFind();
	}

	private void aragramFind() {
		String stringOne = sc.next();
		String stringTwo = sc.next();
		String lowerStringOne = stringOne.toLowerCase();
		String lowerStringTwo = stringTwo.toLowerCase();
		lowerStringOne = toSort(lowerStringOne);
		lowerStringTwo = toSort(lowerStringTwo);
		boolean b = lowerStringOne.equals(lowerStringTwo);
		 System.out.println(b);
		if (!b) {
			System.out.println("The string is anagram");
		} else {
			System.out.println("The string is not anagram");
		}
	}

	public String toSort(String s) {
		char charArray[] = s.toCharArray();
		Arrays.sort(charArray);
		String sortString = charArray.toString();
		return sortString;
	}

}
