import java.util.*;
import java.io.*;
import java.lang.*;

class TopologicalSort {
    static int[] topoSort(ArrayList<ArrayList<Integer>> adj, int n) {
        Stack<Integer> stk = new Stack<>();
        int[] ans = new int[n];
        boolean[] vis = new boolean[n];
        Arrays.fill(vis, false);
        for(int i=0;i<n;i++)
            if(vis[i] == false)
                topoSortUtil(i,adj,vis,stk);
        int i=0;
        while(!stk.isEmpty())
            ans[i++] = stk.pop();
        return ans;
    }
    static void topoSortUtil(int v, ArrayList<ArrayList<Integer>> adj, boolean[] vis, Stack<Integer> stk){
        vis[v] = true;
        for(int i : adj.get(v))
            if(vis[i] == false)
                topoSortUtil(i,adj,vis,stk);
        stk.push(v);
    }
}

// Driver Function

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-->0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            String st[] = read.readLine().trim().split("\\s+");
            int edg = Integer.parseInt(st[0]);
            int nov = Integer.parseInt(st[1]);
            for (int i = 0; i < nov + 1; i++)
                list.add(i, new ArrayList<Integer>());
            String s[] = read.readLine().trim().split("\\s+");
            int p = 0;
            for (int i = 1; i <= edg; i++) {
                int u = Integer.parseInt(s[p++]);
                int v = Integer.parseInt(s[p++]);
                list.get(u).add(v);
            }
            int[] res = new TopologicalSort().topoSort(list, nov);
            if (check(list, nov, res) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
    static boolean check(ArrayList<ArrayList<Integer>> list, int V, int[] res) {
        int[] map = new int[V];
        for (int i = 0; i < V; i++)
            map[res[i]] = i;
        for (int i = 0; i < V; i++)
            for (int v : list.get(i))
                if (map[i] > map[v])
		    return false;
        return true;
    }
}