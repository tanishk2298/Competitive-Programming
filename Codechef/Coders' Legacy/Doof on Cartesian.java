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
		int t = sc.nextInt();
		while(t-->0){
		    int size = sc.nextInt();
    		int[] lines = new int[size];
    		for(int i=0;i<size;i++)
		        lines[i] = sc.nextInt();
		    Arrays.sort(lines);
		    int cases = sc.nextInt();
		    while(cases-->0){
		        int x = sc.nextInt();
		        int y = sc.nextInt();
		        int ans = x+y;
		        if(x ==0 && y==0)
		            System.out.println('0'); 
		        else
		            System.out.println(getAns(lines, ans));
		    }
		}
	}
	public static int getAns(int[] arr, int num){
	    int left = 0, right = arr.length - 1; 
	    int mid = left + (right - left) / 2;
        while (left <= right) { 
            mid = left + (right - left) / 2; 
            if (arr[mid] == num) 
                return -1; 
            if (arr[mid] < num) 
                left = mid + 1; 
            else
                right = mid - 1; 
        }
        return left; 
	}
}