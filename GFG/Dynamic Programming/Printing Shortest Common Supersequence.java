import java.io.*;
import java.util.*;

class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
                String x = sc.next();
                String y = sc.next();
                int m = x.length();
	        int n = y.length();
	        int[][] dp = new int[m+1][n+1];
	        for(int i=0;i<=m;i++){
    		    for(int j=0;j<=n;j++){
        		    if(i==0||j==0)
            			dp[i][j] = 0;
        		    else if(x.charAt(i-1) == y.charAt(j-1))
            			dp[i][j] = 1 + dp[i-1][j-1];
        		    else
            			dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
    		    }
	        }
	        int i = m, j = n;
	        StringBuilder str = new StringBuilder();
	        while(i > 0 && j > 0){
	            if(x.charAt(i-1) == y.charAt(j-1)){
	                str.append(x.charAt(i-1));
	                i--;
	                j--;
	            }
	            else if(dp[i-1][j] > dp[i][j-1]){
	                str.append(x.charAt(i-1));
	                i--;
	            }
	            else{
	                str.append(y.charAt(j-1));
	                j--;
	            }
	        }
	        while(i > 0)
	            str.append(x.charAt(--i));
	        while(j > 0)
	            str.append(y.charAt(--j));
	        str.reverse();
	        System.out.println(str);
        }            
    }
}