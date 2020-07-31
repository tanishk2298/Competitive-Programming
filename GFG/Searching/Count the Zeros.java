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
			int[] a = new int[n];
			String ip[] = br.readLine().trim().split(" ");
			for(int i=0;i<n;i++)
				a[i]=Integer.parseInt(ip[i]);
			int ans = getAns(a);
			System.out.println(ans);
		}
	}
	public static int getAns(int[] a){
	    int n = a.length;
	    if(a[0]==0)
			return n;
		if(a[n-1] == 1)
		        return 0;
    	    int l=0,h=n-1,mid=0;
    	    while(l<=h){
    	        mid =(l+h)/2;
    	        if(a[mid]==0&&a[mid-1]==1)
    		    	return (n-mid);
    		else if(a[mid]==1)
    			l=mid+1;
    		else
    			h=mid-1;
    	        }
		return 0;
	}
}