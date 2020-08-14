/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases-->0){
		    int n = sc.nextInt();
		    String op = "";
		    nBitBinary(0, 0, op, n);
		}
	}
	public static void nBitBinary(int one, int zero, String op, int n){
    	    if(n == 0){
    	        System.out.print(op+" ");
    	        return;
    	    }
    	    nBitBinary(one+1,zero,op+"1",n-1);
    	    if(one > zero)
    	        nBitBinary(one,zero+1,op+"0",n-1);
	}
}