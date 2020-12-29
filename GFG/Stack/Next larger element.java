import java.util.*;
import java.io.*;
import java.lang.*;

class solve{
    public static long[] nextLargerElement(long[] arr, int n) { 
        Stack<Long> stk = new Stack<>();
        long[] ans = new long[n];
        for(int i=(n-1);i>=0;i--){
            while(!stk.isEmpty() && arr[i] >= stk.peek())
                stk.pop();
            if(stk.isEmpty())
                ans[i] = -1;
            else
                ans[i] = stk.peek();
            stk.push(arr[i]);
        }
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
