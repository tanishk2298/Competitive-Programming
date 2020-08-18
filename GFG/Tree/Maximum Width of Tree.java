class Tree
{
    // /* Function to get the maximum width of a binary tree*/
    int getMaxWidth(Node root)
    {
        if(root == null)
            return 0;
        int max = 1;
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()){
            int count = que.size();
            if(count > max)
                max = count;
            for(int i=0;i<count;i++){
                Node curr = que.poll();
                if(curr.left != null)
                    que.add(curr.left);
                if(curr.right != null)
                    que.add(curr.right);
            }
        }
        return max;
    }		
}