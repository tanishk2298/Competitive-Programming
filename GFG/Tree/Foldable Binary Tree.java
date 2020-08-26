class Tree {
    boolean IsFoldable(Node node) 
	{ 
        if(node == null)
            return true;
        return findIsFoldable(node.left, node.right);
	} 
	boolean findIsFoldable(Node node1, Node node2){
	    if(node1 == null && node2 == null)
	        return true;
	    if(node1 == null || node2 == null)
	        return false;
	    return (findIsFoldable(node1.left, node2.right) && findIsFoldable(node1.right, node2.left));
	}
}