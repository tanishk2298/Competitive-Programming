import java.util.*;
import java.lang.*;
import java.io.*;

class GfG
{
    public Stack<Integer> sort(Stack<Integer> s){
        if(s.isEmpty())
	    return s;
	int top = s.pop();
	sort(s);
	sortUtil(s, top);
	return s;
    }
    public static void sortUtil(Stack<Integer> stk, int top){
        if(stk.isEmpty() || top > stk.peek()){
            stk.push(top);
            return;
        }
        int temp = stk.pop();
        sortUtil(stk, top);
        stk.push(temp);
    }
}

//Driver Function

class SortedStack{
    public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0){
	    Stack<Integer> s=new Stack<>();
	    int n=sc.nextInt();
            while(n-->0)
		s.push(sc.nextInt());
            GfG g=new GfG();
	    Stack<Integer> a=g.sort(s);
	    while(!a.empty()){
		System.out.print(a.peek()+" ");
		a.pop();
            }
	    System.out.println();
	}
    }
}