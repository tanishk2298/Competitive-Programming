import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
        public static int time;
        public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            int e = sc.nextInt();
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for(int i=0;i<n;i++)
                adj.add(i, new ArrayList<Integer>());
            for(int i=0;i<e;i++){
                int u = sc.nextInt();
                int v = sc.nextInt();
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            time = 0;
            int[] parent = new int[n];
            Arrays.fill(parent, -1);
            int[] disc = new int[n];
            Arrays.fill(disc, -1);
            int[] low = new int[n];
            Arrays.fill(low, -1);
            boolean[] articulationPt = new boolean[n];
            Arrays.fill(articulationPt, false);
            for(int i=0;i<n;i++)
                if(disc[i] == -1)
                    dfs(i,adj,disc,low,articulationPt,parent);
            for(int i=0;i<n;i++)
                if(articulationPt[i] == true)
                    System.out.print(i+" ");
            System.out.println("");
        }
    }
    public static void dfs(int u, ArrayList<ArrayList<Integer>> adj, int[] disc, int[] low, boolean[] articulationPt, int[] parent){
        disc[u] = time;
        low[u] = time;
        time++;
        int child = 0;
        for(Integer v : adj.get(u)){
            if(disc[v] == -1){
                child++;
                parent[v] = u;
                dfs(v,adj,disc,low,articulationPt,parent);
                low[u] = Math.min(low[u], low[v]);
                if(parent[u] == -1 && child > 1)
                    articulationPt[u] = true;
                if(parent[u] != -1 && low[v] >= disc[u])
                    articulationPt[u] = true;
            }
            else if(parent[u] != v)
                low[u] = Math.min(low[u], disc[v]);
        }
    }
}