import java.util.*;
import java.io.*;
import java.lang.*;

class Solution
{
    static int[] dijkstra(ArrayList<ArrayList<Integer>> g, int src, int v)
    {
        boolean[] vis = new boolean[v];
        Arrays.fill(vis, false);
        int[] val = new int[v];
        Arrays.fill(val, Integer.MAX_VALUE);
        val[src] = 0;
        int[] parent = new int[v];
        parent[0] = -1;
        for(int i=0;i<v-1;i++){
            int min = Integer.MAX_VALUE;
            int curr = 0;
            for(int j=0;j<v;j++){
                if(vis[j] == false && val[j] < min){
                    min = val[j];
                    curr = j;
                }
            }
            vis[curr] = true;
            for(int j=0;j<v;j++){
                if(vis[j] == false && g.get(curr).get(j) != 0 && val[curr] != Integer.MAX_VALUE && (val[curr] + g.get(curr).get(j) < val[j])){
                    val[j] = val[curr] + g.get(curr).get(j);
                    parent[j] = curr;
                }
            }
        }
        return val;
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
