import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {   
        public static boolean flag = false;
	public static void main (String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int tc = sc.nextInt();
	    while(tc-->0){
	        int n = sc.nextInt();
	        int[][] mat = new int[n][n];
	        int sX = 0, sY = 0, tX = 0, tY = 0;
	        for(int i=0;i<n;i++){
	            for(int j=0;j<n;j++){
	                mat[i][j] = sc.nextInt();
	                if(mat[i][j] == 1){
	                    sX = i;
	                    sY = j;
	                }
	                if(mat[i][j] == 2){
	                    tX = i;
	                    tY = j;
	                }
	            }
	        }
	        flag = false;
	        findPath(mat,n,sX,sY);
	        if(flag)
	            System.out.println(1);
	        else
	            System.out.println(0);
	    }
	}
	public static void findPath(int[][] mat, int n, int i , int j){
	    if(i<0 || i>=n || j<0 || j>=n || mat[i][j] == 0)
	        return;
   	    if(mat[i][j] == 2){
   	        flag = true;
   	        return;
   	    }
   	    mat[i][j] = 0;
   	    findPath(mat,n,i-1,j);
   	    findPath(mat,n,i,j+1);
   	    findPath(mat,n,i+1,j);
   	    findPath(mat,n,i,j-1);
	}
}