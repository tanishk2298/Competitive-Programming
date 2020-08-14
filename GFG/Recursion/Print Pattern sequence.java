import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    	static int flag = 0;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases-->0){
		    int n = sc.nextInt();
		    int k = n;
		    System.out.print(n+" ");
		    printPattern(n-5, k);
		}
	}
	public static void printPattern(int n, int k){
	    if(n == k){
	        System.out.print(n+"\n");
	        flag = 0;
	        return;
	    }
	    System.out.print(n+" ");
	    if(n > 0 && flag == 0)
	        printPattern(n-5,k);
	    else{
	        flag = 1;
	        printPattern(n+5, k);
	    }
	}
}