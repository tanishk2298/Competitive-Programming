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
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        int[] ans = new int[n];
	        for(int i=0;i<n;i++)
	            arr[i] = sc.nextInt();
	        Stack<Integer> stk = new Stack<>();
	        for(int i=0;i<n;i++){
                while(stk.size() > 0 && stk.peek() >= arr[i])
                    stk.pop();
                if(stk.size() == 0)
                    ans[i] = -1;
                else
                    ans[i] = stk.peek();
                stk.push(arr[i]);
	        }
	        for(int i=0;i<n;i++)
	            System.out.print(ans[i]+" ");
	        System.out.println("");
	    }
	}
}