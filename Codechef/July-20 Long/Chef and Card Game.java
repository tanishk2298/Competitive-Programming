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
    				int rounds = sc.nextInt();
    				int chef = 0;
    				int morty = 0;
    				while(rounds-->0){
    			    		int cr = sc.nextInt();
    			    		int mr = sc.nextInt();
    			    		int sum1 = 0;
    			    		while(cr!=0){
    			        		sum1 += cr % 10;
    			        		cr /= 10;
    			    		}
    			    		int sum2 = 0;
    			    		while(mr!=0){
    			        		sum2 += mr % 10;
    			        		mr /= 10;
    			    		}
    			    		if(sum1>sum2) chef++;
    			    		else if(sum2>sum1) morty++;
    			    		else{
    			        		chef++;
    			        		morty++;
    			    		}
    				}
    		    		if(chef>morty) System.out.println('0' + " " +chef);
    		    		else if(morty>chef) System.out.println('1' + " " + morty);
    		    		else System.out.println('2' + " " + chef);
    			}
        	}
        	catch(Exception e){
            		return;
        	}
	}
}
