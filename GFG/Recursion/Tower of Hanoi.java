import java.util.*;
import java.io.*;

class GFG {	
	public static void main (String[] args)throws IOException {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases--> 0){
			int n = sc.nextInt();
			int s = 1;
			int h = 2;
			int d = 3;
			toh(s,d,h,n);		
		}
	}	
	public static void toh(int s,int d,int h, int n){
		if(n == 1){
			System.out.println("Moving plate "+n+" from "+s+" to "+d);
			return;
		}
		toh(s,h,d,n-1);
		System.out.println("Moving plate "+n+" from "+s+" to "+d);
		toh(h,d,s,n-1);
	}
}