import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception{
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc-->0){
    			String str = sc.next();
    			if(str.length()%2 == 1)
    		    	System.out.println(-1);
    			else{
        			int one = 0;
        			int zero = 0;
        			for(int i=0;i<str.length();i++){
        		    		if(str.charAt(i) == '1')
        		        		one++;
        		    		else
        		        		zero++;
        			}
        			int diff = Math.abs(one-zero);
        			if(one==0 || zero==0)
        		    		System.out.println(-1);
        			else
        		    		System.out.println(diff/2);
    			}
		}
	}
}
