import java.util.*;
import java.lang.*;
import java.io.*;

class DetectCycle
{
    static boolean isCyclic(ArrayList<ArrayList<Integer>> adj, int v)
    {
        boolean[] isVisited = new boolean[v];
        Arrays.fill(isVisited, false);
        boolean flag = false;
        for(int i=0;i<v;i++){
            isVisited[i] = true;
            ArrayList<Integer> currList = adj.get(i);
            for(int j=0;j<currList.size();j++){
                flag = isCyclicUtil(adj, isVisited, currList.get(j));
                if(flag == true)
                    return true;
            }
            isVisited[i] = false;
        }
        return false;
    }
    
    static boolean isCyclicUtil(ArrayList<ArrayList<Integer>> adj, boolean[] isVisited, int curr){
        if(isVisited[curr] == true)
            return true;
        isVisited[curr] = true;
        boolean flag = false;
        ArrayList<Integer> currList = adj.get(curr);
        for(int i=0;i<currList.size();i++){
            flag = isCyclicUtil(adj, isVisited, currList.get(i));
            if(flag == true)
                return true;
        }
        isVisited[curr] = false;
        return false;
    }
}

class DriverClass
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();    
        while(t-->0){
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int nov = sc.nextInt();
            int edg = sc.nextInt();
            for(int i = 0; i < nov+1; i++)
                list.add(i, new ArrayList<Integer>());
            for(int i = 1; i <= edg; i++){
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            if(new DetectCycle().isCyclic(list, nov) == true)
                System.out.println("1");
            else System.out.println("0");
        }
    }
}