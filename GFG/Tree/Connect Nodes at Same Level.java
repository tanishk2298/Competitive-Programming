class Tree
{
    public static void connect(Node p){
    	if(p == null)
        	return;
        Queue<Node> que = new LinkedList<>();
        que.add(p);
        while(!que.isEmpty()){
        	int count = que.size();
                Node prev = null;
                for(int i=0;i<count;i++){
                    Node curr = que.poll();
                    if(curr.left != null)
                        que.add(curr.left);
                    if(curr.right != null)
                        que.add(curr.right);
                    if(prev != null)
                        prev.nextRight = curr;
                    prev = curr;
                }
        }
    }
}