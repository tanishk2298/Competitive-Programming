import java.util.*;
import java.io.*;

class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}

class View
{
    static void topView(Node root)
    {
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int hd = 0;
        HashMap<Node, Integer> nodeMap = new HashMap<>();
        nodeMap.put(root, hd);
        while(!que.isEmpty()){
            int len = que.size();
            for(int i=0;i<len;i++){
                Node curr = que.poll();
                hd = nodeMap.get(curr);
                if(!map.containsKey(hd))
                    map.put(hd, curr.data);
                if(curr.left != null){
                    que.add(curr.left);
                    nodeMap.put(curr.left, hd-1);
                }
                if(curr.right != null){
                    que.add(curr.right);
                    nodeMap.put(curr.right, hd+1);
                }
            }
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
            System.out.print(entry.getValue()+" ");
    }
}

class GfG{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t > 0){
               	Queue<Node> q = new LinkedList<>();
        	int n = Integer.parseInt(br.readLine());
            	String input[] = br.readLine().trim().split(" ");
                Node root = null;
            	int j=0;
            	while(n > 0){
            		int a1 = Integer.parseInt(input[j]);
            		int a2 = Integer.parseInt(input[j+1]);
            		char lr = input[j+2].charAt(0);
            		j+=3;
            		if(root == null){
                		root = new Node(a1);
                		q.add(root);
            		}
            		Node pick = q.peek();
            		q.remove();
            		if(lr=='L'){
                		pick.left = new Node(a2);
                		q.add(pick.left);
            		}
            		a1 = Integer.parseInt(input[j]);
            		a2 = Integer.parseInt(input[j+1]);
            		lr = input[j+2].charAt(0);
            		j += 3;
            		if(lr=='R'){
                		pick.right = new Node(a2);
                		q.add(pick.right);
            		}
            		n-=2;
        	}
            	new View().topView(root);
            	System.out.println();
            	t--;
        }
    }
}