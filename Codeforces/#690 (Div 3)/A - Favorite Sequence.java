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
		    int[] arr = new int[n];
		    for(int i=0;i<n;i++)
		        arr[i] = sc.nextInt();
		    int i=0;
		    int j = n-1;
		    int count = 0;
		    for(int x=0;x<n;x++){
		        if(count%2 == 0){
		            System.out.print(arr[i]+" ");
		            i++;
		        }
		        else{
		            System.out.print(arr[j]+" ");
		            j--;		            
		        }
		        count++;
		    }
		    System.out.println("");
		}
	}
}