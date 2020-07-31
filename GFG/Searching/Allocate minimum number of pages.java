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
			long max = 0, arrSum = 0;
			for(int i=0;i<n;i++){
				arr[i]=Integer.parseInt(ip[i]);
				if(arr[i]>max)
				    max = arr[i];
				arrSum += arr[i];
			}
			int m = Integer.parseInt(br.readLine().trim());
			System.out.println(minPages(arr, n, m, arrSum, max));
		}
	}
	
	public static long minPages(int[] arr, int n, int m, long arrSum, long max){
	    long low = max;
	    long high = arrSum;
	    long ans = -1;
	    if(n<m)
	        return ans;
	    while(low<=high){
	        long mid = low + (high-low) / 2;
	        if(isValid(arr, n, m, mid)){
	            ans = mid;
	            high = mid - 1;
	        }
	        else
	            low = mid + 1;
	    }
	    return ans;
	}
	
	public static boolean isValid(int[] arr, int n, int m, long mid){
	    long student = 1;
	    long sum = 0;
	    for(int i=0;i<n;i++){
	        sum += arr[i];
	        if(sum > mid){
	            student++;
	            sum = arr[i];
	        }
	        if(student>m)
	            return false;
	    }
	    return true;
	}
}