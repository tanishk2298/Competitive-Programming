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

class GfG{
    public Node deleteNode(Node root,int x){
        if(root == null)
            return null;
        if(root.data >= x){
            root.right = null;
            root = deleteNode(root.left,x);
        }
        else
            root.right = deleteNode(root.right, x);
        return root;
    }
}


//Driver Function

class Node{
	int data;
	Node left,right;
	Node(int d){
		data=d;
		left=right=null;
	}
}
class DeleteNodes{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			Node root=null;
			for(int i=0;i<n;i++){
				int a=sc.nextInt();
				if(root==null){
					root=new Node(a);
				}
				else{
					insert(root,a);
				}
			}
			int x=sc.nextInt();
			GfG g=new GfG();
			root=g.deleteNode(root,x);
			inorder(root);
			System.out.println();
		}
	}
	public static void inorder(Node root){
		if(root==null)
			return;
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	public static Node insert(Node root,int a){
		if(root==null)
			return new Node(a);
		else if(a<root.data)
			root.left=insert(root.left,a);
		else
			root.right=insert(root.right,a);
		
		return root;
	}
}