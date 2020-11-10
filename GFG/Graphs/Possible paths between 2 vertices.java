import java.util.*;
import java.io.*;
import java.lang.*;

class Path {
    static int count;
    static int countPaths(ArrayList<ArrayList<Integer>> g, int s, int d) {
        count = 0;
        dfs(g,s,d);
        return count;
    }
    static void dfs(ArrayList<ArrayList<Integer>> g, int s, int d){
        if(s == d)
            count++;
        else
            for(Integer v : g.get(s))
                dfs(g,v,d);
    }
}

//Driver Class

class Graph {
    int size;
    Graph(int V) { this.size = V; }
    Graph() {}
    static void addEdge(ArrayList<ArrayList<Integer>> list, int u, int v) {
        list.get(u).add(v);
    }
}
class DriverClass {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-->0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            String str[] = read.readLine().trim().split(" ");
            int nov = Integer.parseInt(str[0]);
            int edg = Integer.parseInt(str[1]);
            new Graph(nov);
            for (int i = 0; i < nov + 1; i++)
                list.add(i, new ArrayList<Integer>());
            str = read.readLine().trim().split(" ");
            int k = 0;
            for (int i = 1; i <= edg; i++) {
                int u = Integer.parseInt(str[k++]);
                int v = Integer.parseInt(str[k++]);
                new Graph().addEdge(list, u, v);
            }
            str = read.readLine().trim().split(" ");
            int s = Integer.parseInt(str[0]);
            int d = Integer.parseInt(str[1]);
            System.out.println(new Path().countPaths(list, s, d));
        }
    }
}
