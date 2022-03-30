package com.suprise;

import java.util.Scanner;
/* Given an array of integers and a positive integer k, determine the number of (i,j) pairs
where i < j and ar[i] + ar[j] is divisible by k.
*/
public class Pairs {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		Pairs objectPairs=new Pairs();
		objectPairs.intiateArray();
	}
 public void intiateArray() {
	 System.out.println("Enter length of array :");
	 int length=sc.nextInt();
	 System.out.println("Enter element of array :");
	 int []pairArray=new int[length];
	 for(int i=0;i<length;i++) {
		 pairArray[i]=sc.nextInt();
		 
	 }System.out.println("Enter a positive integer : ");
	 int k=sc.nextInt();
	 pair(pairArray,k);
	 
 }
 public void pair(int []array, int k) {
	 for(int i=0;i<array.length;i++) {
		 for(int j=i+1;j<array.length;j++) {
			 if((array[i]+array[j])%k==0) {
				 System.out.println(array[i]+" , "+array[j]);
				 
			 }
		 }
	 }
	 
 }
}
