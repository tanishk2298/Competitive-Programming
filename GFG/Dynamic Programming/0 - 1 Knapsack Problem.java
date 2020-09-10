import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main (String[] args)throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int tc = Integer.parseInt(br.readLine());
	    while(tc-->0){
	        int n = Integer.parseInt(br.readLine());
	        int w = Integer.parseInt(br.readLine());
	        int[] val = new int[n];
	        int[] wt = new int[n];
	        String ipVal[] = br.readLine().trim().split(" ");
	        for(int i=0;i<n;i++)
	            val[i] = Integer.parseInt(ipVal[i]);
	        String wtVal[] = br.readLine().trim().split(" ");
	        for(int i=0;i<n;i++)
	            wt[i] = Integer.parseInt(wtVal[i]);
	        int dp[][]=new int[n+1][w+1];
            	for(int i=0;i<=n;i++)
                	for(int j=0;j<=w;j++)
                    		if(i == 0 || j == 0)
                        		dp[i][j] = 0;
            	for(int i=1;i<=n;i++){
                	for(int j=1;j<=w;j++){
	                	if(wt[i-1] <= j)
	                    		dp[i][j] = Math.max((val[i-1]+dp[i-1][j-wt[i-1]]), dp[i-1][j]);
	                	else
	                    		dp[i][j] = dp[i-1][j];
                	}
            	}    
            	System.out.println(dp[n][w]);
	    }
	}
}