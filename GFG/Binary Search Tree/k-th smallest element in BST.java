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
    int n = 1, ans = -1;
    public int KthSmallestElement(Node root, int K) 
    {
        if(root == null)
            return -1;
        findKth(root,K);
        return ans;
    }
    public void findKth(Node root, int K){
        if(root == null)
            return;
        findKth(root.left,K);
        if(n == K)
            ans = root.data;
        n++;
        findKth(root.right,K);
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
            int k = Integer.parseInt(br.readLine().trim());
            Solution T = new Solution();
            System.out.println(T.KthSmallestElement(root,k));
        }
    }
}