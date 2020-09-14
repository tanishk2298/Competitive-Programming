/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long cases = Long.parseLong(br.readLine().trim());
		while(cases-->0){
		    long n = Long.parseLong(br.readLine().trim());
		    long sum = getSum(n,1);
		    long count = 0;
		    if(sum %2 != 0)
		        System.out.println(count);
		    else{
		        long subSum = sum / 2;
		        long curr = 0;
		        for(long i=n;i>0;i--){
		            curr += i;
		            count++;
		            if(curr == subSum){
		                long leftComb = getSum((n-count),0);
		                long rightComb = getSum(count,0);
		                System.out.println(leftComb + count + rightComb);
		                break;
		            }
		            else if(curr > subSum){
		                System.out.println(count);
		                break;
		            }
		        }
		    }
		}
	}
	static long getSum(long n, int type){
	    long sum = 0;
	    if(type == 1)
	        return (n*(n+1))/2;
	    return (n*(n-1))/2;
	}
}
