import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args){
	    Scanner sc = new Scanner(System.in);
	    int tc = sc.nextInt();
	    while(tc-->0){
    	    	int n = sc.nextInt();
    	    	HashMap<Integer, Integer> map = new HashMap<>();
 	   	for(int i=0;i<n;i++){
    		    int a = sc.nextInt();
    	       	    int b = sc.nextInt();
    	            map.put(a,b);
    	    	}
    	    	boolean[] vis = new boolean[31];
    	    	Arrays.fill(vis,false);
    	    	vis[1] = true;
    	    	Queue<String> que = new LinkedList<>();
    	    	String node = 1+" "+0;
    	    	que.add(node);
    	    	int ans = Integer.MAX_VALUE;
    	    	while(!que.isEmpty()){
    	        	node = que.poll();
    	        	String[] fs = node.split(" ");
    	        	int f = Integer.parseInt(fs[0]);
    	        	int s = Integer.parseInt(fs[1]);
    	        	if(f == 30)
    	            		ans = Math.min(ans,s);
    	        	for(int i=1;i<=6;i++){
    	            		int currF = f + i;
    	            		if(map.containsKey(currF))
    	                		currF = map.get(currF);
    	            		int currS = s + 1;
    	            		if(currF <=30 && vis[currF] == false){
    	                		vis[currF] = true;
    	                		node = currF+" "+currS;
    	                		que.add(node);
    	            		}
    	        	}
    	    	}
    	    	System.out.println(ans);
	    }
	}
}