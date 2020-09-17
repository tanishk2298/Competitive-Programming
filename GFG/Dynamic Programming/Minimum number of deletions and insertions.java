import java.io.*;
import java.util.*;

class Solution
{
	public int minOperations(String x, String y){ 
	    	int m = x.length();
        	int n = y.length();
        	int[][] dp = new int[m+1][n+1];
        	for(int i=0;i<=m;i++){
            		for(int j=0;j<=n;j++){
                		if(i==0||j==0)
                    			dp[i][j] = 0;
                		else if(x.charAt(i-1) == y.charAt(j-1))
                    			dp[i][j] = 1 + dp[i-1][j-1];
                		else
                    			dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            		}
        	}
        	return((m-dp[m][n]) + (n-dp[m][n]));
	} 
}

class GfG
{
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0){
                    String s1 = sc.next();
                    String s2 = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.minOperations(s1,s2));
            }
    }
}