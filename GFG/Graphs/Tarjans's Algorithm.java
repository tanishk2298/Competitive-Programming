import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
        public static int time;
        public static String ans;
	public static void main (String[] args){
	     Scanner sc = new Scanner(System.in);
	     int tc = sc.nextInt();
	     while(tc-->0){
	         time = 0;
	         ans = "";
	         int n = sc.nextInt();
	         int e = sc.nextInt();
	         ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
	         for(int i=0;i<n;i++)
	            adj.add(i,new ArrayList<>());
	         for(int i=0;i<e;i++){
	             int x = sc.nextInt();
	             int y = sc.nextInt();
	             adj.get(x).add(y);
	         }
	         int[] disc = new int[n];
	         int[] low = new int[n];
	         Stack<Integer> stk = new Stack<>();
	         Arrays.fill(disc,-1);
	         Arrays.fill(low,-1);
	         for(int i=0;i<n;i++)
	            if(disc[i] == -1)
	                dfs(adj,disc,low,stk,i);
	         System.out.println(ans);
	     }
	}
	public static void dfs(ArrayList<ArrayList<Integer>> adj, int[] disc, int[] low, Stack<Integer> stk, int u){
	    disc[u] = time;
	    low[u] = time;
	    stk.add(u);
	    time++;
	    for(Integer v : adj.get(u)){
	        if(disc[v] == -1){
	            dfs(adj,disc,low,stk,v);
	            low[u] = Math.min(low[u], low[v]);
	        }   
	        else if(stk.contains(v))
	            low[u] = Math.min(low[u], disc[v]);
	    }
	    if(disc[u] == low[u]){
	        while(stk.peek() != u)
	            ans += stk.pop()+" ";
	        ans += stk.pop()+",";
	    }
	}
}