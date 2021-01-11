Problem Link = [ https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1 ]
Companies = [ ABCO Accolite Amazon Cisco Hike Microsoft Snapdeal VMWare ]

import java.util.*;
import java.lang.*;
import java.io.*;

public static int kthSmallest(int[] arr, int n, int k) 
{ 
    	PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
    	for(int i=0;i<n;i++)
    	{
            maxHeap.add(arr[i]);
                if(maxHeap.size() > k)
                    maxHeap.poll();
        } 
        return maxHeap.poll();
}

//Driver code

class GFG
{
	public static void main (String[] args) 
        {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0){
	        int n=sc.nextInt();
	        int arr[]=new int[n];
	        for(int i=0;i<n;i++)
	    	    arr[i]=sc.nextInt();
	        int k=sc.nextInt();
	        System.out.println(kthSmallest(arr, n, k));
	    }
	} 
}