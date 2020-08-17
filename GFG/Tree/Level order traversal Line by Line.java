class Level_Order_Traverse
{
    static void levelOrder(Node node) 
    {
        if(node == null)
            return;
        Queue<Node> que = new LinkedList<Node>();
        que.add(node);
        que.add(null);
        while(que.size() > 1){
            Node curr = que.poll();
            if(curr == null){
                System.out.print("$ ");
                que.add(null);
            }
            else{
                System.out.print(curr.data+" ");
                if(curr.left != null)
                    que.add(curr.left);
                if(curr.right != null)
                    que.add(curr.right);
            }
        }
        System.out.print("$");
    }
}