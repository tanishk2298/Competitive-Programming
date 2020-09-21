import java.util.*;
import java.lang.*;
import java.io.*;
class GFG{
    	public static int[][] dp;
	public static void main (String[] args){
	    Scanner sc = new Scanner(System.in);
	    int tc = sc.nextInt();
	    while(tc-->0){
	        int e = sc.nextInt();
	        int f = sc.nextInt();
	        dp = new int[e+1][f+1];
	        for(int[] row : dp)
	            Arrays.fill(row,-1);
	        int floor = getCriticalFloor(e,f);
	        System.out.println(floor);
	    }
	 }
	 public static int getCriticalFloor(int e, int f){
	    if(e == 1)
	        return f;
	    if(f <= 1)
	        return f;
	    if(dp[e][f] != -1)
	        return dp[e][f];
	    int min = Integer.MAX_VALUE;
	    for(int k=1;k<=f;k++){
	        int temp = 1 + Math.max(getCriticalFloor(e-1,k-1),getCriticalFloor(e,f-k));
	        min = Math.min(temp, min);
	    }
	    dp[e][f] = min;
	    return min;
	 }
}