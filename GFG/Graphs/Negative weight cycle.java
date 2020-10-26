import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int v = sc.nextInt();
            int e = sc.nextInt();
            String[] graph = new String[e];
            for(int i=0;i<e;i++){
                int src = sc.nextInt();
                int dest = sc.nextInt();
                int wt = sc.nextInt();
                graph[i] = src+" "+dest+" "+wt;
            }
            try{
                boolean ans = bellmanFord(graph,v,e);
                if(ans)
                    System.out.println(1);
                else
                    System.out.println(0);
            }catch(Exception ex){
	            System.out.println(0);
	        }
        }
    }
    public static boolean bellmanFord(String[] graph, int v, int e){
        int[] cost_parent = new int[v];
	int[] val = new int[v];
	Arrays.fill(val, Integer.MAX_VALUE);
	val[0] = 0;
	for(int i=0;i<(v-1);i++){
	    for(int j=0;j<e;j++){
	        String[] sdw = graph[j].split(" ");
	        int src = Integer.parseInt(sdw[0]);
	        int dest = Integer.parseInt(sdw[1]);;
	        int wt = Integer.parseInt(sdw[2]);
	        if(val[src] != Integer.MAX_VALUE && (val[src] + wt) < val[dest])
	            val[dest] = val[src] + wt;
	    }
	}
	for(int i=0;i<e;i++){
	    String[] sdw = graph[i].split(" ");
	    int src = Integer.parseInt(sdw[0]);
	    int dest = Integer.parseInt(sdw[1]);
	    int wt = Integer.parseInt(sdw[2]);  
	    if(val[src] != Integer.MAX_VALUE && (val[src] + wt) < val[dest])
	        return true;
	}
	return false;
    }
}