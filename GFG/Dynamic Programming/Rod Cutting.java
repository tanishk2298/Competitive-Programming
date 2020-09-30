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
	        int[] price = new int[n];
	        for(int i=0;i<n;i++)
	            price[i] = sc.nextInt();
	        int[] len = new int[n];
	        for(int i=0;i<n;i++)
	            len[i] = i+1;
	        int[][] dp = new int[n+1][n+1];
	        for(int i=0;i<=n;i++){
	            for(int j=0;j<=n;j++){
	                if(i==0 || j==0)
	                    dp[i][j] = 0;
	                else if(len[i-1] <= j)
	                    dp[i][j] = Math.max(price[i-1] + dp[i][j-len[i-1]], dp[i-1][j]);
	                else
	                    dp[i][j] = dp[i-1][j];
	            }
	        }
	        System.out.println(dp[n][n]);
	    }
	 }
}