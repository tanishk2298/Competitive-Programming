import java.util.*;
import java.lang.*;
import java.io.*;

class Islands {
    static int findIslands(ArrayList<ArrayList<Integer>> a, int n, int m) {
        int[][] mat = new int[n][m];
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                mat[i][j] = a.get(i).get(j);
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j] == 1){
                    totalIsland(mat,n,m,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    static void totalIsland(int[][] mat, int n, int m, int i, int j){
        if(i<0 || i>=n || j<0 || j>=m || mat[i][j] != 1)
            return;
        mat[i][j] = -1;
        totalIsland(mat,n,m,i-1,j);
        totalIsland(mat,n,m,i-1,j+1);
        totalIsland(mat,n,m,i,j+1);
        totalIsland(mat,n,m,i+1,j+1);
        totalIsland(mat,n,m,i+1,j);
        totalIsland(mat,n,m,i+1,j-1);
        totalIsland(mat,n,m,i,j-1);
        totalIsland(mat,n,m,i-1,j-1);
    }
}

class Driverclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            ArrayList<ArrayList<Integer>> list = new ArrayList<>(N);
            for (int i = 0; i < N; i++) {
                ArrayList<Integer> temp = new ArrayList<>(M);
                list.add(i, temp);
            }
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    int val = sc.nextInt();
                    list.get(i).add(j, val);
                }
            }
            System.out.println(new Islands().findIslands(list, N, M));
        }
    }
}