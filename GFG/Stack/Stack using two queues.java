import java.util.*;
import java.io.*;
import java.lang.*;

class Queues
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    int pop()
    {
        int ans = -1;
	    if(q1.size() == 0 && q2.size() > 0){
	        while(q2.size() != 1)
	            q1.add(q2.poll());
	        ans = q2.poll();
	    }
	    else if(q2.size() == 0 && q1.size() > 0){
	        while(q1.size() != 1)
	            q2.add(q1.poll());
	        ans = q1.poll();        
	    }
	    return ans;
    }
    void push(int a)
    {
        if(!q1.isEmpty())
	       q1.add(a);
	    else
	        q2.add(a);
    }
}

//Driver Function

class StackUsingQueues
{
    public static void main(String args[])
    {
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	while(t-->0)
	{
	    Queues g = new Queues();		
	    int q = sc.nextInt();
    	    while(q-->0){
		int QueryType = sc.nextInt();
		if(QueryType == 1){
		    int a = sc.nextInt();
		    g.push(a);
		}
		else if(QueryType == 2)
		    System.out.print(g.pop()+" ");
	    }	
	    System.out.println();
	}
    }
}