package com.suprise;

import java.util.Scanner;

import com.ourclass.StaticDemo;

public class Game {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Game objectGame=new Game();
		objectGame.initiateValues();
		
	}
	public void initiateValues() {
		System.out.println("Enter key and 4 variables :");
		int requiredValue=sc.nextInt();	
		int []array=new int[4];
		for(int i=0;i<4;i++) {
			array[i]=sc.nextInt();
		}
		calculation(array,requiredValue);
		System.out.println("Out still processed");
		
	}
	public void calculation(int[]array,int key) {
		int answer=0;
		for(int i=0;i<16;i++) {
			int temp=0;
			
				if((array[0]+array[1]+array[2]+array[3])==key) {
					System.out.println("+"+"+"+"+");
					answer++;
					break;
				}
		
				if((array[0]+array[1]+array[2]-array[3])==key) {
					System.out.println("+"+"+"+"-");
					answer++;
					break;
				}
			
				if((array[0]+array[1]-array[2]-array[3])==key) {
					System.out.println("+"+"-"+"-");
					answer++;
					break;
				}
			
				if((array[0]-array[1]-array[2]-array[3])==key) {
					System.out.println("-"+"-"+"-");
					answer++;
					break;
				}
			 temp=array[0];
			 array[0]=array[1];
			 array[1]=array[2];
			 array[2]=array[3];
			 array[3]=temp;
			}
		 calculationOne(array,key);
		if(answer==0) {
			return;
		}
		if(answer!=0) {
			System.exit(0);
		}
		}	
	public void calculationOne(int[]array,int key) {
		int answer=0;
		for(int i=0;i<16;i++) {
			int temp=0;
			
				if((array[0]-array[1]-array[2]+array[3])==key) {
					System.out.println("-"+"-"+"+");
					answer++;
					break;
				}
		
				if((array[0]-array[1]+array[2]+array[3])==key) {
					System.out.println("-"+"+"+"+");
					answer++;
					break;
				}
			
				if((array[0]*array[1]+array[2]+array[3])==key) {
					System.out.println("*"+"+"+"+");
					answer++;
					break;
				}
			
				if((array[0]+array[1]*array[2]+array[3])==key) {
					System.out.println("+"+"*"+"+");
					answer++;
					break;
				}
				if((array[0]+array[1]+array[2]*array[3])==key) {
					System.out.println("+"+"+"+"*");
					answer++;
					break;
				}
			 temp=array[0];
			 array[0]=array[1];
			 array[1]=array[2];
			 array[2]=array[3];
			 array[3]=temp;
			}
		calculationTwo(array,key);
		
		if(answer==0) {
			return;
		}
		
		if(answer!=0) {
			System.exit(0);
		}
		}	
	
	public void calculationTwo(int[]array,int key) {
		int answer=0;
		for(int i=0;i<16;i++) {
			int temp=0;
			
				if((array[0]-array[1])*array[2]-array[3]==key) {
					System.out.println("(-)"+"*"+"-");
					answer++;
					break;
				}
		
				if((array[0]-array[1]-array[2])*array[3]==key) {
					System.out.println("(--)"+"-");
					answer++;
					break;
				}
			
				if(array[0]*(array[1]-array[2]-array[3])==key) {
					System.out.println("*"+"(--)");
					answer++;
					break;
				}
			
				if((array[0]*array[1]/array[2]-array[3])==key) {
					System.out.println("*/-");
					answer++;
					break;
				}
				if((array[0]*array[1]/array[2]+array[3])==key) {
					System.out.println("*/+");
					answer++;
					break;
				}
			 temp=array[0];
			 array[0]=array[1];
			 array[1]=array[2];
			 array[2]=array[3];
			 array[3]=temp;
			}
		
		if(answer==0) {
			return;
		}
		
		if(answer!=0) {
			System.exit(0);
		}
		}	
	}


