/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try{
            		Scanner sc = new Scanner(System.in);
    			int cases = sc.nextInt();
    			while(cases-->0) {
    				int n = sc.nextInt();
    				int x = sc.nextInt();
    				int days = 0;
    				int[] arr = new int[n];
    				for(int i=0;i<n;i++)
    			    		arr[i] = sc.nextInt();
    				Arrays.sort(arr);
    				for(int i=0;i<n;i++){
    			    		if(x<(arr[i]*2)){
        			    		if(x>=arr[i]){
        			           		x = arr[i] * 2;
        			           		arr[i] = 0;
        			           		days++;
        			          
        			     		}
        			     		else{
        			           		x *= 2;
        			           		days++;
        			           		i--;
        			      		}
    			    		}
    				}
    				for(int i=0;i<arr.length;i++)
    			    	if(arr[i]>0)
    			        	days++;
    				System.out.println(days);
    			}
        	}
        	catch(Exception e){
            		return;
        	}
	}
}
