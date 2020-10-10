import java.util.*;
import java.lang.*;
import java.io.*;

class Traversal
{
    static ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> g, int n)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] isVisited = new boolean[n];
        Arrays.fill(isVisited, false);
        dfsTraversal(0, g, isVisited, ans);
        return ans;
    }
    static void dfsTraversal(int start, ArrayList<ArrayList<Integer>> g, boolean[] isVisited, ArrayList<Integer> ans){
        isVisited[start] = true;
        ans.add(start);
        ArrayList<Integer> temp = g.get(start);
        for(int i=0;i<temp.size();i++){
            if(isVisited[temp.get(i)] == false)
                dfsTraversal(temp.get(i), g, isVisited, ans);
        }
    }
}

class Driverclass
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t-- > 0){
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int nov = sc.nextInt();
            int edg  =sc.nextInt();
            for(int i = 0; i < nov; i++)
                list.add(i, new ArrayList<Integer>());              
            for(int i = 1; i <= edg; i++){
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
                list.get(v).add(u);
            }          
            ArrayList<Integer> res = new Traversal().dfs(list, nov);
            for (int i = 0; i < res.size (); i++) 
                System.out.print (res.get(i) + " ");
            System.out.println();
        }
    }
}