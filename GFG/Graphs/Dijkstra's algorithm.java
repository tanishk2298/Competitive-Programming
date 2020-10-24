import java.util.*;
import java.io.*;
import java.lang.*;

class Solution
{
    static int[] dijkstra(ArrayList<ArrayList<Integer>> g, int src, int v)
    {
        boolean[] vis = new boolean[v];
        Arrays.fill(vis, false);
        int[] dist = new int[v];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        for(int i=0;i<v;i++){
            int min = Integer.MAX_VALUE;
            int curr = 0;
            for(int j=0;j<v;j++){
                if(vis[j] == false && dist[j] < min){
                    min = dist[j];
                    curr = j;
                }
            }
            if(curr == v)
                break;
            vis[curr] = true;
            int cnt = 0;
            for(Integer x : g.get(curr)){
                if(vis[cnt] == false && x!=0 && (dist[curr]+x) < dist[cnt])
                    dist[cnt] = dist[curr] + x;
                cnt++;
            }
        }
        return dist;
    }
}

// Driver Function

class Gfg
{
    static void printSolution(int dist[], int n){
        for(int i = 0; i < n; i++)
            System.out.print(dist[i] + " ");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next()); 
        while(t--> 0){
            int V = Integer.parseInt(sc.next());;
            ArrayList<ArrayList<Integer>> list = new ArrayList<>(V);
            for(int i = 0;i < V; i++){
                ArrayList<Integer> temp = new ArrayList<>(V);
                list.add(i, temp);
            } 
            for(int i = 0; i < V; i++){
                ArrayList<Integer> temp = list.get(i);
                for(int j = 0; j < V; j++)
                {
                    temp.add(Integer.parseInt(sc.next()));
                }
                list.add(temp);
            }
            int s = Integer.parseInt(sc.next());;
            Solution T = new Solution();
            int[] res = T.dijkstra(list, s, V);
            printSolution (res, V);
            System.out.println();
        }
    }
}