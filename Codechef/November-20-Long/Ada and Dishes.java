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
            		int n = sc.nextInt();
            		int[] arr = new int[n];
            		for(int i=0;i<n;i++)
                		arr[i] = sc.nextInt();
            		int a = 0;
            		int b = 0;
            		Arrays.sort(arr);
            		for(int i=n-1;i>=0;i--){
                		if(a <= b)
                    			a += arr[i];
                		else
                    			b+= arr[i];
            		}
            		System.out.println(Math.max(a,b));
        	}
	}
}