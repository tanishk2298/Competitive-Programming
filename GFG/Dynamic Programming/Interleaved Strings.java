import java.util.*;
import java.lang.*;

class GfG{
	public boolean isInterLeave(String a,String b,String c)
	{
	    String c2 = c;
	    boolean ans1 = false;
	    boolean ans2 = false;
            if(lcs(a,c)){
                for(int i=0;i<a.length();i++)
                    c = c.replaceFirst(Character.toString(a.charAt(i)),"");
                if(lcs(b,c))
                    ans1 = true;
            }
            if(lcs(b,c2)){
                for(int i=0;i<b.length();i++)
                    c2 = c2.replaceFirst(Character.toString(b.charAt(i)),"");
                if(lcs(a,c2))
                    ans2 = true;
            }
            return(ans1||ans2);
	}
	public static boolean lcs(String a, String b){
	    int m = a.length();
	    int n = b.length();
            int[][] dp = new int[m+1][n+1];
	    for(int i=0;i<=m;i++){
	        for(int j=0;j<=n;j++){
	            if(i==0||j==0)
	                dp[i][j] = 0;
	            else{
	                if(a.charAt(i-1) == b.charAt(j-1))
	                    dp[i][j] = 1 + dp[i-1][j-1];
                        else
	                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
	            }
	        }
	    }
	    return(dp[m][n] == m);
	}
}

class InterLeaveString
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            String a =sc.next();
            String b = sc.next();
            String c = sc.next();
            GfG g=new GfG();
            System.out.println(g.isInterLeave(a,b,c)==true?1:0);
        }
    }
}