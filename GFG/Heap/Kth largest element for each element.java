Problem Link = [ https://practice.geeksforgeeks.org/problems/kth-largest-element-in-a-stream/0 ]
Companies = [  Amazon Cisco Hike OYO Rooms Walmart ]

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
	        int k = sc.nextInt();
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        for(int i=0;i<n;i++)
	            arr[i] = sc.nextInt();
	        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
	        for(int i=0;i<n;i++){
	            minHeap.add(arr[i]);
	            if(minHeap.size() < k)
	                System.out.print(-1+" ");
	            else{
	                if(minHeap.size() > k)
	                    minHeap.poll();
	                System.out.print(minHeap.peek()+" ");
	            }
	        }
	        System.out.println();
	    }
	}
}