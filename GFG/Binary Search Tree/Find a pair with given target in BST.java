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
    public int isPairPresent(Node root, int target)
    {
        if(root == null)
            return 0;
        HashSet<Integer> set = new HashSet<>();
        boolean ans = present(root,set,target);
        if(ans == true)
            return 1;
        return 0;
    }
    boolean present(Node root, HashSet<Integer> set, int target){
        if(root == null)
            return false;
        if(present(root.left,set,target))
            return true;
        if(set.contains(target-root.data))
            return true;
        else
            set.add(root.data);
        return present(root.right,set,target);
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
            int target = Integer.parseInt(br.readLine().trim());
            Solution T = new Solution();
            System.out.println(T.isPairPresent(root,target));
        }
    }
}