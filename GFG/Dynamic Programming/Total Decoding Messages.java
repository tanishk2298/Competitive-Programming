import java.util.*;
import java.lang.*;
import java.io.*;
class GFG{
    public static int[] dp;
	public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            String str = sc.next();
            dp = new int[n+1];
            Arrays.fill(dp,0);
            decode(str,str.length(),dp);
            System.out.println(dp[n]);
        }
	} 
	public static int decode(String str, int i, int[] dp){
	    if(i == 0)
	        return 1;
	    int curr = str.length() - i;
	    if(str.charAt(curr) == '0')
	        return 0;
	    if(dp[i] != 0)
	        return dp[i];
	    int res = decode(str, i-1, dp);
	    if(i >= 2 && Integer.parseInt(str.substring(curr,curr+2)) <= 26)
	        res += decode(str, i-2, dp);
	    dp[i] = res;
	    return res;
	}
}