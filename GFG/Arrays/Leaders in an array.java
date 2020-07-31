/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main (String[] args)throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int cases = Integer.parseInt(br.readLine().trim());
    	while(cases-->0){
    		int n = Integer.parseInt(br.readLine().trim());
    		int[] arr = new int[n];
    		String inputLine1[] = br.readLine().trim().split(" ");
    		for(int i=0;i<n;i++)
    			arr[i]=Integer.parseInt(inputLine1[i]);
            	int leader = arr[n-1];
    	    	for(int i=n-2;i>=0;i--){
    	        	if(leader<=arr[i])
    	            		leader = arr[i];
    	       		else
    	            		arr[i] = -100;
    	    	}
    	    	StringBuffer sb=new StringBuffer();
    	    	for(int i=0;i<n;i++)
    	        	if(arr[i] != -100)
    	            		sb.append(arr[i]+" ");
    	    	System.out.println(sb);
    	}
    }
}
