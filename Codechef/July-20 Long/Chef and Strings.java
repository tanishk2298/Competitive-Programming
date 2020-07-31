/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try{
		    Scanner sc = new Scanner(System.in);
    		int cases = sc.nextInt();
    		while(cases-->0) {
    			int totStr = sc.nextInt();
    			int[] strings = new int[totStr];
    			for(int i=0;i<totStr;i++)
    				strings[i] = sc.nextInt();
    			long ans = 0;
    			for(int i=1;i<strings.length;i++)
    				ans += Math.abs(strings[i] - strings[i-1])-1;
    			System.out.println(ans);
    		}
		}
		catch(Exception e){
		    return;
		}
	}
}
