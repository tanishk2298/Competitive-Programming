import java.util.*;
import java.io.*;
import java.lang.*;

class solve
{
    public static int[] calculateSpan(int arr[], int n){
            Stack<Integer> stk = new Stack<>();
	    int[] ans= new int[n];
            for(int i=0;i<n;i++){
                while(stk.size() != 0 && arr[i] >= arr[stk.peek()])
                    stk.pop();
                if(stk.isEmpty())
                    ans[i] = (i+1);
                else
                    ans[i] = i - stk.peek();
                stk.push(i);
            }
            return ans;
    }
}

//Driver Function

class gfg
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n =sc.nextInt();
            int a[] = new int[n];
            int i = 0;
            for(i = 0; i < n; i++)
              a[i] = sc.nextInt();
            int[] s = new solve().calculateSpan(a, n);
            for(i = 0; i < n; i++)
                System.out.print(s[i] + " ");
            System.out.println();
        }
    }    
}