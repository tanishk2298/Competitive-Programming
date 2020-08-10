import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases-->0){
		    int n = sc.nextInt();
		    int m = sc.nextInt();
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int a = 0, b = 0;
		    if(x<=y){
		        a = x;
		        b = y-x;
		        if(b>x)
		            b = x;
		    }
		    else{
		        a = y;
		        b = 0;
		    }
		    int sum = 0;
		    for(int i=0;i<n;i++){
		        for(int j=0;j<m;j++){
		            if(i%2==0){
    		            	if(j%2==0)
    		                	sum += a;
    		            	else
    		                	sum += b;
		            }
		            else{
		                if(j%2==0)
    		                	sum += b;
    		            	else
    		                	sum += a;
		            }
		        }
		    }
		    if(n==1&&m==1)
		        System.out.println(x);
		    else
    		    	System.out.println(sum);
		}
	}
}