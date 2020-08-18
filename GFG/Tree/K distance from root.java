class Tree
{
     // Recursive function to print right view of a binary tree.
     void printKdistance(Node root, int k)
     {
        int count = 0;
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        que.add(null);
        while(que.size() > 1){
            Node curr = que.poll();
            if(curr == null){
                count++;
                que.add(null);
            }
            else{
                if(count == k)
                    System.out.print(curr.data+" ");
                if(curr.left != null)
                    que.add(curr.left);
                if(curr.right != null)
                    que.add(curr.right);    
            }
        }
     }
}