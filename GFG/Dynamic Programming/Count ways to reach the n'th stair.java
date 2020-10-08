import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
{
        public static long[] ways = new long[100001];
    
        public static long mod = 1000000007;
    
	public static void main (String[] args)throws IOException
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    getWays(100000);
	    long tc = Long.parseLong(br.readLine());
	    while(tc-->0)
	    {
	        long n = Long.parseLong(br.readLine());
	        int i = (int)n - 1;
	        System.out.println(ways[i] % mod);
	    }
	}
	public static void getWays(long n)
	{
	    ways[0] = 1;
            ways[1] = 2;
            for(int i=2;i<n;i++)
                ways[i] = (ways[i-1]+ ways[i-2]) % mod;
	}
}