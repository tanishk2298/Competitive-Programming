Problem Link = [https://practice.geeksforgeeks.org/problems/special-stack/1]
Companies = [Amazon D-E-Shaw FactSet Flipkart Goldman Sachs GreyOrange Kuliza Microsoft One97 SAP Labs Sapient Snapdeal Walmart]

import java.util.*;
import java.io.*;
import java.lang.*;

class GfG
{
    int min;
    Stack<Integer> stk = new Stack<>();
    int getMin(){
	    if(stk.isEmpty())
	        return -1;
	    return min;
    }
    int pop(){
	    if(stk.isEmpty())
	        return -1;
	    int currMin = stk.pop();
	    int popped = stk.pop();
	    if(!stk.isEmpty())
	        min = stk.peek();
	    return popped;
    }
    void push(int x){
	    if(stk.isEmpty() || x < min)
	        min = x;
	    stk.push(x);
	    stk.push(min);
    }	
}

//Driver Function

class Get_Min_From_Stack
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			int q = sc.nextInt();
			GfG g = new GfG();
			while(q-->0){
				int qt = sc.nextInt();
				if(qt == 1){
					int att = sc.nextInt();
					g.push(att);
				}
				else if(qt == 2)
					System.out.print(g.pop()+" ");
				else if(qt == 3)
					System.out.print(g.getMin()+" ");
			}
			System.out.println();
		}
		
	}
}