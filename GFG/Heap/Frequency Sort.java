Problem Link = [ https://practice.geeksforgeeks.org/problems/sorting-elements-of-an-array-by-frequency/0 ]
Companies = [ Oracle Zoho Zycus ]

import java.util.*;
import java.lang.*;
import java.io.*;

class Pair implements Comparable<Pair>{
    int val;
    int freq;
    Pair(int val, int freq){
        this.val = val;
        this.freq = freq;
    }
    public int compareTo(Pair obj){
        if(this.freq == obj.freq)
            return obj.val - this.val;
        return this.freq - obj.freq;
    }
}

class GFG
{
	public static void main (String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int tc = sc.nextInt();
	    while(tc-->0){
	        int n = sc.nextInt();
	        HashMap<Integer, Integer> map = new HashMap<>();
	        PriorityQueue<Pair> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
	        for(int i=0;i<n;i++){
	            int curr = sc.nextInt();
	            if(map.containsKey(curr))
	                map.put(curr, map.get(curr) +1);
	            else
	                map.put(curr, 1);
	        }
	        for(Map.Entry mp : map.entrySet()){
	            int val = (int) mp.getKey();
	            int freq = (int) mp.getValue();
	            Pair pair = new Pair(val, freq);
	            maxHeap.add(pair);
	        }
	        String ans = "";
	        while(!maxHeap.isEmpty()){
	            Pair curr = maxHeap.poll();
	            int val = curr.val;
	            int freq = curr.freq;
	            while(freq-->0)
	                ans += (val+" ");
	        }
	        System.out.println(ans);
	    }
	}
}