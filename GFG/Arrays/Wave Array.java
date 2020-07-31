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
			String ip[] = br.readLine().trim().split(" ");
			for(int i=0;i<n;i++)
				arr[i]=Integer.parseInt(ip[i]);
			for(int i=0;i<n-1;i+=2){
			     int temp = arr[i];
			     arr[i] = arr[i+1];
			     arr[i+1] = temp;
			}
			StringBuilder sb = new StringBuilder();
			for(int i: arr)
			    sb.append(i+" ");
			System.out.println(sb.toString());
		}
	}
}