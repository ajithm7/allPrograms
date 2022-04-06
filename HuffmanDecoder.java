package com.surprise;
import java.util.ArrayList;
/*1. HuffmanDecoder
Here we will not make huffman code, but we'll be decoding one
The dictionary is already known and it consist of only five coded letters.
A → 0
B → 10
C → 110
D → 1110
E → 1111
You are given the encoded string, return the original one.
 Eg.
Input 1101110 Output:CD
Input 11111100 Output: ECA*/
import java.util.Scanner;
public class HuffmanDecoder {
	static Scanner  scanner=new Scanner(System.in);
	public static void main(String[] args) {
		HuffmanDecoder prefiCommonprefixInArray=new HuffmanDecoder();
		prefiCommonprefixInArray.solving();
	}
	private void solving() {
		ArrayList<String> huffman = new ArrayList<String>();
		huffman.add("A");
		huffman.add("B");
		huffman.add("C");
		huffman.add("D");
		huffman.add("E");
		System.out.println("Enter your number : ");
		String k = scanner.nextLine();
		int count = 0;
		for (int i = 0; i < k.length(); i++) {
			int n = (int) k.charAt(i);
			if(count==4) {
				System.out.print(huffman.get(count));
				count=0;
			}
			 if (n == 48) {
				System.out.print(huffman.get(count));
				count = 0;
			} else  {
				count++;
			}
		}
	}
}
