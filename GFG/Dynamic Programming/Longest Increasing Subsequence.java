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
	        int[] dp = new int[n];
	        dp[0] = 1;
	        int max = dp[0];
	        for(int i=1;i<n;i++){
	            dp[i] = 1;
	            for(int j=0;j<i;j++)
	                if(arr[i] > arr[j])
	                    dp[i] = Math.max(dp[i],dp[j]+1);
	            max = Math.max(dp[i],max);
	        }
	        System.out.println(max);
	    }
	}
}