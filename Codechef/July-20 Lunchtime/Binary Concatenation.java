import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	    public static void main (String[] args) throws java.lang.Exception
	    {   

    		Scanner sc = new Scanner(System.in);
    		int cases = sc.nextInt();
    		while(cases-->0){
    		    int n = sc.nextInt();
    		    String[] arr = new String[n];
    		    for(int i=0;i<n;i++){
    		        long curr = sc.nextLong();
    		        arr[i] = Long.toBinaryString(curr);
    		    }
    		    long max = 0;
    		    for(int i=0;i<n;i++){
    		        for(int j=0;j<n;j++){
    		            max = Math.max(max, bin(arr[i],arr[j]));
    		        }
    		    }
                    System.out.println(max);
    		}
	    }
    	    public static long bin(String x, String y){
    	    	String a = x+y;
    	    	String b = y+x;
    	    	long a1 = Long.parseLong(a, 2);
    	    	long b1 = Long.parseLong(b, 2);
    	    	long ans = 0;
    	    	if(a1>b1)
			return (a1-b1);
    	    	else
			return (b1-a1);
    	}
}