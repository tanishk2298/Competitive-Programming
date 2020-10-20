import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
        public static int count = 0;
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
	        int ans = 0;
	        for(int i=0;i<n;i++){
	            for(int j=0;j<m;j++){
	                if(mat[i][j] == 1){
	                    count = 0;
	                    floodFill(mat,n,m,i,j);
	                    ans = Math.max(count, ans);
	                }
	            }
	        }
	        System.out.println(ans);
	    }
	}
	public static void floodFill(int[][] mat, int n, int m, int i, int j){
	    if(i<0 || i>=n || j<0 || j>=m || mat[i][j] == 0)
	        return;
	    count += 1;
	    mat[i][j] = 0;
            floodFill(mat,n,m,i,j+1);
            floodFill(mat,n,m,i+1,j+1);
            floodFill(mat,n,m,i+1,j);
            floodFill(mat,n,m,i+1,j-1);
            floodFill(mat,n,m,i,j-1);
            floodFill(mat,n,m,i-1,j-1);
            floodFill(mat,n,m,i-1,j);
            floodFill(mat,n,m,i-1,j+1);
	}
}