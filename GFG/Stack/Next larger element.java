import java.util.*;
import java.io.*;
import java.lang.*;

class solve{
    public static long[] nextLargerElement(long[] arr, int n) { 
        long[] ans = new long[n];
        for(int i=0;i<n-1;i++){
            long curr = arr[i];
            boolean flag = false;
            for(int j=(i+1);j<n;j++){
                if(arr[j] > curr){
                    ans[i] = arr[j];
                    flag = true;
                    break;
                }
            }
            if(!flag)
                ans[i] = -1;
        }
        ans[n-1] = -1;
        return ans;
    } 
}

//Driver Function

class solve{
    public static long[] nextLargerElement(long[] arr, int n) { 
        long[] ans = new long[n];
        for(int i=0;i<n-1;i++){
            long curr = arr[i];
            boolean flag = false;
            for(int j=(i+1);j<n;j++){
                if(arr[j] > curr){
                    ans[i] = arr[j];
                    flag = true;
                    break;
                }
            }
            if(!flag)
                ans[i] = -1;
        }
        ans[n-1] = -1;
        return ans;
    } 
}