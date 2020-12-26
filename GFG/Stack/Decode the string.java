import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int tc = sc.nextInt();
	    while(tc-->0){
	        char[] arr = sc.next().toCharArray();
	        Stack<Character> stk = new Stack<>();
	        StringBuffer ans = new StringBuffer();
	        for(int i=0;i<arr.length;i++){
	            if(arr[i] != ']')
	                stk.push(arr[i]);
	            else{
	                String finalPtrn = "";
	                String ptrn = "";
	                while(stk.peek() != '[')
	                    ptrn = stk.pop() + ptrn;
	                stk.pop();
	                String times = "";
	                while(stk.size() > 0 && stk.peek() >= '0' && stk.peek() <= '9')
	                    times = stk.pop() + times;
	                int x = Integer.parseInt(times);
	                while(x-->0)
	                    finalPtrn += ptrn;    
	                for(int j=0;j<finalPtrn.length();j++)
	                    stk.push(finalPtrn.charAt(j));
	            }
	        }
	        while(!stk.isEmpty())
	            ans.append(stk.pop().toString());
	        System.out.println(ans.reverse());
	    }
	}
}