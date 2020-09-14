
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef{
    
	  public static void main (String[] args) throws java.lang.Exception{
	    Scanner sc = new Scanner(System.in);
	    int tc = sc.nextInt();
	    while(tc-->0){
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        for(int i=0;i<n;i++)
	            arr[i] = sc.nextInt();
	        int[] ans = new int[n];
	        for(int i=0;i<n;i++){
	            int right = getRightSmaller(i+1, arr, arr[i]);
	            int left = getLeftGreater(i, arr, arr[i]);
	            ans[i] = left + right + 1;
	            if(ans[i]>n)
	                ans[i]=n;
	        }
	        Arrays.sort(ans);
	        System.out.println(ans[0]+" "+ans[n-1]);
	    }
	  }
	  
	  public static int getLeftGreater(int index, int[] arr, int num){
	      int count = 0;
	      for(int i=0;i<index;i++){
	          if(arr[i] > num)
	              count++;
	          else{
	              for(int j=index+1;j<arr.length;j++){
	                  if(arr[j]<arr[i]) {
	                      count++;
	                      break;
	                  }
	              }
	          }
	      }
	      return count;
	  }
	  
	  public static int getRightSmaller(int index, int[] arr, int num){
	      int count = 0;
	      for(int i=index;i<arr.length;i++){
	          if(arr[i] < num )
	              count++;
	          else{
	              for(int j=index-1;j>=0;j--){
	                  if(arr[j]>arr[i]) {
    	                  count++;
    	                  break;
	                  }
	              }
	          }
	      }
	      return count;
      }
}