class Level_order_traversal
{
    static ArrayList <Integer> levelOrder(Node node){
        Queue<Node> que = new LinkedList<Node>();
        ArrayList<Integer> ans = new ArrayList<Integer>();
        if(node == null)
            return ans;
        que.add(node);
        while(que.isEmpty() == false){
            Node curr = que.poll(); 
            ans.add(curr.data);
            if(curr.left != null)
                que.add(curr.left);
            if(curr.right != null)
                que.add(curr.right);
        }
        return ans;
    }
}