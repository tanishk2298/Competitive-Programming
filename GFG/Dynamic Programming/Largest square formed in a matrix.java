import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args){
	    Scanner sc = new Scanner(System.in);
	    int tc = sc.nextInt();
	    while(tc-->0){
	        int n = sc.nextInt();
	        int m = sc.nextInt();
	        int[][] mat = new int[n][m];
	        for(int i=0;i<n;i++)
	            for(int j=0;j<m;j++)
	                mat[i][j] = sc.nextInt();
	        int[][] dp = new int[n+1][m+1];
	        System.out.println(largestSquare(mat,dp,n,m));
	    }
	}
	public static int largestSquare(int[][] mat, int[][] dp,int n, int m){
	    int max = Integer.MIN_VALUE;
	    for(int i=0;i<=n;i++){
	        for(int j=0;j<=m;j++){
	            if(i==0||j==0)
	                dp[i][j] = 0;
	            else if(mat[i-1][j-1] == 1)
	                dp[i][j] = 1 + Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]));
	            max = Math.max(dp[i][j],max);
	        }
	    }   
	    return max;
	}
}