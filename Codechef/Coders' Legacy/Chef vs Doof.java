/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int x = sc.nextInt();
		    int[] arr = new int[x];
		    for(int i=0;i<x;i++)
		        arr[i] = sc.nextInt();
		    int ans = 1;
		    for(int i=0;i<x;i++)
		        ans *= arr[i];
		    if(ans%2 == 0) System.out.println("NO");
		    else System.out.println("YES");
		}
	}
}