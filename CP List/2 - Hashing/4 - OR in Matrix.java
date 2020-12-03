Problem Link -
https://codeforces.com/problemset/problem/486/B


import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matA = new int[n][m];
        int[][] matB = new int[n][m];
        int[][] matC = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matA[i][j] = 1;
                matB[i][j] = sc.nextInt();
                matC[i][j] = 0;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matB[i][j] == 0){
                    for(int row=0;row<n;row++)
                        matA[row][j] = 0;
                    for(int col=0;col<m;col++)
                        matA[i][col] = 0;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matA[i][j] == 1){
                    for(int row=0;row<n;row++)
                        matC[row][j] = 1;
                    for(int col=0;col<m;col++)
                        matC[i][col] = 1;
                }
            }
        }
        boolean flag = false;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matB[i][j] != matC[i][j]){
                    flag = true;
                    System.out.println("NO");
                    break;
                }
            }
        }
        if(flag != true){
            System.out.println("YES");
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    System.out.print(matA[i][j]+" ");
                }
                System.out.println("");
            }
        }
    }
}	