/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc-->0){
		    int n = sc.nextInt();
		    HashMap<Integer,Integer> map = new HashMap<>();
		    for(int i=0;i<n;i++){
		        int temp = sc.nextInt();
		        if(temp  != 0){
    		        if(map.containsKey(temp))
    		            map.put(temp , map.get(temp)+1);
    		        else
    		            map.put(temp, 1);
		        }
		    }
		    System.out.println(map.size());
		}
	}
}
