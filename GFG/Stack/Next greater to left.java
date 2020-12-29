import java.util.*;
import java.io.*;
import java.lang.*;

class solve{
    public static long[] nextLargerElement(long[] arr, int n) { 
        Stack<Long> stk = new Stack<>();
        long[] ans = new long[n];
        for(int i=0;i<n;i++){
            while(!stk.isEmpty() && arr[i] >= stk.peek())
                stk.pop();
            if(stk.isEmpty())
                ans[i] = -1;
            else
                ans[i] = stk.peek();
            stk.push(arr[i]);
        }
        return ans;
    } 
}

//Driver Function

class GFG 
{  
	public static void main (String[] args) throws IOException 
    {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[n];
		    for(int i=0; i<n; i++)
		        arr[i]=Long.parseLong(inputLine[i]);
		    long[] res = new solve().nextLargerElement(arr, n);
		    for (int i = 0; i < n; i++) 
		        System.out.print(res[i] + " ");
		    System.out.println();
		}
	}
}