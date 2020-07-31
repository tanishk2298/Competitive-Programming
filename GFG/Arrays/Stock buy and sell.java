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
			int[] arr = new int[n+1];
			String inputLine1[] = br.readLine().trim().split(" ");
			for(int i=0;i<n;i++)
				arr[i]=Integer.parseInt(inputLine1[i]);
			arr[n] = -1;
			int i = 0, count = 0;
			for(int j=0;j<n;j++)
			    if(arr[j]>arr[j+1]){
			        if(j != i){
			            System.out.print("("+i+" ");
			            System.out.print(j+") ");
			            count++;
			        }
			        i = j+1;
			    }
			if(count==0)
			    System.out.print("No Profit");
			System.out.println("");
		}
	}
}