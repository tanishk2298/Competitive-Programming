/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases-->0){
		    int jd = sc.nextInt();
		    int pw = sc.nextInt();
		    while(jd > 0 && pw > 0){
		        jd = jd - pw;
		        pw = pw / 2;
		    }
		    if(jd < 1)
			System.out.println(1);
		    else if(pw < 1)
			System.out.println(0);
		}
	}
}