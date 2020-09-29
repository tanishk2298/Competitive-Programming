import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc-->0){
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    int sum = 0;
		    for(int i=0;i<n;i++){
		        arr[i] = sc.nextInt();
		        sum += arr[i];
		    }
		    if(sum >= 0)
		        System.out.println("YES");
		    else
		        System.out.println("NO");
		}
	}
}