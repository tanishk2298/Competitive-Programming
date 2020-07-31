/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases-->0){
		    int row = sc.nextInt();
		    int col = sc.nextInt();
		    int[][] mat = new int[row][col];
		    for(int i=0;i<row;i++)
		        for(int j=0;j<col;j++)
		            mat[i][j] = sc.nextInt();
		    int key = sc.nextInt();
            int ans = getAns(mat,row,col,key);
            System.out.println(ans);
		}
	}
	public static int getAns(int[][] mat,int row, int col, int key){
	    int i = 0;
	    int j = col - 1;
	    while((i>=0 && i<row) && (j>=0 && j<col)){
	        if(mat[i][j]==key)
	            return 1;
	        else if(mat[i][j]>key)
	            j--;
	        else
	            i++;
	    }
	    return 0;
	}
}