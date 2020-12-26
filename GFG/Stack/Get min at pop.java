import java.util.*;
import java.lang.*;
import java.io.*;

class GetMin
{
    public static Stack<Integer> _push(int arr[],int n){
        Stack<Integer> stk = new Stack<>();
        stk.push(arr[0]);
        for(int i=1;i<n;i++){
            if(arr[i] < stk.peek())
                stk.push(arr[i]);
            else
                stk.push(stk.peek());
        }
        return stk;
    }
    static void _getMinAtPop(Stack<Integer>s){
        while(!s.isEmpty())
            System.out.print(s.pop()+" ");
    }
}

//Driver Function

class SortedStack{
    public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0){
            int n=sc.nextInt();
	    Stack<Integer> s=new Stack<>();
            int arr[] = new int[n];
            for(int i = 0; i < n; i++)
              arr[i] = sc.nextInt();
            Stack<Integer>mys = new GetMin()._push(arr,n);
            new GetMin()._getMinAtPop(mys);
	    System.out.println();
	}
    }
}