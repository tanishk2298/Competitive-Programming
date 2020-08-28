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

class BinaryTree{
    static ArrayList <Integer> verticalOrder(Node root){
        ArrayList<Integer> answer = new ArrayList<>();
        if(root == null)
            return answer;
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(root.data);
        int hd = 0;
        map.put(hd, temp);
        HashMap<Node, Integer> nodeMap = new HashMap<>();
        nodeMap.put(root, hd);
        while(!que.isEmpty()){
            int count = que.size();
            for(int i=0;i<count;i++){
                Node curr = que.poll();
                hd = nodeMap.get(curr);
                if(curr.left != null){
                    que.add(curr.left);
                    ArrayList<Integer> mapList = map.get(hd-1);
                    if(mapList != null)
                        mapList.add(curr.left.data);
                    else{
                        mapList = new ArrayList<>();
                        mapList.add(curr.left.data);
                    }
                    map.put(hd-1, mapList);
                    nodeMap.put(curr.left, hd-1);
                }
                if(curr.right != null){
                    que.add(curr.right);
                    ArrayList<Integer> mapList = map.get(hd+1);
                    if(mapList != null)
                        mapList.add(curr.right.data);
                    else{
                        mapList = new ArrayList<>(); 
                        mapList.add(curr.right.data);
                    }
                    map.put(hd+1, mapList);
                    nodeMap.put(curr.right, hd+1);
                }
            }
        }
        for(Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()){
            ArrayList<Integer> values_list = entry.getValue();
            for(int i = 0; i<values_list.size(); i++){
                answer.add(values_list.get(i));
            }
        }
        return answer;
    }
}

class GfG {
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
    	while(t-- > 0){
		String s = br.readLine();
    	    	Node root = buildTree(s);
                BinaryTree obj = new BinaryTree();
                ArrayList <Integer> res = obj.verticalOrder(root);
                for (Integer num : res) System.out.print(num + " "); 
                System.out.println();
    	}
    }
}