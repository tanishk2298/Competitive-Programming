import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args){
	    Scanner sc = new Scanner(System.in);
	    int tc = sc.nextInt();
	    while(tc-->0){
	        int n = sc.nextInt();
	        int m = sc.nextInt();
	        int[][] mat = new int[n][m];
	        for(int i=0;i<n;i++)
	            for(int j=0;j<m;j++)
	                mat[i][j] = sc.nextInt();
	        int x = sc.nextInt();
	        int y = sc.nextInt();
	        int k = sc.nextInt();
	        for(int i=0;i<n;i++)
	            for(int j=0;j<m;j++)
	                if(i == x && j == y)
	                    floodFill(mat,k,mat[i][j],i,j,n,m);
	        for(int i=0;i<n;i++)
	            for(int j=0;j<m;j++)
	                System.out.print(mat[i][j]+" ");
	        System.out.println("");
	    }
	}
	public static void floodFill(int[][] mat, int color, int currentColor, int i, int j, int n, int m){
	    if(i<0 || i>=n || j<0 || j>=m || mat[i][j] != currentColor)
	        return;
	    mat[i][j] = color;
	    floodFill(mat,color,currentColor,i-1,j,n,m);
	    floodFill(mat,color,currentColor,i,j+1,n,m);
	    floodFill(mat,color,currentColor,i+1,j,n,m);
	    floodFill(mat,color,currentColor,i,j-1,n,m);
	}
}