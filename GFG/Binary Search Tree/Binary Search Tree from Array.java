import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{

	public static void main (String[] args){
	    Scanner sc = new Scanner(System.in);
	    int tc = sc.nextInt();
	    while(tc-->0){
	        int  n = sc.nextInt();
	        int[] arr = new int[n];
	        for(int i=0;i<n;i++)
	            arr[i] = sc.nextInt();
	        bst(arr,0,n-1);
	        System.out.println(" ");
	    }
	}

	public static void bst(int[] arr, int low, int high){
	    if(low > high)
	        return;
	    int mid = low+(high-low)/2;
	    System.out.print(arr[mid]+" ");
	    bst(arr,low,mid-1);
	    bst(arr,mid+1,high);
	}
}
