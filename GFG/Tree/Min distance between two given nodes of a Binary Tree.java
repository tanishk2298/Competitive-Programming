import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class GfG {
    int findDist(Node root, int a, int b) {
        Node anc = lca(root, a, b);
        int lf = getDist(anc, a);
        int rf = getDist(anc, b);
        return (lf+rf);
    }
    Node lca(Node root, int a, int b){
        if(root == null)
            return null;
        if(root.data == a || root.data == b)
            return root;
        Node a1 = lca(root.left, a ,b);
        Node b1 = lca(root.right, a ,b);
        if(a1 != null && b1 != null)
            return root;
        if(a1 != null)
            return a1;
        else
            return b1;
    }
    int getDist(Node root, int target){
        if(root == null)
            return -1;
        if(root.data == target)
            return 0;
        int lDist = getDist(root.left, target);
        int rDist = getDist(root.right, target);
        if(lDist == -1 && rDist == -1)
            return -1;
        return 1+Math.max(lDist, rDist);
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