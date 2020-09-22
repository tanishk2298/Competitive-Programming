import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
    public static int[][][] dp = new int[1001][1001][2];
    public static void main (String[] args)throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine().trim());
		while(tc-->0){
	        int n = Integer.parseInt(br.readLine().trim());	
		    String str = br.readLine().trim();
		    for(int i=0;i<1001;i++)
		        for(int j=0;j<1001;j++)
		            for(int k=0;k<2;k++)
		                dp[i][j][k] = -1;
		    int ans = solve(str,0,n-1,1);
		    System.out.println(ans);
		}
	}
	public static int solve(String str, int i, int j, int isTrue){
	    if(i > j)
	        return dp[i][j][isTrue] = 0;
	    if(i == j){
	        if(isTrue == 1){
	            if(str.charAt(i) == 'T')
	                dp[i][j][isTrue] = 1;
	            else
	                dp[i][j][isTrue] = 0;
	            return dp[i][j][isTrue];
	        }
	        else{
	            if(str.charAt(i) == 'F')
	                dp[i][j][isTrue] = 1;
	            else
	                dp[i][j][isTrue] = 0;
	            return dp[i][j][isTrue];
	        }
	    }
	    int ans = 0;
	    if (dp[i][j][isTrue] != -1)
		    return dp[i][j][isTrue];
	    for(int k=(i+1);k<j;k+=2){
	        int lt = solve(str,i,k-1,1);
	        int lf = solve(str,i,k-1,0);
	        int rt = solve(str,k+1,j,1);
	        int rf = solve(str,k+1,j,0);
	        if(str.charAt(k) == '&'){
	            if(isTrue == 1)
	                ans += (lt*rt);  
	            else
	                ans += (lf*rt) + (lt*rf) + (lf*rf);
	        }
	        else if(str.charAt(k) == '|'){
	            if(isTrue == 1)
	                ans += (lt*rt) + (lt*rf) + (lf*rt);
	            else
	                ans += (lf*rf);
	        }
	        else if(str.charAt(k) == '^'){
	            if(isTrue == 1)
	                ans += (lt*rf) + (lf*rt);
	            else
	                ans += (lt*rt) + (lf*rf);
	        }
	    }
	    return dp[i][j][isTrue] = ans%1003;
	}
}
