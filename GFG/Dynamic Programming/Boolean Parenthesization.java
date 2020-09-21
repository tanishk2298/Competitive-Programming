import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
    	public static HashMap<String, Integer> mp = new HashMap<>();
    	public static void main (String[] args)throws IOException {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine().trim());
		while(tc-->0){ 
		    mp.clear();
	            int n = Integer.parseInt(br.readLine().trim());	
		    String str = br.readLine().trim();
		    int ans = solve(str,0,n-1,true);
		    System.out.println(ans);
		}
	}
	public static int solve(String str, int i, int j, boolean isTrue){
	    if(i > j)
	        return 0;
	    if(i == j){
	        if(isTrue)
	            return (str.charAt(i) == 'T') ? 1 : 0;
	        else
	            return (str.charAt(i) == 'F') ? 1 : 0;
	    }
	    int ans = 0;
	    StringBuilder temp = new StringBuilder();
	    temp.append(Integer.toString(i)+" "+Integer.toString(j)+" "+Boolean.toString(isTrue));
	    if(mp.containsKey(temp))
	        return mp.get(temp);
	    for(int k=(i+1);k<j;k+=2){
	        int lt = solve(str,i,k-1,true);
	        int lf = solve(str,i,k-1,false);
	        int rt = solve(str,k+1,j,true);
	        int rf = solve(str,k+1,j,false);
	        if(str.charAt(k) == '&'){
	            if(isTrue)
	                ans += (lt*rt);  
	            else
	                ans += (lf*rt) + (lt*rf) + (lf*lf);
	        }
	        else if(str.charAt(k) == '|'){
	            if(isTrue)
	                ans += (lt*rt) + (lt*rf) + (lf*rt);
	            else
	                ans += (lf*rf);
	        }
	        else if(str.charAt(k) == '^'){
	            if(isTrue)
	                ans += (lt*rf) + (lf*rt);
	            else
	                ans += (lt*rt) + (lf*rf);
	        }
	    }
	    mp.put(temp.toString(),ans);
	    return ans%1003;
	}
}