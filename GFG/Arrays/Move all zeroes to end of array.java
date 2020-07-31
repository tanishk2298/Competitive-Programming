/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(br.readLine().trim());
		while(cases-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    int[] arr = new int[n];
		    String inputLine1[] = br.readLine().trim().split(" ");
		    for(int i=0;i<n;i++)
		        arr[i] = Integer.parseInt(inputLine1[i]);
		    int zero = 0;
		    for(int i=0;i<n;i++)
		        if(arr[i]==0)
		            zero++;
		        else
		            System.out.print(arr[i]+" ");
		    for(int i=0;i<zero;i++)
		        System.out.print(0+" ");
		    System.out.println("");
		}
	}
}