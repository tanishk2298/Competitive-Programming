import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
   {
	public static void main (String[] args){
	    Scanner sc = new Scanner(System.in);
	    int cases = sc.nextInt();
	    while(cases-->0){
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        int sum = 0;
	        for(int i=0;i<n;i++){
	            arr[i] = sc.nextInt();
	            sum += arr[i];
	        }
	        boolean[][] dp = new boolean[n+1][sum+1];
	        for(int i=0;i<=sum;i++)
	            dp[0][i] = false;
	        for(int i=0;i<=n;i++)
	            dp[i][0] = true;
	        for(int i=1;i<=n;i++){
	            for(int j=1;j<=sum;j++){
	                if(arr[i-1] <= j)
	                    dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
	                else
	                    dp[i][j] = dp[i-1][j];
	            }
	        }
	        int ans = 0;
	        for(int i=(sum/2);i>=0;i--){
	            if(dp[n][i] == true){
	                ans = sum - (2 * i);
	                break;
	            }
	        }
	        System.out.println(ans);
	    }
	}
   }