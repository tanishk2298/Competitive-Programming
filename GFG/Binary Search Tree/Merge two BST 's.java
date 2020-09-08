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
    public List<Integer> merge(Node root1,Node root2){
        List<Integer> arr = new ArrayList<>();
        Stack<Node> stk1 = new Stack<>();
        Stack<Node> stk2 = new Stack<>();
        while(root1 != null){
            stk1.push(root1);
            root1 = root1.left;
        }
        while(root2 != null){
            stk2.push(root2);
            root2 = root2.left;
        }
        while(!stk1.isEmpty() || !stk2.isEmpty()){
            root1 = null;
            root2 = null;
            if(!stk1.isEmpty())
                root1 = stk1.peek();
            if(!stk2.isEmpty())
                root2 = stk2.peek();
            if(root1 == null)
                arr.add(stk2.pop().data);
            else if(root2 == null)
                arr.add(stk1.pop().data);
            else if(root1.data < root2.data){
                arr.add(stk1.pop().data);
                root2 = null;
            }
            else{
                arr.add(stk2.pop().data);
                root1 = null;
            }
            if(root1 != null && root1.right != null){
                root1 = root1.right;
                while(root1 != null){
                    stk1.push(root1);
                    root1 = root1.left;
                }
            }
            if(root2 != null && root2.right != null){
                root2 = root2.right;
                while(root2 != null){
                    stk2.push(root2);
                    root2 = root2.left;
                }
            }
        }
        return arr;
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
            String s = br.readLine();
            Node root1 = buildTree(s);
            s = br.readLine();
            Node root2 = buildTree(s);
            Solution T = new Solution();
            List<Integer> ans = T.merge(root1,root2);
            for(int i=0;i<ans.size();i++)
                System.out.print(ans.get(i) + " ");
            System.out.println();
        }
    }
}