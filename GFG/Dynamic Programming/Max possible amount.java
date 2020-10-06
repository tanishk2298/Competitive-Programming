import java.io.*;
import java.util.*;

class Solution
{
    int maxAmount(int arr[] , int n)
    {
        int[][] dp = new int[n][n];
        for(int i=0;i<n;i++)
           dp[i][i] = arr[i];
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<n;j++){
                if(j==i+1)
                    dp[i][j]=Math.max(arr[i],arr[j]);
                else if(j>i){
                    int op1 = arr[i] + Math.min(dp[i+2][j],dp[i+1][j-1]);
                    int op2 = arr[j] + Math.min(dp[i+1][j-1],dp[i][j-2]);
                    dp[i][j] = Math.max(op1,op2);
                }
            }
        }
        return(dp[0][n-1]);
    }
}

//Driver Function

class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int Arr[] = new int[n];
                    for(int i = 0;i<n;i++)
                        Arr[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.maxAmount(Arr,n));
                }
        }
}