Problem Link = [ https://practice.geeksforgeeks.org/problems/minimum-cost-of-ropes-1587115620/1 ]
Companies = [ Amazon Goldman Sachs OYO Rooms ]

import java.util.*;
import java.lang.*;
import java.io.*;

class solve {
    long minCost(long arr[], int n) {
        long sum = 0;
        PriorityQueue<Long> minHeap = new PriorityQueue<>();
        for(int i=0;i<n;i++)
            minHeap.add(arr[i]);
        while(minHeap.size() != 1){
            long temp = minHeap.poll() + minHeap.poll();
            sum += temp;
            minHeap.add(temp);
        }
        return sum;
    }
}

// Driver code

class GFG {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            long arr[] = new long[n];
            for (int i=0;i<n;i++) 
                arr[i] = in.nextLong();
            System.out.println(new solve().minCost(arr, n));
        }
    }
}
