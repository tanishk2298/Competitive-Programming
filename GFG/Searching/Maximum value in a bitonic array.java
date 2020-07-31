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
			String ip[] = br.readLine().trim().split(" ");
			for(int i=0;i<n;i++)
				arr[i]=Integer.parseInt(ip[i]);
			int ans = getAns(arr, n);
			System.out.println(ans);
		}
	}
	public static int getAns(int[] arr, int n){
	    int low =0, high = n-1, mid = 0;
	    while(low<=high){
	        mid = (low+high)/2;
	        int prev = (mid-1)<0 ? 0 : mid-1;
	        int next = ((mid+1) == n) ? n-1 : mid+1;
	        if((arr[mid]>=arr[prev]) && (arr[mid]>=arr[next]))
	            return arr[mid];
	        else if((arr[mid]<arr[prev]) && (arr[mid] > arr[next]))
	            high = mid-1;
	        else
	            low = mid+1;
	    }
	    return arr[n-1];
	}
}