class Tree
{
    int count = 0;
    int countSubtreesWithSumX(Node root, int X)
    {
	    if(root == null)
	        return 0;
            countSubtrees(root, X);
            return count;
    }
    int countSubtrees(Node root, int X){
	    if(root == null)
	        return 0;        
            int sum = root.data + countSubtrees(root.left, X) + countSubtrees(root.right, X);
	    if(sum == X)
	        count++;
	    return sum;
    }
}