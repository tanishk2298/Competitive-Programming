Problem Link = [ https://practice.geeksforgeeks.org/problems/merge-k-sorted-arrays/1 ]
Companies = [ Amazon Citrix Flipkart Microsoft VMWare ]

import java.util.*;
import java.lang.*;
import java.io.*;

class Node implements Comparable<Node>{
    int val;
    int from;
    int next;
    Node(int val, int from, int next){
        this.val = val;
        this.from = from;
        this.next = next;
    }
    public int compareTo(Node obj){
        return this.val - obj.val;
    }
}

class Solution{
    public static ArrayList<Integer> mergeKArrays(int[][] arr,int k) 
    {
        PriorityQueue<Node> minHeap = new PriorityQueue<>();
        for(int i=0;i<k;i++){
            Node node = new Node(arr[i][0], i, 1);
            minHeap.add(node);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while(minHeap.size() != 0){
            Node curr = minHeap.poll();
            ans.add(curr.val);
            if((curr.next + 1) <= k){
                Node temp = new Node(arr[curr.from][curr.next], curr.from, curr.next + 1);
                minHeap.add(temp);
            }
        }
        return ans;
    }
}

// Driver code

class GFG{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
			int n = sc.nextInt();
			int[][] a = new int[n][n];
			for(int i = 0; i < n; i++)
				for(int j = 0; j < n; j++)
					a[i][j] = sc.nextInt();
			Solution T = new Solution();
			ArrayList<Integer> arr= T.mergeKArrays(a, n);
			for(int i = 0; i < n*n ; i++)
			    System.out.print(arr.get(i)+" ");
		    System.out.println();
		}
	}
}