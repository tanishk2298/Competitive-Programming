class GFG
{
    // return an array containing the zig zag level order traversal of the given tree
	ArrayList<Integer> zigZagTraversal(Node root){
	    ArrayList<Integer> ans = new ArrayList<>();
	    Stack<Integer> stk = new Stack<>();
	    Queue<Node> que = new LinkedList<>();
	    que.add(root);
	    boolean reverse = false;
	    while(!que.isEmpty()){
	        int count = que.size();
	        for(int i=0;i<count;i++){
	            Node curr = que.poll();
	            if(reverse == true)
	                stk.add(curr.data);
	            else
	                ans.add(curr.data);
    	        if(curr.left != null)
    	                que.add(curr.left);
    	        if(curr.right != null)
    	                que.add(curr.right);
	        }
	        if(reverse  == true)
	            while(!stk.isEmpty())
	                ans.add(stk.pop());
	        reverse = !reverse;
	    }
	    return ans;
	}
}