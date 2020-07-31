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
		    String[] ip = br.readLine().trim().split(" ");
		    for(int i=0;i<n;i++)
		        arr[i] = Integer.parseInt(ip[i]);
            	    int max = arr[1]-arr[0], min = arr[0];
            	    for(int i=1;i<n;i++){
                	    if((arr[i]-min)>max)
                    	    	    max = arr[i]-min;
                	    if(arr[i]<min)
                    	    	    min = arr[i];
            	    }
            	    System.out.println(max);
		}
	}
}