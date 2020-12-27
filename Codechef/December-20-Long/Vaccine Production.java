import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception{
        	Scanner sc= new Scanner(System.in);
        	int d1 = sc.nextInt();
        	int v1 = sc.nextInt();
        	int d2 = sc.nextInt();
        	int v2 = sc.nextInt();
        	int tot = sc.nextInt();
        	int sum = 0;
        	int days = 1;
        	while(true){
            		if(days >= d1)
                		sum += v1;
            		if(days >= d2)
                		sum += v2;
            		days++;
            		if(sum >= tot)
                		break;
        	}
        	System.out.println(days-1);
	}
}
