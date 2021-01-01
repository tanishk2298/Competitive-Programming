Problem Link = [ https://practice.geeksforgeeks.org/problems/max-rectangle/1 ]
Companies = [ Amazon Directi Intuit MakeMyTrip Microsoft Samsung ]

import java.util.*;
import java.lang.*;

class GfG 
{
    public int maxArea(int mat[][], int n, int m) {
        int[] currHistogram = new int[m];
        for(int i=0;i<m;i++)
            currHistogram[i] = mat[0][i];
        int maxArea = maxAreaOfHistogram(currHistogram, m);
        for(int i=1;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j] == 0)
                    currHistogram[j] = 0;
                else
                    currHistogram[j] += mat[i][j];
            }
            maxArea = Math.max(maxArea, maxAreaOfHistogram(currHistogram, m));
        }
        return maxArea;
    }

    public static int maxAreaOfHistogram(int[] arr, int n){
        Stack<Integer> stk = new Stack<>();
        int[] leftSmaller = new int[n];
        for(int i=0;i<n;i++){
            while(!stk.isEmpty() && arr[i] <= arr[stk.peek()])
                stk.pop();
            if(stk.isEmpty())
                leftSmaller[i] = -1;
            else
                leftSmaller[i] = stk.peek();
            stk.push(i);
        }
        stk.clear();
        int[] rightSmaller = new int[n];
        for(int i=(n-1);i>=0;i--){
            while(!stk.isEmpty() && arr[i] <= arr[stk.peek()])
                stk.pop();
            if(stk.isEmpty())
                rightSmaller[i] = n;
            else
                rightSmaller[i] = stk.peek();
            stk.push(i);
        }
        int[] width = new int[n];
        for(int i=0;i<n;i++)
            width[i] = rightSmaller[i] - leftSmaller[i] - 1;
        int maxArea = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
            maxArea = Math.max(maxArea, arr[i] * width[i]);
        return maxArea;
    }
}

//Driver code

class MaxRect 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int[][] a = new int[1000][1000];
            for (int i = 0; i < m; i++)
                for (int j = 0; j < n; j++) 
                    a[i][j] = sc.nextInt();
            GfG g = new GfG();
	    System.out.println(g.maxArea(a, m, n));
        }
    }
}
