import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args){
	    Scanner sc = new Scanner(System.in);
	    int tc = sc.nextInt();
	    while(tc-->0){
	        String x = sc.next();
	        StringBuilder y = new StringBuilder(x);
	        y.reverse();
	        int m = x.length();
	        int n = m;
	        int[][] dp = new int[m+1][n+1];
	        for(int i=0;i<=m;i++){
	            for(int j=0;j<=n;j++){
	                if(i==0 || j==0)
	                    dp[i][j] = 0;
	                else if(x.charAt(i-1) == y.charAt(j-1))
	                    dp[i][j] = 1 + dp[i-1][j-1];
	                else
	                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
	            }
	        }
	        System.out.println(n-dp[m][n]);
	    }
	}
}