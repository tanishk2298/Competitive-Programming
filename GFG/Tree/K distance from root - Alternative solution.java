class Tree
{
     // Recursive function to print right view of a binary tree.
     void printKdistance(Node root, int k)
     {
        if(root == null)
            return;
        if(k == 0)
            System.out.print(root.data+" ");
        else{
            printKdistance(root.left, k-1);
            printKdistance(root.right, k-1);
        }
     }
}