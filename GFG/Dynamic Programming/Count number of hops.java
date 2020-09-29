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
	        System.out.println(hops(n));
	    }
	 }
	 public static int hops(int n){
	     if(n == 0 || n == 1)
	        return 1;
	     if(n == 2)
	        return 2;
	     int[] dp = new int[n+1];
	     dp[0] = dp[1] = 1;
	     dp[2] = 2;
	     for(int i=3;i<=n;i++)
	        dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
	     return(dp[n]);  
	 }
}