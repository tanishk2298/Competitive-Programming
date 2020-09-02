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

class Solution
{
    HashMap<Node,Node> map = new HashMap<>();
    ArrayList<Integer> answer = new ArrayList<>();
    public ArrayList<Integer> KDistanceNodes(Node root, int target , int k)
    {
        getLinks(root);
        Node targetNode = getTarget(root,target);
        distancedNodes(targetNode,k);
        Collections.sort(answer);
        return answer;
    }
    public void getLinks(Node root){
        if(root == null)
            return;
        if(root.left != null){
            map.put(root.left,root);
            getLinks(root.left);
        }
        if(root.right != null){
            map.put(root.right,root);
            getLinks(root.right);
        }
    }
    public Node getTarget(Node root, int target){
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()){
            Node curr= que.poll();
            if(curr.data == target)
                return curr;
            if(curr.left != null)
                que.add(curr.left);
            if(curr.right != null)
                que.add(curr.right);
        }
        return null;
    }
    public void distancedNodes(Node targetNode, int k){
        Queue<Node> que = new LinkedList<>();
        que.add(targetNode);
        int level = 0;
        HashSet<Node> seenNodes = new HashSet<>();
        seenNodes.add(targetNode);
        while(!que.isEmpty()){
            int len = que.size();
            for(int i=0;i<len;i++){
                Node curr = que.poll();
                if(curr.left != null && !seenNodes.contains(curr.left)){
                    seenNodes.add(curr.left);
                    que.add(curr.left);
                }
                if(curr.right != null && !seenNodes.contains(curr.right)){
                    seenNodes.add(curr.right);
                    que.add(curr.right);
                }
                Node parent = map.get(curr);
                if(parent != null && !seenNodes.contains(parent)){
                    seenNodes.add(parent);
                    que.add(parent);
                }
            }
            if(++level == k)
                break;
        }
        while(!que.isEmpty())
            answer.add(que.poll().data);
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