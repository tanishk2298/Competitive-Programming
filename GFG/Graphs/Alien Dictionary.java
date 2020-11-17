import java.util.*;
import java.lang.*;
import java.io.*;

class Solution
{
    public String findOrder(String [] dict, int n, int k)
    {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<k;i++)
            adj.add(i, new ArrayList<Integer>());
        for(int i=0;i<(n-1);i++){
            String word1 = dict[i];
            String word2 = dict[i+1];
            for(int j=0;j<Math.min(word1.length(), word2.length());j++){
                if(word1.charAt(j) != word2.charAt(j)){
                    adj.get(word1.charAt(j)-'a').add(word2.charAt(j)-'a');
                    break;
                }
            }
        }
        String ans = topo(adj, k);
        return ans;
    }
    public static String topo(ArrayList<ArrayList<Integer>> adj, int k){
        Stack<Integer> stk = new Stack<>();
        boolean[] vis = new boolean[k];
        Arrays.fill(vis, false);
        for(int i=0;i<k;i++)
            if(vis[i] == false)
                dfs(adj, stk, i, k, vis);
        String ans = "";
        while(!stk.isEmpty())
            ans += stk.pop() + 'a';
        return ans;
    }
    public static void dfs(ArrayList<ArrayList<Integer>> adj, Stack<Integer> stk, int i, int k, boolean[] vis){
        vis[i] = true;
        for(int v : adj.get(i))
            if(vis[v] == false)
                dfs(adj, stk, v, k, vis);
        stk.push(i);
    }
}

//Driver Function

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);	
		int t = Integer.parseInt(sc.next());
		while(t-->0){
		    int n = Integer.parseInt(sc.next());
		    int k = Integer.parseInt(sc.next());    
		    String[] words = new String[n];	    
		    for(int i=0;i<n;i++)
		        words[i] = sc.next();    
		    Solution T = new Solution();
		    String order = T.findOrder(words,n,k);
		    String temp[] = new String[n];
		    for(int i=0;i<n;i++)
		        temp[i] = words[i];
		    Arrays.sort(temp, new Comparator<String>(){
		    	@Override
                    	public int compare(String a, String b) {
                    		int index1 = 0;
                    		int index2 = 0;
                    		for(int i = 0; i < Math.min(a.length(), b.length()) && index1 == index2; i++) {
                        		index1 = order.indexOf(a.charAt(i));
                        		index2 = order.indexOf(b.charAt(i));
                    		}
                    		if(index1 == index2 && a.length() != b.length()){
                        		if(a.length() < b.length())
                            			return 1;
                        		else
                            			return 0;
                    		}
                    		if(index1 < index2)
                        		return 1;
                    		else
                        		return 0;
                        }
		    });
		    int flag = 1;
		    for(int i=0;i<n;i++){
		        if(!words[i].equals(temp[i])){
	                	flag = 0;
	                	break;
	            	}
		    }
		    System.out.println(flag);
		}
	}	
}