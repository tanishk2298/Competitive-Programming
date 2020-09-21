import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{

    public static int[][] dp;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);  
        int tc = sc.nextInt();
        while(tc-->0){
            String str = sc.next();
            dp = new int[1001][1001];
            for(int[] row : dp)
                Arrays.fill(row,-1);
            int ans = noOfPartitions(str,0,str.length()-1);
            System.out.println(ans);
        }
    }

    public static int noOfPartitions(String str, int i, int j){
        if(i >= j)
            return 0;
        if(isPalindrome(str,i,j))
            return 0;
        if(dp[i][j] != -1)
            return dp[i][j];
        int min = Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int left, right;
            if(dp[i][k] != -1)
                left = dp[i][k];
            else{
                left = noOfPartitions(str,i,k);
                dp[i][k] = left;
            }
            if(dp[k+1][j] != -1)
                right = dp[k+1][j];
            else{
                right = noOfPartitions(str,k+1,j);
                dp[k+1][j] = right;
            }
            int temp = 1 + left + right;
            min = Math.min(temp,min);
        }
        dp[i][j] = min;
        return min;
    }

    public static boolean isPalindrome(String str, int i, int j){
        if(i==j || i>j)
            return true;
        while(i < j){
            if(str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}