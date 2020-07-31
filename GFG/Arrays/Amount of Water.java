/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(br.readLine().trim());
		while(cases-->0){
		    int total = Integer.parseInt(br.readLine().trim());
		    int[] arr = new int[total];
		    String inputLine1[] = br.readLine().trim().split(" ");
		    for(int i=0;i<total;i++)
		        arr[i] = Integer.parseInt(inputLine1[i]);
            	    int[] left = new int[total];
            	    int[] right = new int[total];
            	    left[0] = arr[0];
            	    right[total-1] = arr[total-1];
            	    int lmax = 0, rmax = 0;
            	    for(int i=0;i<total;i++){
                	    if(arr[i]>lmax)
                    	    	    lmax = arr[i];
                	    left[i]=lmax;
            	    }
            	    for(int i=total-1;i>=0;i--){
                	    if(arr[i]>rmax)
                    	    	    rmax = arr[i];
                	    right[i]=rmax;
            	    }
            	    int totalwater = 0;
            	    for(int i=0;i<total;i++)
                	    totalwater += Math.min(left[i],right[i]) - arr[i];
            	    System.out.println(totalwater);
		}
	}
}