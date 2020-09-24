import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
 {
	public static void main (String[] args){
	    Scanner sc = new Scanner(System.in);
	    int tc = sc.nextInt();
	    while(tc-->0){
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        for(int i=0;i<n;i++)
	            arr[i] = sc.nextInt();
	        int[][] dp = new int[n][n];
	        for(int i=0;i<n;i++)
	           dp[i][i] = arr[i];
	        for(int i=n-1;i>=0;i--){
	            for(int j=0;j<n;j++){
	                if(j==i+1)
                        dp[i][j]=Math.max(arr[i],arr[j]);
	                else if(j>i){
	                    int op1 = arr[i] + Math.min(dp[i+2][j],dp[i+1][j-1]);
	                    int op2 = arr[j] + Math.min(dp[i+1][j-1],dp[i][j-2]);
	                    dp[i][j] = Math.max(op1,op2);
	                }
	            }
	        }
	        System.out.println(dp[0][n-1]);
	    }
    	}
 }