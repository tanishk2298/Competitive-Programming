class Tree
{
    void leftView(Node node)
    {
        if(node == null)
            return;
        Queue<Node> que = new LinkedList<>();
        que.add(node);
        while(!que.isEmpty()){
            int count = que.size();
            for(int i=0;i<count;i++){
                Node curr = que.poll();
                if(i==0)
                    System.out.print(curr.data+" ");
                if(curr.left != null)
                    que.add(curr.left);
                if(curr.right != null)
                    que.add(curr.right);                
            }
        }
    }
}