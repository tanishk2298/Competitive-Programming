import java.util.*;
class GFG 
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        while(cases-->0){
            int n = sc.nextInt();
            int diff = sc.nextInt();
            int[] arr = new int[n];
            int total = 0;
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                total += arr[i];
            }
            int sum = (diff + total)/2;
            int[][] dp = new int[n+1][sum+1];
            for(int i=0;i<=sum;i++)
                dp[0][i] = 0;
            for(int i=0;i<=n;i++)
                dp[i][0] = 1;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=sum;j++){
                    if(arr[i-1] <= j)
                        dp[i][j] = dp[i-1][j-arr[i-1]] + dp[i-1][j];
                    else
                        dp[i][j] = dp[i-1][j];
                }
            }
            System.out.println(dp[n][sum]);
        }
    }
}