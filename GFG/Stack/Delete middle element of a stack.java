import java.util.*;
import java.lang.*;
import java.io.*;

class Geeks
{
        public Stack<Integer> deleteMid(Stack<Integer>s,int sizeOfStack,int current){
            solve(s,(sizeOfStack/2));
            return s;
        } 
        public static void solve(Stack<Integer>s,int k){
            if(k == 0){
                s.pop();
                return;
            }
            int temp = s.pop();
            solve(s,k-1);
            s.push(temp);
        }
}

//Driver Function

class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int testcases=sc.nextInt();
	    while(testcases-->0)
	    {
	        int sizeOfStack =sc.nextInt();   
	        Stack <Integer> myStack=new Stack<>();
	        for(int i=0;i<sizeOfStack;i++)
	        {
	            int x=sc.nextInt();
	            myStack.push(x);     
	        }
	        if(sizeOfStack==1)
	            System.out.println(myStack.peek());
	        else{
	            Geeks obj=new Geeks();
	            Stack <Integer> modified=obj.deleteMid(myStack,sizeOfStack,0);
	            while(!modified.isEmpty())
	            {
	                System.out.print(modified.peek()+" ");
	                modified.pop();
	            }
	            System.out.println();
	        }
	    }    
	}
}