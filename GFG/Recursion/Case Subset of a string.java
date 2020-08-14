import java.util.*;
import java.io.*;

public class GFG {

	public static void main (String[] args)throws IOException {
		Scanner sc = new Scanner(System.in);
		String ip = sc.nextLine();
		String op = "";
		caseSubset(ip, op);
	}

	public static void caseSubset(String ip, String op){
		if(ip.length() == 0){
			System.out.println(op);
			return;
		}
		caseSubset(ip.substring(1), op+ip.charAt(0));
		caseSubset(ip.substring(1), op+String.valueOf(ip.charAt(0)).toUpperCase());
	}
}