Problem Link = [ https://practice.geeksforgeeks.org/problems/reverse-first-k-elements-of-queue/1 ] 
Comapnies = [ Amazon ] 


import java.util.*;

class GfG
{
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k)
    {
        Stack<Integer> stk = new Stack<>();
        while(k-->0)
            stk.push(q.poll());
        Queue<Integer> que = new LinkedList<>();
        while(!stk.isEmpty())
            que.add(stk.pop());
        while(!q.isEmpty())
            que.add(q.poll());
        return que;
    }
}

//Driver code

class ModifyQueue
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            Queue<Integer> q=new LinkedList<>();
                q.add(sc.nextInt());
            GfG g=new GfG();
            Queue<Integer> ans=g.modifyQueue(q,k);
            while(!ans.isEmpty()){
                int a=ans.peek();
                ans.poll();
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
}