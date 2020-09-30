import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    	static int[] dp;
	public static void main (String[] args){
	    Scanner sc = new Scanner(System.in);
	    int tc = sc.nextInt();
	    while(tc-->0){
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        for(int i=0;i<n;i++)
	            arr[i] = sc.nextInt();
	        dp = new int[n+1];
	        Arrays.fill(dp,-1);
	        System.out.println(thief(arr,n));
	    }
	}
	public static int thief(int[] arr, int n){
	    if(n <= 0)
	        return 0;
	    if(dp[n] != -1)
	        return dp[n];
	    dp[n] = Math.max(arr[n-1]+thief(arr,n-2), thief(arr,n-1));
	    return dp[n];
	}
}