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
		int answer=0;
		for(int i=0;i<16;i++) {
			int temp=0;
			
				if((array[0]+array[1]+array[2]-array[3])==key) {
					System.out.println((array[0]+"+"+array[1]+"+"+array[2]+"-"+array[3])+"="+key);
					answer++;
					break;
				}
		
				if((array[0]+array[1]+array[2]+array[3])==key) {
					System.out.println((array[0]+"+"+array[1]+"+"+array[2]+"+"+array[3])+"="+key);
					answer++;
					break;
				}
			
				if((array[0]*array[1]+array[2]-array[3])==key) {
					System.out.println((array[0]+"*"+array[1]+"+"+array[2]+"-"+array[3])+"="+key);
					answer++;
					break;
				}
			
				if((array[0]*array[1]*array[2]/array[3])==key) {
					System.out.println((array[0]+"*"+array[1]+"*"+array[2]+"/"+array[3])+"="+key);
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
		}		
		
	}


