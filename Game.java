package com.suprise;

import java.util.Scanner;

public class Game {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Game objectGame=new Game();
		objectGame.Process();
	}
	public void Process() {
		int requiredValue=sc.nextInt();	
		int []array=new int[4];
		for(int i=0;i<4;i++) {
			array[i]=sc.nextInt();
		}
		calculation(array,requiredValue);
		
	}
	public void calculation(int[]array,int key) {
		char operator[]= {'+','-','*','/'};
		for(int i=0;i<4;i++) {
			char a=operator[i];
			switch(a) {
			case '+'->{
				if((array[0]+array[1]+array[2]+array[3])==key) {
					System.out.println((array[0]+"+"+array[1]+"+"+array[2]+"+"+array[3])+"="+key);
				}}
			case '-'->{
				if((array[0]-array[1]-array[2]-array[3])==key) {
					System.out.println((array[0]+"-"+array[1]+"-"+array[2]+"-"+array[3])+"="+key);
				}}
			case '*'->{
				if((array[0]*array[1]*array[2]*array[3])==key) {
					System.out.println((array[0]+"*"+array[1]+"*"+array[2]+"*"+array[3])+"="+key);
				}}
			case '/'->{
				if((array[0]/array[1]/array[2]/array[3])==key) {
					System.out.println((array[0]+"/"+array[1]+"/"+array[2]+"/"+array[3])+"="+key);
				}}
			
			}
			
			}
		}		
		
	}


