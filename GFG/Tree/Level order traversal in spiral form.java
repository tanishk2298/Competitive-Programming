class Spiral
{
      void printSpiral(Node node) 
      {
            if(node == null)
                return;
            Queue<Node> que = new LinkedList<>();
            Stack<Integer> stk = new Stack<>();
            boolean rev = true;
            que.add(node);
            while(!que.isEmpty()){
                int count = que.size();
                for(int i=0;i<count;i++){
                    Node curr = que.poll();
                    if(rev == true)
                        stk.add(curr.data);
                    else
                        System.out.print(curr.data+" ");
                    if(curr.left != null)
                        que.add(curr.left);
                    if(curr.right != null)
                        que.add(curr.right);
                }
                if(rev == true)
                    while(!stk.isEmpty())
                        System.out.print(stk.pop()+" ");
                rev = !rev;
           }
      }
}