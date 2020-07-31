/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(br.readLine().trim());
		while(cases -->0){
		    String[] rc = br.readLine().trim().split(" ");
		    int row = Integer.parseInt(rc[0]);
		    int col = Integer.parseInt(rc[1]);
		    int[][] mat = new int[row][col];
			String ip[] = br.readLine().trim().split(" ");
			int x = 0;
		    for(int i=0;i<row;i++)
		        for(int j=0;j<col;j++)
		            mat[i][j] = Integer.parseInt(ip[x++]);
		    printSpiral(mat,row,col);
		}
	}
	public static void printSpiral(int[][] mat, int row, int col){
	    int top=0, down=row-1, left=0, right=col-1, dir=0;
	    while(top<=down && left<=right){
	        if(dir==0){
	            for(int i=left;i<=right;i++)
	                System.out.print(mat[top][i]+" ");
	            top++;
	            dir = 1;
	        }
	        else if(dir==1){
	            for(int i=top;i<=down;i++)
	                System.out.print(mat[i][right]+" ");
	            right--;
	            dir = 2;
	        }
	        else if(dir==2){
	            for(int i=right;i>=left;i--)
	                System.out.print(mat[down][i]+" ");
	            down--;
	            dir = 3;
	        }
	        else if(dir==3){
	            for(int i=down;i>=top;i--)
	                System.out.print(mat[i][left]+" ");
	            left++; 
	            dir = 0;
	        }
	    }
	    System.out.println("");
	}
}