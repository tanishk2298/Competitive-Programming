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
	        long[] arr = new long[n];
	        for(int i=0;i<n;i++)
	            arr[i] = sc.nextLong();
	        long sum = 0;
	        Stack<Long> stk = new Stack<>();
	        for(int i=0;i<n;i++){
	            while(stk.size() != 0 && arr[i] > stk.peek()){
	                stk.pop();
	                sum += arr[i];
	            }
	            stk.push(arr[i]);
	        }
	        System.out.println(sum);
	    }
	}
}