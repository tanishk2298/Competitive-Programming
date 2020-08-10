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
            	        int k = sc.nextInt();
            		int[] arr = new int[n];
            		String ans = "";
            		for(int i=0;i<n;i++)
                		arr[i] = sc.nextInt();
            		for(int i=0;i<n;i++){
                		if(arr[i]%k==0)
                    			ans += "1";
                		else
                    			ans += "0";
            		}
            		System.out.println(ans);
		}
	}
}