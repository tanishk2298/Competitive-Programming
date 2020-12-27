import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    static long o = 0;
    public static void main (String[] args) throws java.lang.Exception{
	Scanner sc = new Scanner(System.in);
	int tc = sc.nextInt();
	while(tc-->0){
	    long n = sc.nextLong();
	    long qry = sc.nextLong();
	    long[] arr = new long[(int)n];
	    ArrayList<ArrayList<Long>> list = new ArrayList<>();
	    StringBuffer sbf = new StringBuffer("");
	    for(int i=0;i<n;i++){
	        arr[i] = sc.nextLong();
	        list.add(i, new ArrayList<Long>(Collections.nCopies(33, o)));
	    }
	    for(int i=0;i<n;i++)
	        setP((int)arr[i], 0, i, list);
	    for(int i=0;i<n;i++){
	        for(int j=32;j>=0;j--){
		    boolean currA = (list.get(i).get(j) == 1);
    	            if(qry > 0 && currA){
    	                boolean flag = false;
    	                for(int k=(i+1);k<(n-1);k++){
    	                    boolean currB = (list.get(k).get(j) == 1);
    	                    if(currB){
    	                        flag = true;
    	                        qry--;
        	                list.get(i).set(j, o);
        	                list.get(k).set(j, o);
        	                break;
    	                    }
    	                }
    	                if(i!=(n-1) && qry>0 && !flag){
    	                    int back = (int)n-1;
    	                    long curr = list.get(back).get(j) ^ 1;
    	                    list.get(i).set(j, o);
    	                    list.get(back).set(j, curr);
    	                    qry--;
    	                }
    	            }
	        }
	    }
	    for(int i=0;i<n;i++){
	        long x = 0;
	        for(int j=0;j<33;j++)
	            x += list.get(i).get(j) * (1 << j);
	        arr[i] = x;
	    }
	    boolean cond = (n == 2) && (qry%2 != 0) && (qry > 0);
	    if(cond){
    	        int last = (int)n;
    	        arr[--last] ^= 1;
    	        arr[--last] ^= 1;     
	    }
	    for(int i=0;i<n;i++)
	        sbf.append(arr[i]+" ");
	    System.out.println(sbf);
        }
    }
}
