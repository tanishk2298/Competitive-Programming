class Tree {
	public void serialize(Node root, ArrayList<Integer> arr) {
	     if(root == null){
	         arr.add(-1);
	         return;
	     }
    	     arr.add(root.data);
    	     serialize(root.left, arr);
    	     serialize(root.right, arr);
	}
	
    	public Node deSerialize(ArrayList<Integer> arr){
             if(arr.get(0) == -1){
            	arr.remove(0);
        	return null;
             }
             Node curr = new Node(arr.get(0));
             arr.remove(0);
             curr.left = deSerialize(arr);
             curr.right = deSerialize(arr);
             return curr;
         }
}