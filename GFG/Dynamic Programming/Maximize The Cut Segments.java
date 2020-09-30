import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args){
	    Scanner sc = new Scanner(System.in);
	    int cases = sc.nextInt();
	    while(cases-->0){
	        int w = sc.nextInt();
	        int n = 3;
	        int[] arr = new int[n];
	        for(int i=0;i<n;i++)
	            arr[i] = sc.nextInt();
	        int[][] dp = new int[n+1][w+1];
	        for(int i=0;i<=w;i++)
	            dp[0][i] = 0;
	        for(int i=0;i<=n;i++)
	            dp[i][0] = 0;
	        for(int i=1;i<=n;i++){
	            for(int j=1;j<=w;j++){
	                if(arr[i-1] <= j){
	                    int temp = dp[i][j-arr[i-1]];
	                    if(temp != 0 || j-arr[i-1] == 0))
	                        temp++;
	                    dp[i][j] = Math.max(temp,dp[i-1][j]);
	                }
	                else
	                    dp[i][j] = dp[i-1][j];
	            }
	        }
	        System.out.println(dp[n][w]);
	    }
	}
}
