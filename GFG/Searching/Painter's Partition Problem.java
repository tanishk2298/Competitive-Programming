/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases-->0){
		    int m = sc.nextInt();
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    long max = 0, arrSum = 0;
		    for(int i=0;i<n;i++){
		        arr[i] = sc.nextInt();
		        if(arr[i]>max)
		            max = arr[i];
		        arrSum += arr[i];
		    }
		    System.out.println(paintersPartition(arr,n,m,max,arrSum));
		}
	}
	
	public static long paintersPartition(int[] arr, int n, int m, long max, long arrSum){
	    long low = max;
	    long high = arrSum;
	    long ans = -1;
	    while(low <= high){
	        long mid = low + (high-low) / 2;
	        if(isValid(arr,n,m,mid)){
	            ans = mid;
	            high = mid - 1;
	        }
	        else
	            low = mid + 1;
	    }
	    return ans;
	}
	
	public static boolean isValid(int[] arr, int n, int m, long mid){
	    int painters = 1;
	    long sum = 0;
	    for(int i=0;i<n;i++){
	        sum += arr[i];
	        if(sum>mid){
	            painters++;
	            sum = arr[i];
	        }
	        if(painters > m)
	            return false;
	    }
	    return true;
	}
}