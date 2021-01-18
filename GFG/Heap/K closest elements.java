Problem Link = [ https://practice.geeksforgeeks.org/problems/k-closest-elements3619/1 ]
Companies = [ Amazon OYO Rooms ]

import java.io.*;
import java.util.*;

class Pair implements Comparable<Pair>{
    int val;
    int diff;
    Pair(int val, int diff){
        this.val = val;
        this.diff = diff;
    }
    public int compareTo(Pair obj){
        if(this.diff == obj.diff)
            return obj.val - this.val;
        return this.diff - obj.diff;    
    }
}

class Solution {
    int[] printKClosest(int[] arr, int n, int k, int x) {
        PriorityQueue<Pair> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++){
            if(arr[i] == x)
                continue;
            maxHeap.add(new Pair(arr[i], Math.abs(arr[i] - x)));
            if(maxHeap.size() > k)
                maxHeap.poll();
        }
        int[] ans = new int[k];
        int i = 0;
        while(maxHeap.size() != 0)
            ans[i++] = maxHeap.poll().val;
        i = 0;
        int j = k-1;
        while(i < j){
            int temp = ans[i];
            ans[i] = ans[j];
            ans[j] = temp;
            i++;
            j--;
        }
        for(i=1;i<k;i++){
            if((Math.abs(ans[i] - x) == Math.abs(ans[i-1] - x)) && ans[i] > ans[i-1]){
                int temp = ans[i];
                ans[i] = ans[i-1];
                ans[i-1] = temp;
            }
        }
        return ans;
    }
}

//Driver code

public class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            inputLine = br.readLine().trim().split(" ");
            int k = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);


            int[] ans = new Solution().printKClosest(arr, n, k, x);
            for (int xx : ans) {
                System.out.print(xx + " ");
            }
            System.out.println();
        }
    }
}
