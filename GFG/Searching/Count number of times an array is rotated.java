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
			long[] arr = new long[n];
			String ip[] = br.readLine().trim().split(" ");
			for(int i=0;i<n;i++)
				arr[i]=Long.parseLong(ip[i]);
			int ans = getAns(arr,n);
			System.out.println(ans);
		}
	}
	public static int getAns(long[] arr, int n){
	    int low=0,high=n-1,mid=0;
	    while(low<=high){
	        mid = (low+high)/2;
	        int prev = (mid==0) ? 0 : mid-1;
	        int next = (mid==(n-1)) ? n-1 : mid + 1;
	        if((arr[mid]<arr[prev])&&(arr[mid]<=arr[next]))
	            return mid;
	        else if(arr[mid]>arr[high])
	            low=mid+1;
	        else if(arr[mid]<arr[high])
	            high = mid-1;
	        else
	            high--;
	    }
	    return 0;
	}
}