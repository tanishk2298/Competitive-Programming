Problem Link = [ https://practice.geeksforgeeks.org/problems/the-celebrity-problem/1 ]
Companies = [ Amazon Fab.com Flipkart Google Microsoft One97 United Health Group Zoho ]

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution 
{ 
    public static int celebrity(int mat[][], int n){
    	Stack<Integer> stk = new Stack<>();
    	for(int i=0;i<n;i++)
    	    stk.push(i);
    	while(stk.size() >= 2){
    	    int x = stk.pop();
    	    int y = stk.pop();
    	    if(mat[x][y] == 1)
    	        stk.push(y);
    	    else
    	        stk.push(x);
    	}
    	int isCeleb = stk.pop();
    	for(int i=0;i<n;i++){
    	    if(i != isCeleb){
    	        if(mat[i][isCeleb] == 0 || mat[isCeleb][i] == 1)
    	            return -1;
    	    }
    	}
    	return isCeleb;
    }
}

//Driver code

class GFG
{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int N = sc.nextInt();
            int M[][] = new int[N][N];
                for(int j=0; j<N; j++)
                    M[i][j] = sc.nextInt();
            System.out.println(new Solution().celebrity(M,N));
        }
    } 
}