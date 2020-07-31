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
			int x = Integer.parseInt(br.readLine().trim());
			int ans = getAns(arr,n,x);
			System.out.println(ans);
		}
	}

	public static int getAns(long[] arr, int n, int x){
	    int low=0,high=n-1,mid=0;
	    while(low<=high){
	        mid = (low+high)/2;
	        if(arr[mid] == x)
	            return mid;
            else if(arr[low]<=arr[mid]){
                if((x>=arr[low]) && (x<=arr[mid]))
                    high = mid - 1;
                else
                    low = mid + 1;
            }
            else{
                if((x>=arr[mid]) && (x<=arr[high]))
                    low = mid + 1;
                else
                    high = mid - 1;
            }
	    }
	    return -1;
	}
}