import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node{
    int data; 
    int hd;
    Node left, right;
    public Node(int key){
        data = key;
        hd = Integer.MAX_VALUE;
        left = right = null;
    }
}

class Tree{
    public ArrayList <Integer> bottomView(Node root){
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Node> que = new LinkedList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        if(root == null)
            return arr;
        que.add(root);
        int hd = 0;
        root.hd = 0;
        while(!que.isEmpty()){
            Node curr = que.poll();
            hd = curr.hd;
            map.put(hd, curr.data);
            if(curr.left != null){
                curr.left.hd = hd - 1;
                que.add(curr.left);
            }
            if(curr.right != null){
                curr.right.hd = hd + 1;
                que.add(curr.right);
            }
        }
        Iterator<Integer> itr = map.values().iterator();
        while(itr.hasNext())
            arr.add(itr.next());
        return arr;
    }
}

//Driver Function

class GfG {
    
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
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
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    static void printInorder(Node root)
    {
        if(root == null)
            return;
            
        printInorder(root.left);
        System.out.print(root.data+" ");
        
        printInorder(root.right);
    }
    
	public static void main (String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
    
	        while(t-- > 0){
	            String s = br.readLine();
    	    	Node root = buildTree(s);
    	        Tree g = new Tree();
			    ArrayList <Integer> res = g.bottomView(root);
			    for (Integer num : res) System.out.print (num + " ");
		     	System.out.println();
	        }
	}
}
