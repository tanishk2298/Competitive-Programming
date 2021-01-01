Problem Link = [ https://practice.geeksforgeeks.org/problems/infix-to-postfix-1587115620/1 ]
Companies = [ Paytm VMWare ]

import java.util.*;
import java.lang.*;

class solve{
	public static String infixToPostfix(String exp) {
		Stack<Character> stk = new Stack<>();
		char[] arr = exp.toCharArray();
		String postfix = "";
		for(int i=0;i<arr.length;i++){
		    if(arr[i] == '(')
		        stk.push(arr[i]);
		    else if((arr[i] >= 'a' && arr[i] <= 'z') || (arr[i] >= 'A' && arr[i] <= 'Z'))
		        postfix += arr[i];  
		    else if(arr[i] == ')'){
		        while(!stk.isEmpty() && stk.peek() != '(')
		            postfix += stk.pop();
		        stk.pop();
		    }
		    else{
		        if(!stk.isEmpty() && stk.peek() == '(')
		            stk.push(arr[i]);
		        else{
		            while(!stk.isEmpty() && precision(arr[i]) <= precision(stk.peek()))
		                postfix += stk.pop();
		            stk.push(arr[i]);
		        }
		    }
		}
		while(!stk.isEmpty())
		    postfix += stk.pop();
		return postfix;
	} 
	public static int precision(char ch){
	    if(ch == '+' || ch == '-')
	        return 1;
	    if(ch == '*' || ch == '/')
	        return 2;
	    if(ch == '^')
	        return 3;
	    return 0;
	}
}

//Driver code

class GFG 
{   
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    System.out.println(new solve().infixToPostfix(br.readLine().trim()));
		}
	}
}
