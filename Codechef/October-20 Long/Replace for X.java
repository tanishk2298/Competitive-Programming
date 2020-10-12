import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception{
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc-->0){
		    int n = sc.nextInt();
		    int x = sc.nextInt();
		    int p = sc.nextInt();
		    int k = sc.nextInt();
		    int[] arr = new int[n];
		    for(int i=0;i<n;i++)
		        arr[i] = sc.nextInt();
		    Arrays.sort(arr);
		    if((p<k && arr[p-1]<x) || (p>k && arr[p-1]>x))
		        System.out.println("-1");
		    else{
		        int count = 0;
		        if(arr[p-1] == x)
		            System.out.println(count);
    		    else{
    		        if(p > k){
    		            for(int i=p;i<n;i++)
    		                if(arr[i] < x)
    		                    count++;
    		        }
    		        else if(p < k){
    		            for(int i=0;i<(p-1);i++)
    		                if(arr[i] > x)
    		                    count++;
    		        }
    		        else if(p == k){
    		            if(arr[p-1] < x){
    		                for(int i=p;i<n;i++)
    		                    if(arr[i] < x)
    		                        count++;
    		            }
    		            else{
    		                for(int i=0;i<(p-1);i++)
    		                    if(arr[i] > x)
    		                        count++;
    		            } 
    		        }
    		        System.out.println(count+1);
		    }
		}
	}
}