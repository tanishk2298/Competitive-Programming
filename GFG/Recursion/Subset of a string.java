import java.util.*;
import java.io.*;

public class GFG {	
	
	public static ArrayList<String> ans = new ArrayList<String>();

	public static void main (String[] args)throws IOException {
		Scanner sc = new Scanner(System.in);
			String ip = sc.nextLine();
			String op = "";
			subset(ip,op);
			Collections.sort(ans);
			for(String ans : ans)
				System.out.print(ans+"  ");
	}
	public static void subset(String ip, String op){
		if(ip.length() == 0){
			ans.add(op);
			return;
		}
		String op1 = op;
		String op2 = op;
		op2 += ip.charAt(0);
		ip = ip.substring(1);
		subset(ip, op1);
		subset(ip, op2);
	}
}