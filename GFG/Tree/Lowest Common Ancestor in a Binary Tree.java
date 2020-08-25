class Tree
{
	Node lca(Node root, int n1,int n2)
	{
		if(root == null)
		    return null;
		if(root.data == n1 || root.data == n2)
		    return root;
		Node a = lca(root.left, n1, n2);
        Node b = lca(root.right, n1, n2);
        if(a != null && b != null)
            return root;
        if(a != null)
            return a;
        else 
            return b;
	}
}