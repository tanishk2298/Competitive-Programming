import java.util.*;
import java.io.*;

public class GFG {	
	public static void main (String[] args)throws IOException {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases--> 0){
			int n = sc.nextInt();
			int k = sc.nextInt();
			System.out.println(solve(n,k));
		}
	}
	public static int solve(int n, int k){
		if(n ==1 && k == 1)
			return 0;
		int mid = (int)(Math.pow(2, n-1))/2;
		int ans = 0;
		if(k<=mid)
			ans = solve(n-1,k);
		else
			ans = solve(n-1,k-mid) == 0 ? 1 : 0;
		return ans;
	}
}
