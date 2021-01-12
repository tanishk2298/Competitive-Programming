Problem Link = [ https://practice.geeksforgeeks.org/problems/nearly-sorted-algorithm/0 ]
Companies = [ Flipkart ]

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int tc = sc.nextInt();
	    while(tc-->0){
	        int n = sc.nextInt();
	        int k = sc.nextInt();
	        int[] arr = new int[n];
	        int i;
	        for(i=0;i<n;i++)
	            arr[i] = sc.nextInt();
	        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
	        for(i=0;i<k;i++)
	            minHeap.add(arr[i]);
	        int[] ans = new int[n];
	        for(i=0;i<(n-k);i++){
	            ans[i] = minHeap.poll();
	            minHeap.add(arr[i+k]);
	        }
	        while(minHeap.size() != 0)
	            ans[i++] = minHeap.poll();
	        for(i=0;i<n;i++)
	            System.out.print(ans[i]+" ");
	        System.out.println();
	    }
	}
}