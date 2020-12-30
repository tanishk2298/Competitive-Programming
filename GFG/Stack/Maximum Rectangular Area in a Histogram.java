Problem Link = [https://practice.geeksforgeeks.org/problems/maximum-rectangular-area-in-a-histogram-1587115620/1]

import java.util.*;
import java.io.*;
import java.lang.*;

class solve{
    public static long getMaxArea(long hist[], long len)  {
        int n = (int)len;
        Stack<Integer> stk = new Stack<>();
        long[] leftSmaller = new long[n];
        long[] rightSmaller = new long[n];
        for(int i=0;i<n;i++){
            while(!stk.isEmpty() && hist[i] <= hist[stk.peek()])
                stk.pop();
            if(stk.isEmpty())
                leftSmaller[i] = -1;
            else
                leftSmaller[i] = stk.peek();
            stk.push(i);
        }
        stk.clear();
        for(int i=(n-1);i>=0;i--){
            while(!stk.isEmpty() && hist[i] <= hist[stk.peek()])
                stk.pop();
            if(stk.isEmpty())
                rightSmaller[i] = n;
            else
                rightSmaller[i] = stk.peek();
            stk.push(i);
        }
        long[] width = new long[n];
        for(int i=0;i<n;i++)
            width[i] = rightSmaller[i] - leftSmaller[i] - 1;
        long maxArea = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
            maxArea = Math.max(maxArea, hist[i] * width[i]);
        return maxArea;
    }
}


//Driver Function

class GFG {
    	public static void main (String[] args) throws IOException 
        {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    long n = Long.parseLong(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[(int)n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    System.out.println(new solve().getMaxArea(arr, n));
		}
	}
}