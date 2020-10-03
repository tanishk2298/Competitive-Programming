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
	        int[] arr = new int[n];
	        for(int i=0;i<n;i++)
	            arr[i] = sc.nextInt();
	        if(arr[0] == 0 || n == 0)
	            System.out.println(-1);
	        else
	            System.out.println(minJumps(arr));
	    }
	}
	public static int minJumps(int[] arr){
	    int n = arr.length;
	    int[] dp = new int[n];
	    Arrays.fill(dp, Integer.MAX_VALUE);
	    dp[0] = 0;
	    for(int i=0;i<n;i++)
	        for(int j=i+1;j<=(i+arr[i]) && j<n;j++)
	            dp[j] = Math.min(1+dp[i], dp[j]);
	    if(dp[n-1] == Integer.MAX_VALUE)
	        return -1;
	    return dp[n-1];
	}
}