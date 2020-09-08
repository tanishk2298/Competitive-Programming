import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

class pair{
    int first;
    int second;
    pair(int first , int second){
    	this.first = first;
        this.second = second;
    }
}

class Sol
{
    Node prev = null, first = null, second = null;
    public Node correctBST(Node root)
    {
        if(root == null)
            return null;
        inorder(root);
        int temp = second.data;
        second.data = first.data;
        first.data = temp;
        return root;
    }
    public void inorder(Node root){
        if(root == null)
            return;
        inorder(root.left);
        if(prev != null && root.data < prev.data){
            if(first == null)
                first = prev;
            second = root;
        }
        prev = root;
        inorder(root.right);
    }
}

//Driver Function

class GfG {
    
    static Node buildTree(String str){
        if(str.length()==0 || str.charAt(0)=='N')
            return null;
        String ip[] = str.split(" ");
        Node root = new Node(Integer.parseInt(ip[0]));
        Queue<Node> queue = new LinkedList<>(); 
        queue.add(root);
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            Node currNode = queue.peek();
            queue.remove();
            String currVal = ip[i];
            if(!currVal.equals("N")) {
                currNode.left = new Node(Integer.parseInt(currVal));
                queue.add(currNode.left);
            }
            i++;
            if(i >= ip.length)
                break;
            currVal = ip[i];
            if(!currVal.equals("N")) {
                currNode.right = new Node(Integer.parseInt(currVal));
                queue.add(currNode.right);
            }
            i++;
        }
        return root;
    }
    static void printInorder(Node root){
        if(root == null)
            return;
        printInorder(root.left);
        System.out.print(root.data+" ");
        printInorder(root.right);
    }
    
    public static boolean isBST(Node n, int lower, int upper){
        if(n==null)
            return true;
        if( n.data <= lower || n.data >= upper )
            return false;
        return (  isBST( n.left, lower, n.data )  &&  isBST( n.right, n.data, upper )  );
    }

    public static boolean compare( Node a, Node b, ArrayList<pair> mismatch ){
        if( a==null && b==null ) return true;
        if( a==null || b==null ) return false;
        if( a.data != b.data ){
            pair temp = new pair(a.data,b.data);
            mismatch.add(temp);
        }
        return ( compare( a.left, b.left, mismatch ) && compare( a.right, b.right, mismatch ) );
    }
    public static void main (String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int t=Integer.parseInt(br.readLine());
	while(t-- > 0){
		String s = br.readLine();
    	    	Node root = buildTree(s);
    	    	Node duplicate = buildTree(s);
    	    	Sol g = new Sol();
        	root = g.correctBST(root);
                if(isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE) == false){
                    System.out.println(0);
                    continue;
                }
                ArrayList<pair> mismatch = new ArrayList<pair>();
                if( compare( root, duplicate, mismatch) == false){
                    System.out.println(0);
                    continue;
                }
                if( mismatch.size() !=2 || mismatch.get(0).first!=mismatch.get(1).second || mismatch.get(0).second!=mismatch.get(1).first )
                    System.out.println(0);
                else
                    System.out.println(1);            
       }
    }
}