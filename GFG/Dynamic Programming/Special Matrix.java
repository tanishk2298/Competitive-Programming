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
	        int block = sc.nextInt();
	        int[][] dp = new int[n+1][m+1];
	        for(int i=0;i<block;i++){
	            int row = sc.nextInt();
	            int col = sc.nextInt();
	            dp[row][col] = -1;
	        }
	        int mod = 1000000007;
	        for(int i=1;i<=n;i++){
	            for(int j=1;j<=m;j++){
	                if(i==1 && j == 1)
	                    dp[i][j] = 1;
	                else if(dp[i][j] != -1){
	                    int cond = Math.min(dp[i-1][j], dp[i][j-1]);
	                    if(cond == -1){
	                        if(dp[i-1][j] == dp[i][j-1])
	                            dp[i][j] = -1;
	                        else
	                            dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]) % mod;
	                    }
	                    else
	                        dp[i][j] = (dp[i-1][j] + dp[i][j-1]) % mod;  
	                }
	            }
	        }
	        System.out.println(dp[n][m] % mod);
	    }
	}
}