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
	            String curr = sc.next();
	            for(int j=0;j<m;j++){
	                mat[i][j] = curr.charAt(j);   
	            }
	        }
	        int count = 0;
	        for(int i=0;i<n;i++){
	            for(int j=0;j<m;j++){
	                if(mat[i][j] == 'X'){
	                    floodFill(mat,i,j,n,m);
	                    count++;
	                }
	            }
	        }
	        System.out.println(count);
	    }
	}
	public static void floodFill(char[][] mat, int i, int j, int n,int m){
	    if(i<0 || i>=n || j<0 || j>=m || mat[i][j] == 'O')
	        return;
	    mat[i][j] = 'O';
	    floodFill(mat,i-1,j,n,m);
	    floodFill(mat,i,j+1,n,m);
	    floodFill(mat,i+1,j,n,m);
	    floodFill(mat,i,j-1,n,m);
	} 
}