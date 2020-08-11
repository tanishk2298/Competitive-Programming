import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {	
	public static void main (String[] args)throws IOException {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases--> 0){
			int n = sc.nextInt();
			Stack<Integer> stk = new Stack<Integer>();
			for(int i = 0; i<n; i++)
				stk.push(sc.nextInt());
			int k = (n/2) + 1;
			deleteMiddle(stk, k);
			while (!stk.empty()){ 
				int p=stk.pop(); 
				System.out.print(p + " "); 
        		} 
		}
	}
	public static void deleteMiddle(Stack<Integer> stk, int k){
		if(stk.size() == 0)
			return;
		solve(stk, k);
	}
	public static void solve(Stack<Integer> stk , int k){
		if(k == 1){
			stk.pop();
			return;
		}
		int temp = stk.peek();
		stk.pop();
		solve(stk, k-1);
		stk.push(temp);
	}
}