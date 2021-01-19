/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            long low = sc.nextLong();
            long high = sc.nextLong();
            long[] arr = new long[n];
            long[] pref = new long[n];
            int ind = -1;
            for(int i=0;i<n;i++){
                long temp = sc.nextLong();
                arr[i] = temp;
                pref[i] = (i != 0) ? pref[i-1] + arr[i] : arr[i];
                if(pref[i] >= low && ind == -1)
                    ind = i;
            }
            System.out.println(blackJack(arr, pref, ind, low, high, n));
        }
	}
	public static long blackJack(long[] arr, long[] pref, int ind, long low, long high, int n){
	    if(pref[ind] <= high)
	        return 0;
	    long temp = 0;
	    for(int i=0;i<n;i++){
	        for(int j=0;j<=i;j++){
	            temp += blkjkUtil(arr, low - pref[i] + arr[j], high - pref[i] + arr[j], i+1, n);
	            if(temp >= 1)
	                return 1;
	        }
	    }
	    return 2;
	}
	public static long blkjkUtil(long[] arr, long low, long high, int index, int n){
	    if(index > n || high < 0)
	        return 0;
	    for(int i=index;i<n;i++)
	        if(arr[i] >= low && arr[i] <= high)
	            return 1;
	    return 0;
	}
}
