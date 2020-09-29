import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc-->0){
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    for(int i=0;i<n;i++)
		        arr[i] = sc.nextInt();
		    boolean flag = false;
		    for(int i=0;i<n;i++){
		        if(arr[i] != (i+1)){
		            if(gcd(arr[i],(i+1)) != arr[i]){
		                flag = true;
		                break;
		            }
		        }        
		    }
		    if(flag)
		        System.out.println("NO");
		    else
		        System.out.println("YES");
		}
	}
	public static int gcd(int a, int b){
	    if(b == 0)
	        return a;
	    return gcd(b,a%b);
	}
}