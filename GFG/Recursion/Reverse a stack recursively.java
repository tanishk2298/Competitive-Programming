import java.util.*;
import java.io.*;

public class abcd {	
	public static void main (String[] args)throws IOException {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases--> 0){
			int n = sc.nextInt();
			Stack<Integer> stk = new Stack<Integer>();
			for(int i = 0; i<n; i++)
				stk.push(sc.nextInt());
			System.out.println("Original "+stk); 
			rev(stk);
			System.out.println("Final "+stk); 
		}
	}
	public static void rev(Stack<Integer> stk){
		if(stk.size() == 1)
			return;
		int temp = stk.pop();
		rev(stk);
		insert(stk, temp);
	}
	private static void insert(Stack<Integer> stack, int element) {
		if(stack.isEmpty()) {
			stack.push(element);
			return;
		}
		int temp = stack.pop();
		insert(stack, element);
		stack.push(temp);
	}
}