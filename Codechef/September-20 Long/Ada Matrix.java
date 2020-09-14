
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc-->0){
		    int n = sc.nextInt();
		    int[][] mat = new int[n][n];
		    for(int i=0;i<n;i++)
		        for(int j=0;j<n;j++)
		            mat[i][j] = sc.nextInt();
		    int count = 0;
		    for(int i=n-1;i>0;i--){
		        if(mat[0][i] != (i+1)){
		            getTranspose(i+1,mat);
		            count++;
		            i = n-1;
		        }
		    }
		    System.out.println(count);
		}
	}
	public static void getTranspose(int lim, int[][] mat){
	    for (int i = 0; i < lim; i++){
            	for (int j = i+1; j < lim; j++){ 
                 	int temp = mat[i][j]; 
                 	mat[i][j] = mat[j][i]; 
                 	mat[j][i] = temp; 
            	} 
	    }
	}
}
