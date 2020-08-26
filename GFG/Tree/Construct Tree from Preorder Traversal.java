class GFG
{
    int index = 0;
    Node constructTree(int n, int pre[], char preLN[])
    {
	    if(index >= n)
	        return null;
	    int curr = pre[index];
	    if(preLN[index++] == 'L'){
	        Node node = new Node(curr);
	        node.left = null;
	        node.right = null;
	        return node;
	    }
	    Node node = new Node(curr);
	    node.left = constructTree(n, pre, preLN);
	    node.right = constructTree(n, pre, preLN);
	    return node;
    }
}