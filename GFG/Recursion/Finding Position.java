import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases-->0){
		    int n = sc.nextInt();
		    System.out.println(findPos(n));
		}
	}
	public static int findPos(int n){
	    if(n == 1)
	        return 1;
	    return(findPos(n/2)*2);
	}
}