import java.io.*;
import java.util.*;

class GFG {
        public static int time = 0;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc-->0){
		    int v = sc.nextInt();
		    int e = sc.nextInt();
		    ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		    for(int i=0;i<v;i++)
		        adj.add(i, new ArrayList<>());
		    for(int i=0;i<e;i++)
		        adj.get(sc.nextInt()).add(sc.nextInt());
		    int[] disc = new int[v];
		    int[] low = new int[v];
		    int[] parent = new int[v];
		    Arrays.fill(disc, -1);
		    Arrays.fill(low, -1);
		    Arrays.fill(parent, -1);
		    ArrayList<String> bridge = new ArrayList<>();
		    for(int i=0;i<v;i++)
		        if(disc[i] == -1)
		            dfs(i,adj,disc,low,parent,bridge);
		    for(int i=0;i<bridge.size();i++)
		        System.out.println(bridge.get(i));
		}
	}
	public static void dfs(int u, ArrayList<ArrayList<Integer>> adj, int[] disc, int[] low, int[] parent, ArrayList<String> bridge){
	    disc[u] = time;
	    low[u] = time;
	    time++;
	    for(Integer v : adj.get(u)){
	        if(disc[v] == -1){
	            parent[v] = u;
	            dfs(v,adj,disc,low,parent,bridge);
	            low[u] = Math.min(low[u], low[v]);
	            if(low[v] > disc[u])
	                bridge.add(u+" "+v);
	        }
	        else if(parent[u] != v)
	            low[u] = Math.min(low[u], disc[v]);
	    }
	}
}