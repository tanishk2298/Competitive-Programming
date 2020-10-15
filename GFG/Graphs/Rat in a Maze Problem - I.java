import java.util.*;
import java.lang.*;
import java.io.*;

class GfG {
    public static ArrayList<String> printPath(int[][] m, int n) {
        ArrayList<String> ans = new ArrayList<>();
        String str = "";
        floodFill(m,n,0,0,str,ans);
        return ans;
    }
    public static void floodFill(int[][] m, int n, int i, int j, String str,ArrayList<String> ans){
        if(i<0 || i>=n || j<0 || j>=n || m[i][j] == 0)
            return;
        if(i == n-1 && j== n-1){
            ans.add(str);
            return;
        }
        m[i][j] = 0;
        floodFill(m,n,i+1,j,str+"D",ans);
        floodFill(m,n,i,j-1,str+"L",ans);
        floodFill(m,n,i,j+1,str+"R",ans);
        floodFill(m,n,i-1,j,str+"U",ans);
        m[i][j] = 1;
    }
}

class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    a[i][j] = sc.nextInt();
            GfG g = new GfG();
            ArrayList<String> res = g.printPath(a, n);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else
                System.out.println(-1);
        }
    }
}