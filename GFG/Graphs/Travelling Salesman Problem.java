import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main (String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int tc = sc.nextInt();
	    while(tc-->0){
	        int n = sc.nextInt();
	        int[][] mat = new int[n][n];
	        for(int i=0;i<n;i++)
	            for(int j=0;j<n;j++)
	                mat[i][j] = sc.nextInt();
	        boolean[] vis = new boolean[n];
	        Arrays.fill(vis, false);
	        int minCost = travellingSalesman(mat, vis, n, 0);
	        System.out.println(minCost);
	    }
	}
	public static int travellingSalesman(int[][] mat, boolean[] vis, int n, int curr){
	    vis[curr] = true;
	    int cost, minCost = Integer.MAX_VALUE;
	    for(int i=0;i<n;i++){
	        if(vis[i] == false){
	            cost = mat[curr][i] + travellingSalesman(mat, vis, n, i);
	            minCost = Math.min(cost, minCost);
	        }
	    }
	    vis[curr] = false;
	    if(minCost == Integer.MAX_VALUE)
	        return mat[curr][0];
	    return minCost;
	}
}