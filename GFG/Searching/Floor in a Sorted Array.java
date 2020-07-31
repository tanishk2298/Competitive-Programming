/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(br.readLine().trim());
		while(cases-->0){
		    String sz[] = br.readLine().trim().split(" ");
			int n = Integer.parseInt(sz[0]);
			int x = Integer.parseInt(sz[1]);
			int[] arr = new int[n];
			String ip[] = br.readLine().trim().split(" ");
			for(int i=0;i<n;i++)
				arr[i]=Integer.parseInt(ip[i]);
			int ans = getAns(arr,x);
			System.out.println(ans);
		}
	}

	public static int getAns(int[] arr, int x){
	    	int n = arr.length;
        	int low=0,high=n-1,mid=0;
        	int o=0;
        	while(low<=high){
            		mid=(low+high)/2;
            		if(arr[mid]==x)
                		return mid;
            		else if(arr[mid]<x){
                		o = mid;
                		low = mid+1;
            		}
            		else
                		high = mid-1;
        	}
        	if(arr[0]>x)
            		return -1;
        	return o;
	}
}