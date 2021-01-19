//Problem Link https://www.codechef.com/JAN21B/problems/WIPL

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int tot = 0;
            Integer[] arr = new Integer[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                tot += arr[i];
            }
            if(n == 1 || tot < (2*k))
                System.out.println(-1);
            else{
                Arrays.sort(arr, Collections.reverseOrder());
                ArrayList<Integer> temp = new ArrayList<>();
                int sum = 0;
                int i;
                for(i=0;i<n;i++){
                    temp.add(arr[i]);
                    sum += arr[i];
                    if(sum >= (2*k))
                        break;
                }
                int minDiff = getMin(temp.size(), sum, temp);
                while((sum - minDiff)/2 < k && i < (n-1)){
                    i++;
                    temp.add(arr[i]);
                    sum += arr[i];
                    minDiff = getMin(temp.size(), sum, temp);
                }
                if(temp.size() == n && (sum-minDiff)/2 < k)
                    System.out.println(-1);
                else
                    System.out.println(temp.size());
            }
        }
    }
    public static int getMin(int n, int sum, ArrayList<Integer> arr){
        boolean[][] dp = new boolean[n+1][sum+1];
        for(int i=0;i<=sum;i++)
            dp[0][i] = false;
        for(int i=0;i<=n;i++)
            dp[i][0] = true;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sum;j++){
                if(arr.get(i-1) <= j)
                    dp[i][j] = dp[i-1][j-arr.get(i-1)] || dp[i-1][j];
                else
                    dp[i][j] = dp[i-1][j];
            }
        }
        int ans = 0;
        for(int i=(sum/2);i>=0;i--){
            if(dp[n][i] == true){
                ans = sum - (2 * i);
                break;
            }
        }
        return ans;        
    }
}
