import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;

class Node{ 
     int data; 
     Node left, right; 
     public Node(int d){ 
         data = d; 
         left = right = null; 
     } 
}

class Solution{
    int printKDistantfromLeaf(Node root, int k){
        HashSet<Node> set = new HashSet<>();
        int count = 0;
        ArrayList<Node> arr = new ArrayList<>();
        dist(root,k,count,arr,set);
        return set.size();
    }
    void dist(Node root, int k, int count, ArrayList<Node> arr, Set<Node> set){
        if(root == null)
            return;
        arr.add(root);
        if(root.left == null && root.right == null && (count-k)>=0)
            set.add(arr.get(count-k));
        dist(root.left,k,count+1,arr,set);
        dist(root.right,k,count+1,arr,set);
        arr.remove(root);
    }
}

//Driver Function

class Main {
    static Node buildTree(String str) {

        if (str.length() == 0 || str.charAt(0) == 'N') {
            return null;
        }

        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        // Starting from the second element

        int i = 1;
        while (queue.size() > 0 && i < ip.length) {

            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();

            // Get the current node's value from the string
            String currVal = ip[i];

            // If the left child is not null
            if (!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }

            // For the right child
            i++;
            if (i >= ip.length) break;

            currVal = ip[i];

            // If the right child is not null
            if (!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String s = br.readLine().trim();
            Node root = buildTree(s);
            String[] ab = br.readLine().trim().split(" ");
            int a = Integer.parseInt(ab[0]);
            int b = Integer.parseInt(ab[1]);

            GfG g = new GfG();
            System.out.println(g.findDist(root, a, b));
        }
    }
}