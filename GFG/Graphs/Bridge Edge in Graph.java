import java.io.*;
import java.util.*;

class Graph {
    int v;
    int e;
    ArrayList<Integer>[] edges;
    public Graph(int v, int e) {
        this.v = v;
        this.e = e;
        edges = new ArrayList[v];
        for(int i = 0; i < v; i++)
            edges[i] = new ArrayList<Integer>();
    }
    public void addEdge(int u, int v) {
        edges[u].add(v);
        edges[v].add(u);
    }
}

class Gfg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int v = sc.nextInt();
            int e = sc.nextInt();
            Graph g = new Graph(v, e);
            for (int i = 0; i < e; i++)
                g.addEdge(sc.nextInt(), sc.nextInt());
            Solution obj = new Solution();
            if (obj.isBridge(g, sc.nextInt(), sc.nextInt()))
                System.out.println (1);
            else
                System.out.println (0);
        }
    }
}

class Solution {
    public boolean isBridge(Graph adj, int s, int e) {
        int v = adj.edges.length;
        boolean[] vis1 = new boolean[v];
        Arrays.fill(vis1, false);
        dfs(adj, vis1, s);
        adj.edges[s].remove(new Integer(e));
        adj.edges[e].remove(new Integer(s));
        boolean[] vis2 = new boolean[v];
        Arrays.fill(vis2, false);
        dfs(adj, vis2, s);
        for(int i=0;i<v;i++)
            if(vis1[i] != vis2[i])
                return true;
        return false;
    }
    public static void dfs(Graph adj, boolean[] vis, int s){
        vis[s] = true;
        for(Integer v : adj.edges[s])
            if(vis[v] == false)
                dfs(adj, vis, v);
    }
}