import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
	public static void main(String[] args)throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int tc = Integer.parseInt(br.readLine().trim());
	    while(tc-->0){
	        String ip[] = br.readLine().trim().split(" ");
	        int m = Integer.parseInt(ip[0]);
	        int n = Integer.parseInt(ip[1]);
	        String x = br.readLine();
	        String y = br.readLine();
	        int[][] dp = new int[m+1][n+1];
	        int max = 0;
	        for(int i=0;i<=m;i++){
	            for(int j=0;j<=n;j++){
	                if(i==0||j==0)
	                    dp[i][j] = 0;
	                else if(x.charAt(i-1) == y.charAt(j-1))
	                    dp[i][j] = 1 + dp[i-1][j-1];
	                else
	                    dp[i][j] = 0;
	                max = (dp[i][j] > max) ? dp[i][j] : max;
	            }
	        }
	        System.out.println(max);
	    }        
	}
}