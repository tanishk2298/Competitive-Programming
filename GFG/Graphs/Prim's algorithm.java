import java.util.*;
import java.io.*;
import java.lang.*;

class MST {
    static int spanningTree(int v, int e, ArrayList<ArrayList<Integer>> g) {
        int[][] graph = new int[v][v];
        for(int i=0;i<v;i++){
            ArrayList<Integer> curr = g.get(i);
            for(int j=0;j<v;j++){
                if(curr.get(j) == Integer.MAX_VALUE)
                    graph[i][j] = 0;
                else
                    graph[i][j] = curr.get(j);
            }
        }
        int[] parent = new int[v];
        int[] val = new int[v];
        boolean[] vis = new boolean[v];
        Arrays.fill(val, Integer.MAX_VALUE);
        Arrays.fill(vis,false);
        parent[0] = -1;
        val[0] = 0;
        for(int i=0;i<(v-1);i++){
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
                if(vis[j] == false && graph[curr][j] != 0 && graph[curr][j] < val[j]){
                    val[j] = graph[curr][j];
                    parent[j] = curr;
                }
            }
        }
        int minDist = 0;
        for(int i=1;i<v;i++){
            int x = i;
            int y = parent[i];
            minDist += graph[x][y];
        }
        return minDist;
    }
}

// Driver Function

public class Driver_class {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-->0) {
            String str[] = read.readLine().trim().split(" ");
            int V = Integer.parseInt(str[0]);
            int E = Integer.parseInt(str[1]);
            ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
            for (int i = 0; i < V; i++) {
                ArrayList<Integer> temp = new ArrayList<>();
                for (int j = 0; j < V; j++) temp.add(Integer.MAX_VALUE);
                graph.add(temp);
            }
            str = read.readLine().trim().split(" ");
            int k = 0;
            int i=0;
            while (i++<E) {
                int u = Integer.parseInt(str[k++]);
                int v = Integer.parseInt(str[k++]);
                int w = Integer.parseInt(str[k++]);
                u--;
                v--;
                graph.get(u).set(v, w);
                graph.get(v).set(u, w);
            }
            System.out.println(new MST().spanningTree(V, E, graph));
        }
    }
}