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
    			int arrSum = 0;
    			String ip[] = br.readLine().trim().split(" ");
    			for(int i=0;i<n;i++){
                    		arr[i] = Integer.parseInt(ip[i]) * -1;
                    		arrSum += arr[i];
    			}	
    			int sum = 0, max = Integer.MIN_VALUE;
    			for(int i=0;i<n;i++){
    			    sum += arr[i];
    			    if(sum<arr[i])
    			        sum = arr[i];
    			    if(sum>max)
    			        max = sum;
    			}
    			System.out.println(Math.max(-1 *(arrSum-max),(max)));
    		}
    	}        
}