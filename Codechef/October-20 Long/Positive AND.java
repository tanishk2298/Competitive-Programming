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
		    StringBuffer ans = new StringBuffer();
		    if(n == 1)
		        ans.append("1");
		    else if(isPow(n))
		        ans.append("-1");    
		    else{
		        long[] arr = new long[(int)n];
		        for(int i=0;i<n;i++)
		            arr[i] = (i+1);
		        arr[0] = 2;
		        arr[1] = 3;
		        arr[2] = 1;
		        for(int i=3;i<n;i++){
		            if(isPow(i+1)){
		                long temp = arr[i];
		                arr[i] = arr[i+1];
		                arr[i+1] = temp;
		                i++;
		            }
		        }
		        for(long i : arr)
		            ans.append(i+" ");
		    }
		    System.out.println(ans);
		}
	}
	public static boolean isPow(long n){
	    boolean ans = false;
	    if((n&(n-1)) == 0)
	        ans = true;
	    return ans;
	}
}