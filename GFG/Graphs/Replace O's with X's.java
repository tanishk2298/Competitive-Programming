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
	        char[][] mat = new char[n][m];
	        for(int i=0;i<n;i++){
	            for(int j=0;j<m;j++){
	                mat[i][j] = sc.next().charAt(0);
	                mat[i][j] = (mat[i][j] == 'O') ? '-' : mat[i][j];
	            }
	        }
	        for(int i=0;i<n;i++)
	            for(int j=0;j<m;j++)
	                if(i==0 || j==0 || i==(n-1) || j==(m-1))
	                    if(mat[i][j] == '-')
	                        floodFill(mat,i,j,n,m);
	        for(int i=0;i<n;i++)
	            for(int j=0;j<m;j++)
	                if(mat[i][j] == '-')
	                    mat[i][j] = 'X';
            for(int i=0;i<n;i++)
	            for(int j=0;j<m;j++)
	                System.out.print(mat[i][j]+" ");
	        System.out.println("");
	    }
	}
	public static void floodFill(char[][] mat, int i,int j, int n, int m){
	    if(i<0 || i>=n || j<0 || j>=m || mat[i][j] != '-')
	        return;
	    mat[i][j] = 'O';
	    floodFill(mat,i-1,j,n,m);
	    floodFill(mat,i,j+1,n,m);
	    floodFill(mat,i+1,j,n,m);
	    floodFill(mat,i,j-1,n,m);
	}
}