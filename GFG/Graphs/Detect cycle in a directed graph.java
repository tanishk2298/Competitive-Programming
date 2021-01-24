import java.util.*;
import java.lang.*;
import java.io.*;

class DetectCycle
{
    public boolean isCyclic(int v, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[v];
        boolean[] rec = new boolean[v];
        boolean ans = false;
        for(int i=0;i<v;i++){
            if(vis[i] == false)
                ans = dfs(adj,v,i,vis,rec);    
        }
        return ans;
    }
    public static boolean dfs(ArrayList<ArrayList<Integer>> adj, int v, int curr, boolean[] vis, boolean[] rec){
        if(vis[curr] == false){
            vis[curr] = true;
            rec[curr] = true;
            for(Integer i : adj.get(curr)){
                if(vis[i] == false && dfs(adj,v,i,vis,rec))
                    return true;
                else if(rec[i] == true)
                    return true;
            }
        }
        rec[curr] = false;
        return false;
    }
}

class DriverClass
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();    
        while(t-->0){
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int nov = sc.nextInt();
            int edg = sc.nextInt();
            for(int i = 0; i < nov+1; i++)
                list.add(i, new ArrayList<Integer>());
            for(int i = 1; i <= edg; i++){
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            if(new DetectCycle().isCyclic(list, nov) == true)
                System.out.println("1");
            else System.out.println("0");
        }
    }
}
