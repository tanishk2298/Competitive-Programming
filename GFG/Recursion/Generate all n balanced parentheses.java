import java.util.*;
import java.io.*;

public class GFG {	

	public static void main (String[] args)throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int open = n;
		int close = n;
		String ans = "";
		String op = "";
		parentheses(open , close, ans, op);
	}

	public static void parentheses(int open, int close, String op, String ans){
		if(open == 0 && close == 0){
			ans += op;
			System.out.println(ans);
			return;
		}
		if(open > 0){
			String op1 = op;
			op1 += "(";
			parentheses(open-1,close, op1, ans);
		}
		if(close > open){
			String op2 = op;
			op2 += ")";
			parentheses(open, close-1, op2, ans);
		}
	}
}