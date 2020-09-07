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

class Solution{
    int max = 0;
    public Node modify(Node root){
        if(root == null)
            return null;
        modifyTree(root);
        return root;
    }
    public void modifyTree(Node root){
        if(root == null)
            return;
        modifyTree(root.right);
        max += root.data;
        root.data = max;
        modifyTree(root.left);
    }
}

//Driver Function

class GFG
{
    static Node buildTree(String str)
    {
        if(str.length() == 0 || str.equals('N'))
            return null;
        String[] s = str.split(" ");
        Node root = new Node(Integer.parseInt(s[0]));
        Queue <Node> q = new LinkedList<Node>();
        q.add(root);
        int i = 1;
        while(!q.isEmpty() && i < s.length){
              Node currrNode = q.remove();
              String currrVal = s[i];
              if(!currrVal.equals("N")){
                  currrNode.left = new Node(Integer.parseInt(currrVal));
                  q.add(currrNode.left);
              }
              i++;
              if(i >= s.length)
                  break;
              currrVal = s[i];
              if(!currrVal.equals("N")){
                  currrNode.right = new Node(Integer.parseInt(currrVal));
                  q.add(currrNode.right);
              }
              i++;
        }
    	return root;
    }
    
    public static void main(String args[]) throws IOException {
    
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0){
            String s = br.readLine();
            Node root = buildTree(s);
            Solution T = new Solution();
            root = T.modify(root);
            inorder(root);
            System.out.println();
        }
    }
}