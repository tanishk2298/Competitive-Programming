import java.util.*;
import java.lang.*;
import java.io.*;

class Traversal {
    static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> g, int n) {
        boolean[] isVisited = new boolean[n];
        Arrays.fill(isVisited, false);
        ArrayList<Integer> ans = bfsTraversal(0, g, isVisited);
        return ans;
    }
    static ArrayList<Integer> bfsTraversal(int start, ArrayList<ArrayList<Integer>> g, boolean[] isVisited){
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> que = new LinkedList<>();
        que.add(start);
        isVisited[start] = true;
        while(!que.isEmpty()){
            int curr = que.poll();
            ans.add(curr);
            ArrayList<Integer> temp = g.get(curr);
            for(int i=0;i<temp.size();i++){
                if(isVisited[temp.get(i)] == false){
                    que.add(temp.get(i));
                    isVisited[temp.get(i)] = true;
                }
            }
        }
        return ans;
    }
}

class Driverclass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int nov = sc.nextInt();
            int edg = sc.nextInt();

            for (int i = 0; i < nov; i++) list.add(i, new ArrayList<Integer>());

            for (int i = 1; i <= edg; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            ArrayList<Integer>res = new Traversal().bfs(list,nov);
            for (int i =0 ;i < res.size (); i++) 
                System.out.print (res.get (i) + " ");
            System.out.println();
        }
    }
}