import java.util.*;
import java.io.*;

public class GFG {	

	public static void main (String[] args)throws IOException {
		Scanner sc = new Scanner(System.in);
        	int cases = sc.nextInt();
        	sc.nextLine();
		while(cases-->0){
			String ip = sc.nextLine();
			String op = "";
			subsetWithSpace(ip.substring(1), op+ip.charAt(0));
			System.out.println("");
		}
	}

	public static void subsetWithSpace(String ip, String op){
		if(ip.length() == 0){
			System.out.print("("+op+")");
			return;
		}
		subsetWithSpace(ip.substring(1), op+" "+ip.charAt(0));
		subsetWithSpace(ip.substring(1), op+ip.charAt(0));
	}
}

/* Sample ip

2
ABC
xyz

*/
