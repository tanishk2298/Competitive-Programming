Problem Link = [ https://www.geeksforgeeks.org/find-k-closest-points-to-the-origin/ ]

import java.util.*;

class Pair implements Comparable<Pair>{
    int sq;
    String xy;
    Pair(int sq, String xy){
        this.sq = sq;
        this.xy = xy;
    }
    public int compareTo(Pair obj){
        return this.sq - obj.sq;
    }
}

public class GFG{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            int[][] inp = new int[n][2];
            for(int i=0;i<n;i++)
                for(int j=0;j<2;j++)
                    inp[i][j] = sc.nextInt();
            int k = sc.nextInt();
            PriorityQueue<Pair> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
            for(int i=0;i<n;i++){
                int x = inp[i][0];
                int y = inp[i][1];
                int sq = (int)(Math.pow(x,2) + Math.pow(y,2));
                String xy = x+" "+y;
                Pair pair = new Pair(sq, xy);
                maxHeap.add(pair);
                if(maxHeap.size() > k)
                    maxHeap.poll();
            }
            int[][] ans = new int[k][2];
            for(int i=0;i<k;i++){
                String[] curr = maxHeap.poll().xy.split(" ");
                ans[i][0] = Integer.parseInt(curr[0]);
                ans[i][1] = Integer.parseInt(curr[1]);
                System.out.println(ans[i][0] +" "+ ans[i][1]);
            }
        }
    }
}