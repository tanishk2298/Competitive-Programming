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
                		Set<Integer> a1 = new HashSet<Integer>();
                		Set<Integer> a2 = new HashSet<Integer>();
                		int len = 4 * n - 1;
    				for(int i=0;i<len;i++){
    			    		int x = sc.nextInt();
    			    		int y = sc.nextInt();
    			    		if(a1.contains(x))
		                		a1.remove(x);
		            		else
		                		a1.add(x);
    			    		if(a2.contains(y))
		                		a2.remove(y);
		            		else
		                		a2.add(y);
    				}
    				int[] ans = new int[2];
                		Iterator iterator = a1.iterator();
	            		while(iterator.hasNext()){
		            		int i = (int) iterator.next();
		            		ans[0] = i;
    		    		}
    		    		Iterator iterator1 = a2.iterator();
	            		while(iterator1.hasNext()){
		            		int i = (int) iterator1.next();
		            		ans[1] = i;
    		    		}
    		    		for(int i=0;i<ans.length;i++)
    		        		System.out.print(ans[i]+" ");
    			}
        	}
        	catch(Exception e){
            		return;
        	}
	}
}
