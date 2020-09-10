import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args){
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
	        if(sum%2 != 0)
	            System.out.println("NO");
	        else{
	            int w = sum/2;
	            boolean[][] t = new boolean[n+1][w+1];
	            for(int i=0;i<=w;i++)
	                t[0][i] = false;
	            for(int i=0;i<=n;i++)
	                t[i][0] = true;
	            for(int i=1;i<=n;i++){
	                for(int j=1;j<=w;j++){
	                    if(arr[i-1] <= j)
	                        t[i][j] = t[i-1][j-arr[i-1]] || t[i-1][j]; 
	                    else
	                        t[i][j] = t[i-1][j];
	                }
	            }
	            if(t[n][w] == true)
	                System.out.println("YES");
	            else
	                System.out.println("NO"); 
	        }
	    }
	}
}