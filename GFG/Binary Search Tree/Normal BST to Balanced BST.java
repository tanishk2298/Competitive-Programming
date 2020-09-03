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

    ArrayList<Integer> arr = new ArrayList<>();

    Node buildBalancedTree(Node root) {
        if(root == null)
            return null;
        createArr(root);
        Node answer = balanced(0, arr.size()-1);
        return answer;
    }

    void createArr(Node root){
        if(root == null)
            return;
        createArr(root.left);
        arr.add(root.data);
        createArr(root.right);
    }

    Node balanced(int low, int high){
        if(low > high)
            return null;
        int mid = (low + high) / 2;
        Node curr = new Node(arr.get(mid));
        curr.left = balanced(low, mid-1);
        curr.right = balanced(mid+1, high);
        return curr;
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