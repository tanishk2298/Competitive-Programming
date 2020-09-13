import java.io.*;
import java.util.*;

class Solution
{                                  
    public long count(int S[], int n, int w) 
    { 
        long[][] dp = new long[n+1][w+1];
        for(int i=0;i<=w;i++)
            dp[0][i] = 0;
        for(int j=0;j<=n;j++)
            dp[j][0] = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=w;j++){
                if(S[i-1] <= j)
                    dp[i][j] = dp[i][j-S[i-1]] + dp[i-1][j];
                else
                    dp[i][j] = dp[i-1][j];
            }
        }
        return dp[n][w];    
    } 
}

class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int m = sc.nextInt();
                    int Arr[] = new int[m];
                    for(int i = 0;i<m;i++)
                        Arr[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.count(Arr,m,n));
                }
        }
}