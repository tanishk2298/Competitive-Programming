import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main (String[] args){
	    Scanner sc = new Scanner(System.in);
	    int tc = sc.nextInt();
	    while(tc-->0){
	        String str = sc.next();
	        Stack<Character> stk = new Stack<>();
	        int rev = 0;
	        for(int i=0;i<str.length();i++){
	            char curr = str.charAt(i);
	            if(curr == '{')
	                stk.push(curr);
	            else if(stk.isEmpty()){
	                stk.push('{');
	                rev++;
	            }
	            else
	                stk.pop();
	        }
	        if(stk.size() %2 != 1)
	            rev += stk.size() /2;
	        else
	            rev = -1;
	        System.out.println(rev);
	    }
	}
}