import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    	public static HashMap<String,Boolean> mp = new HashMap<>();
    
	public static void main (String[] args) {
	    	Scanner sc = new Scanner(System.in);
        	int tc = sc.nextInt();
        	while(tc-->0){
            		String a = sc.next();
            		String b = sc.next();
            		boolean ans = isScrambled(a,b);
            		System.out.println(ans);
            		mp.clear();
        	}
	}
	
	public static boolean isScrambled(String a, String b){
	    if(a.compareTo(b) == 0)
	        return true;
	    if(a.length() != b.length())
	        return false;
	    if(a.length()==0 || b.length()==0)
	        return false;
	    String temp = a+" "+b;
	    if(mp.containsKey(temp))
	        return mp.get(temp);
	    boolean ans = false;
	    int n = a.length();
	    for(int i=1;i<n;i++){
	        boolean cond1 = ( isScrambled(a.substring(0,i),b.substring(n-i,n)) && isScrambled(a.substring(i,n),b.substring(0,n-i)) );
	        boolean cond2 = ( isScrambled(a.substring(0,i),b.substring(0,i)) && isScrambled(a.substring(i,n),b.substring(i,n)) );
	        if(cond1 || cond2){
	            ans = true;
	            break;
	        }     
	    }
	    mp.put(temp,ans);
	    return ans;
	}
}