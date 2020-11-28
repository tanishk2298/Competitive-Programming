Problem Link -
https://www.codechef.com/problems/SEGM01


import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        	Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc-->0){
		    String str = sc.next();
		    char[] arr = str.toCharArray();
		    boolean flag = false;
		    int count = 0;
		    for(int i=0;i<arr.length;i++){
                	if(arr[i] == '1' && !flag){
                    	    flag = true;
                    	    count++;
                	}
                        if(arr[i] == '1' && flag)
                            flag = true;
                	else
                            flag = false;
		    }
		    if(count != 1)
		        System.out.println("NO");
		    else
		        System.out.println("YES");    
		}
	}
}
