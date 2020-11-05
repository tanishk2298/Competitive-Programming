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
            int[][] graph = new int[n][n];
            int[] odd = new int[n];
            int count = 0;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    graph[i][j] = sc.nextInt();
                    if(graph[i][j] == 1)
                        odd[i]++;
                }
                if(odd[i]%2 != 0)
                    count++;
            }
            if(count == 2)
                System.out.println(1);
            else
                System.out.println(0);
	    }
	}
}