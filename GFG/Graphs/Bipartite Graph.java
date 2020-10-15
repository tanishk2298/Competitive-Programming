import java.util.*;
import java.lang.*;
import java.io.*;

class GfG
{
    boolean isBipartite(int g[][],int v){
        int[] color = new int[v];    
        Arrays.fill(color, -1);
        for(int i=0;i<v;i++)
            if(color[i] == -1)
                if(!isBipartiteUtil(g,v,i,color))
                    return false;
        return true;
    }
    boolean isBipartiteUtil(int g[][],int v,int node, int[] color){
        Queue<Integer> que = new LinkedList<>();
        que.add(node);
        color[node] = 1;
        while(!que.isEmpty()){
            int curr = que.poll();
            int[] arr = g[curr];
            for(int i=0;i<v;i++){
                if(arr[i] == 1){
                    if(color[i] == color[curr])
                        return false;
                    if(color[i] == -1){
                        color[i] = 1 - color[curr];
                        que.add(i);
                    }
                }
            }
        }
        return true;
    }
}

class Bipartite
{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
	int t = sc.nextInt();
	while(t-->0){
            int V = sc.nextInt();
	    int[][] G = new int[V][V];
	    for(int i = 0; i < V; i++)
		for(int j = 0; j < V; j++)
		    G[i][j] = sc.nextInt();
	    GfG b = new GfG();
            if (b.isBipartite(G, V))
               System.out.println("1");
            else
               System.out.println("0");
	}
    }
}