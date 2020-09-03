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

class GfG
{
    
    public static int countPairs(Node root1, Node root2, int x)
    {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        fillArr(root1, arr1);
        fillArr(root2, arr2);
        int count = 0;
        int i=0, j=arr2.size()-1;
        while((i>=0 && i<arr1.size()) && (j>=0 && j<arr2.size())){
            int sum = arr1.get(i) + arr2.get(j);
            if(sum == x){
                count++;
                i++;
            }
            else if(sum < x)
                i++;
            else
                j--;
        }
        return count;
    }
    public static void fillArr(Node root, ArrayList<Integer> arr){
        if(root == null)
            return;
        fillArr(root.left, arr);
        arr.add(root.data);
        fillArr(root.right, arr);
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