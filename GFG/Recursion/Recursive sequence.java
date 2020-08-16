import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(br.readLine());
		while(cases-->0){
		    long n = Long.parseLong(br.readLine());
		    System.out.println(seq(n,1,1));
		}
	}
	public static long seq(long n, long currSeq, long currNum){
	    if(currSeq>n)
	        return 0;
	    long i = 1;
	    for(int j=1;j<=currSeq;j++){
	        i *= currNum;
	        currNum += 1;
	    }
	    return i + seq(n, currSeq+1, currNum);
	}
}