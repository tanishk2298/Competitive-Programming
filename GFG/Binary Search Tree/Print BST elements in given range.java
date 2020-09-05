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

class Solution
{   
    public static ArrayList<Integer> printNearNodes(Node root, int low, int high){
        ArrayList<Integer> ans = new ArrayList<>();
        inorder(root, low, high, ans);
        return ans;
    }
    
    public static void inorder(Node root, int low, int high, ArrayList<Integer> ans){
        if(root == null)
            return;
        inorder(root.left,low,high,ans);
        if(root.data>=low && root.data<=high)
            ans.add(root.data);
        inorder(root.right,low,high,ans);
    }    
}

//Driver Function


class GFG {
    
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

    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t--> 0){
            String s = br.readLine();
            Node root = buildTree(s);
            GfG g = new GfG();
            Node rootA = g.binaryTreeToBST(root);
            printInorder(rootA);
            System.out.println();
        }
    }
}