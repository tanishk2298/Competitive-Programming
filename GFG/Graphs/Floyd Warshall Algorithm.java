import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int tc = Integer.parseInt(br.readLine());
	    while(tc-->0){
	        int n = Integer.parseInt(br.readLine());
	        int[][] graph = new int[n][n];
	        for(int i=0;i<n;i++){
	            String[] inp = br.readLine().trim().split(" ");
	            for(int j=0;j<n;j++)
	                graph[i][j] = Integer.parseInt(inp[j]);
	        }
	        graph = floydWarshall(graph,n);
	        printGraph(graph,n);
	    }
	}

	public static int[][] floydWarshall(int[][] graph, int n){
	    for(int k=0;k<n;k++)
	        for(int i=0;i<n;i++)
	            for(int j=0;j<n;j++)
	                graph[i][j] = Math.min(graph[i][j], graph[i][k]+graph[k][j]);
	    return graph;
	}

	public static void printGraph(int[][] graph, int n){
	    int inf = 10000000;
	    for(int i=0;i<n;i++){
	        for(int j=0;j<n;j++){
	            StringBuilder str = new StringBuilder();
	            String curr = (graph[i][j] == inf) ? "INF" : Integer.toString(graph[i][j]);
	            str.append(curr+" ");
	            System.out.print(str);
	        }
	        System.out.println("");
	    }    
	}
}