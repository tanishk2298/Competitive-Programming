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
    		long[] arr = new long[n];
    		String inputLine1[] = br.readLine().trim().split(" ");
    		for(int i=0;i<n;i++)
    			arr[i]=Integer.parseInt(inputLine1[i]);
    		int sm = 0,lg = n-1, max = (int)arr[n-1]+1;
    		for(int i=0;i<n;i++){
    		    if(i%2==0){
    		        arr[i] = arr[i] + (arr[lg] % max) * max;
    		        lg--;
    		    }
    		    else{
    		        arr[i] = arr[i] + (arr[sm] % max) * max;
    		        sm++;
     		    }
    		}
    		for(int i=0;i<n;i++)
    		    System.out.print(arr[i]/max+" ");
    		System.out.println("");
    	}
    }
}