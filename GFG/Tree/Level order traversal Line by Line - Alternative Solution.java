class Level_Order_Traverse
{
    static void levelOrder(Node node) 
    {
        if(node == null)
            return;
        Queue<Node> que = new LinkedList<>();
        que.add(node);
        while(!que.isEmpty()){
            int count = que.size();
            for(int i=0;i<count;i++){
                Node curr = que.poll();
                System.out.print(curr.data+" ");
                if(curr.left != null)
                    que.add(curr.left);
                if(curr.right != null)
                    que.add(curr.right);
            }
            System.out.print("$ ");
        }
    }
}