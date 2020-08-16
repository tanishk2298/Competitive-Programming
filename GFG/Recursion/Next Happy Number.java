import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases-->0){
		    int n = sc.nextInt();
		    nextHappyNumber(n+1);
		}
	}
	public static void nextHappyNumber(int n){
	    if(n == 1){
	        System.out.println(n);
	        return;
	    }
	    int curr = n;
	    ArrayList<Integer> records = new ArrayList<Integer>();
	    while(curr != 1){
	        records.add(curr);
	        curr = digitSquare(curr);
	        if(records.contains(curr)){
	            nextHappyNumber(n+1);
	            return;
	        }
	    }
	    System.out.println(n);
	}
	public static int digitSquare(int n){
	    int sq = 0;
	    while(n!=0){
	        sq += (n%10)*(n%10);
	        n /= 10;
	    }
	    return sq;
	}
}