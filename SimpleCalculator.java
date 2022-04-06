package com.surprise;
import java.util.Scanner;
import java.util.Stack;


/*Simple Calculator
 Given a string s which represents an expression, evaluate this expression and return its value. 
The integer division should truncate toward zero.
You may assume that the given expression is always valid. All intermediate results will be in the range of [-231, 231 - 1].

Example:
Input: s = "3+2*2"
Output: 7*/
public class SimpleCalculator {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		SimpleCalculator calculator=new SimpleCalculator();
		calculator.solving();
	}

	private void solving() {
		System.out.println("Enter your string : ");
		String s=scanner.nextLine();//"3+2*2"
		int result=calculate(s);
		System.out.println(result);
	}

	
		    public int calculate(String s) {
		        Stack<Integer> stack=new Stack<>();
		        int length=s.length();
		        int number=0;
		        int sign=1;
		        char operator=' ';
		        for(int i=0;i<length;i++){
		            char c=s.charAt(i);
		            if(Character.isDigit(c)){
		                int temp=0;
		                while(i<length && Character.isDigit(s.charAt(i))){//22*4+5-3*6
		                    temp=temp*10+s.charAt(i)-'0';
		                    i++;
		                }
		                i--;
		                if(operator=='*')number=number*temp;
		                else if(operator=='/')number=number/temp;
		                else number=temp;
		                operator=' ';
		            }
		            else if(c=='*') operator='*';
		            else if(c=='/')operator='/';
		            else if(c=='+'){stack.push(sign*number);sign=1;}//88,+
		            else if(c=='-'){stack.push(sign*number);sign=-1;}//5,-,
		        }
		        number*=sign;//-18
		        while(!stack.isEmpty()){//-18+5=>-13+88=>75
		            number+=stack.pop();
		        }
		        return number;
		    }
		
 }

