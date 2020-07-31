/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception{
           Scanner sc = new Scanner(System.in);
            int cases = 0;
            if(sc.hasNextInt())
	            cases = sc.nextInt();
	        for(int x=0;x<cases;x++){
	            int size = 0;
	        	if(sc.hasNextInt())
	        	    size = sc.nextInt();
	            int[] a = new int[size];
	            int[] b = new int[size];
	            for(int i=0;i<size;i++)
	            	a[i] = sc.nextInt();
	            for(int i=0;i<size;i++)
	                b[i] = sc.nextInt();
	            long ans = getAns(size,a,b);
	            System.out.println(ans);
	        }
	}
	    public static long getAns(int size, int[] a,int[] b) {
	            long cost = 0;
	            int m = Integer.MAX_VALUE;
	            HashMap<Integer, Integer> da = new HashMap<>();
	            HashMap<Integer, Integer> db = new HashMap<>();
	            ArrayList<Integer> f = new ArrayList<>();
	            for(int i=0;i<size;i++){
	                if(da.containsKey(a[i]))
	                	da.put(a[i], da.get(a[i])+1);
	    		    else
	    		        da.put(a[i],1);
	    		    if(db.containsKey(b[i]))
	    		        db.put(b[i], db.get(b[i])+1);
	    		    else
	    		        db.put(b[i],1);
	    		    m = Math.min(m,a[i]);
	    		    m = Math.min(m,b[i]);
	            }
	            int temp = 0;
	            for(Map.Entry mapElement : da.entrySet()){
	                int u = (int)mapElement.getKey();
	                int v = (int)mapElement.getValue();
	                if(db.containsKey(u))
	                	temp = db.get(u);
	                else
	                    temp = 0;
	                if(v > temp){
	                    v -= temp;
	                    if(v %2 == 0)
	                        for(int y = 0;y<(v/2);y++)
	                    	    f.add(u);
	                    else
	                    	return -1;
	                }
	                else
	                    continue;
	            }
	            for(Map.Entry mapElement : db.entrySet()){
	                int u = (int)mapElement.getKey();
	                int v = (int)mapElement.getValue();
	                if(da.containsKey(u))
	                	temp = da.get(u);
	                else
	                    temp = 0;
	                if(v > temp){
	                    v -= temp;
	                    if(v %2 == 0)
	                        for(int y = 0;y<(v/2);y++)
	                    	    f.add(u);
	                    else
	                        return -1;
	                }
	                else
	                    continue;
	            }
	            if(f.size() == 0)
	            	return 0;
	            else{
	                Collections.sort(f);
	                for(int i=0;i<(f.size()/2);i++)
	                	cost = cost + Math.min(f.get(i),m*2);
	           }
	        return cost;
	    }
}
