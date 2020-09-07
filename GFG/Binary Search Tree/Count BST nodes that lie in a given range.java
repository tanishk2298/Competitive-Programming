import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    
    Node(int data){
        this.data = data;
        this.left = this.right = null;
    }
}

class Geeks{

    public static Node createNewNode(int value){
        Node temp=new Node(value);
        return temp;
    }

    static public Node newNode(Node root,int data){
        if(root==null)
        	root=createNewNode(data);
        else if(data<root.data)
        	root.left=newNode(root.left,data);
        else
        	root.right=newNode(root.right,data);
        return root;
    }

    static int count = 0;

    public static int getCountOfNode(Node root,int l, int h){
        count = 0;
        if(root == null)
            return 0;
        if(root.data > h)
            findCount(root.left,l,h);
        else if(root.data < l)
            findCount(root.right,l,h);
        else
            findCount(root,l,h);
        return count;
    }

    public static void findCount(Node root, int low, int high){
        if(root == null)
            return;
        findCount(root.left,low,high);
        if(root.data >= low && root.data <= high)
            count++;
        findCount(root.right,low,high);
    }
}

//Driver Function

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int testcases=sc.nextInt();
		while(testcases-->0){
		    Node root=null;
		    int sizeOfArray=sc.nextInt();
		    int arr[]=new int[sizeOfArray];
		    for(int i=0;i<sizeOfArray;i++){
		        int x=sc.nextInt();
		        arr[i]=x;
		    }
		    for(int i=0;i<sizeOfArray;i++)
		        root=Geeks.newNode(root,arr[i]);
		    int l,h;
		    l=sc.nextInt();
		    h=sc.nextInt();
		    System.out.println(Geeks.getCountOfNode(root,l,h));
		}
	}
}
