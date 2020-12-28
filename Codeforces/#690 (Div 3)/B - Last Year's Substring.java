import java.util.*;
import java.lang.*;
import java.io.*;

public class cp
{
	public static void main (String[] args)throws IOException {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc-->0){
		    int n = sc.nextInt();
		    String str = sc.next();
		    String left = str.substring(0,4);
		    String right = str.substring(n-4,n);
		    if(left.contains("2020") || right.contains("2020"))
		        System.out.println("YES");
		    else if(str.charAt(0) != '2')
		        System.out.println("NO");  
		    else if(str.charAt(1) != '0'){
		        left = str.substring(n-3,n);
		        if(left.contains("020"))
		            System.out.println("YES"); 
		        else
		            System.out.println("NO");
		    }
		    else if(str.charAt(2) != '2'){
		        left = str.substring(n-2,n);
		        if(left.contains("20"))
		            System.out.println("YES");
		        else
		            System.out.println("NO");
		    }
		    else if(str.charAt(3) != '0'){
		        left = str.substring(n-1,n);
		        if(left.contains("0"))
		            System.out.println("YES");
		        else
		            System.out.println("NO");
		    }
		}
	}
}