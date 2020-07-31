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
		    String[] input = br.readLine().trim().split(" ");
		    for(int i=0;i<n;i++)
		        arr[i] = Integer.parseInt(input[i]);
		    int max = arr[0], sum = arr[0];
		    for(int i=1;i<n;i++){
		        sum += arr[i];
		        if(arr[i]>=sum)
		            sum = arr[i];
		        if(sum>=max)
		            max = sum;
		    }
		    System.out.println(sum);
		}
	}
}