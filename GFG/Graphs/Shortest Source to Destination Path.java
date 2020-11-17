import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{ 
    	public static int ans;
    	public static void main (String[] args){
	    Scanner sc = new Scanner(System.in);
	    int tc = sc.nextInt();
	    while(tc-->0){
	        int n = sc.nextInt();
	        int m = sc.nextInt();
	        int[][] graph = new int[n][m];
	        for(int i=0;i<n;i++)
	            for(int j=0;j<m;j++)
	                graph[i][j] = sc.nextInt();
	        int tx = sc.nextInt();
	        int ty = sc.nextInt();
	        if(graph[tx][ty] != 0)
	            graph[tx][ty] = 2;
	        boolean[][] vis = new boolean[n][m];
	        for(boolean[] row : vis)
	            Arrays.fill(row, false);
	        ans = Integer.MAX_VALUE;
	        minSteps(graph, 0, 0, 0, vis);
	        if(ans == Integer.MAX_VALUE)
	            System.out.println(-1);
	        else
	            System.out.println(ans);
	    }
	}
	public static void minSteps(int[][] graph, int i, int j, int steps, boolean[][] vis){
        	if(i<0 || i>= graph.length || j<0 || j>=graph[0].length || vis[i][j] == true || graph[i][j] == 0)
            	    return;
        	if(graph[i][j] == 2){
                    ans = Math.min(ans, steps);
                    return;
            	}
        	vis[i][j] = true;
        	minSteps(graph, i+1, j, steps+1, vis);
        	minSteps(graph, i, j+1, steps+1, vis);
        	minSteps(graph, i-1, j, steps+1, vis);
        	minSteps(graph, i, j-1, steps+1, vis);
	}
}