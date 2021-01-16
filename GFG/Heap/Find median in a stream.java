Problem Link = [ https://practice.geeksforgeeks.org/problems/find-median-in-a-stream-1587115620/1 ]
Companies = [ Adobe Amazon Apple D-E-Shaw Facebook Flipkart Google Microsoft Morgan Stanley Ola Cabs Oracle Samsung Yahoo ]

import java.util.*;
import java.lang.*;
import java.io.*;

class FindMedian
{
    static PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
    static PriorityQueue<Integer> min = new PriorityQueue<>();
    
    public static void insertHeap(int x)
    {
        if(max.isEmpty() || x < max.peek())
            max.add(x);
        else
            min.add(x);
        balanceHeaps();
    }
    
    public static void balanceHeaps()
    {
       int diff = Math.abs(min.size() - max.size());
       if(diff > 1){
            if(max.size() > min.size())
                min.add(max.poll());
            else
                max.add(min.poll());
       }
    }
    
    public static double getMedian()
    {
        if(max.size() == min.size())
            return ((max.peek() + min.peek())/2);
        else if(min.size() > max.size())
            return min.peek();
        return max.peek();
    }
    
}

// Driver code

class Driverclass
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n;
        while(t-->0){
            n = sc.nextInt();
            FindMedian Ans = new FindMedian();
            for(int i = 1; i <= n; i++){
                int x =sc.nextInt();
                Ans.insertHeap(x);
                System.out.println((int)Math.floor(Ans.getMedian()));
            }
        }          
    }
}