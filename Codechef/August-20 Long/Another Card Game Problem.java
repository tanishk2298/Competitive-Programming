/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(br.readLine().trim());
		while(cases-->0){
		    String ip[] = br.readLine().trim().split(" ");
		    int chef = Integer.parseInt(ip[0]);
		    int rick = Integer.parseInt(ip[1]);
		    int ans1 = ((chef % 9) == 0) ? (chef/9) : (chef/9) + 1;
		    int ans2 = ((rick % 9) == 0) ? (rick/9) : (rick/9) + 1; 
            	    if(ans1<ans2)
                    	System.out.println(0+" "+ans1);
                    else if(ans2<ans1)
                    	System.out.println(1 +" "+ans2);
                    else if(ans1==ans2)
                    	System.out.println(1+" "+ans1);
		}
	}
}