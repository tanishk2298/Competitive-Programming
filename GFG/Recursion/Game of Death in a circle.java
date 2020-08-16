import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases-->0){
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    ArrayList<Integer> arr = new ArrayList<>();
		    for(int i=1;i<=n;i++)
		        arr.add(i);
		    solve(arr, 0, k-1);
		}
	}
	public static void solve(ArrayList<Integer> arr, int index , int k){
	    if(arr.size() == 1){
	        System.out.println(arr.get(0));
	        return;
	    }
	    int i = (index + k) % arr.size();
	    arr.remove(i);
	    solve(arr, i, k);
	}
}