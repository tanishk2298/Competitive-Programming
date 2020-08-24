/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception{
        	Scanner sc = new Scanner(System.in);
        	int cases = sc.nextInt();
        	while(cases-->0){
            		int n = sc.nextInt();
            		int k = sc.nextInt();
            		int[] fam = new int[n+1];
            		fam[0] = 0;
            		for(int i=1;i<=n;i++)
                		fam[i] = sc.nextInt();
            		int ans = chefwed(fam,n,k);
            		System.out.println(ans);
        	}
	}
	public static int chefwed(int[] fam, int n, int k){
	    int[] dp = new int[n+1];
	    dp[0] = 0;
	    for(int i=1;i<=n;i++){
	        dp[i] = dp[i-1] + k;
	        Map<Integer,Integer> mp = new HashMap<>();
	        int clash = 0;
	        for(int j=i;j>=1;j--){
	            if(mp.containsKey(fam[j]))
	                mp.put(fam[j],mp.get(fam[j])+1);
	            else
	                mp.put(fam[j],1);
	            if(mp.get(fam[j]) == 2)
	                clash += 2;
	            else if(mp.get(fam[j]) > 2)
	                clash++;
	            dp[i] = Math.min(dp[i],(dp[j-1]+k+clash));
	        }
	    }
	    return dp[n];
	}
}
