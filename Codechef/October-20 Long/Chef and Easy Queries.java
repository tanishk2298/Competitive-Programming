import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
    		Scanner sc = new Scanner(System.in);
    		int tc = sc.nextInt();
    		while(tc-->0){
    	    		long n = sc.nextLong();
    	    		long k = sc.nextLong();
    	    		long[] arr = new long[(int)n];
    	    		for(int i=0;i<n;i++)
    	        		arr[i] = sc.nextInt();
    	    		long count = 0, sum = 0;
    	    		boolean flag = true;
    	    		for(int i=0;i<n;i++){
    	        		count++;
    	        		arr[i] += sum;
    	        		if((arr[i]-k) < 0){
    	            			flag = false;
    	            			System.out.println(count);
    	            			break;
    	        		}
    	        		arr[i] -= k;
    	        		sum = arr[i];
    	    		}
    	    		if(flag){
    	        		count += (arr[(int)n-1]/k);
    	       			sum -= (arr[(int)n-1]/k);
    	        		if(sum < 0)
    	            			System.out.println(count);
    	        		else
    	            			System.out.println(count+1);
    	    		}
    		}
	}
}