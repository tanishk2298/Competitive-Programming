//Problem Link https://www.codechef.com/JAN21B/problems/ANTSCHEF

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            long lines = sc.nextLong();
            ArrayList<ArrayList<Long>> ants = new ArrayList<>();
            HashMap<Long, Long> map = new HashMap<>();
            long ans = 0;
            for(int i=0;i<lines;i++){
                long currTotal = sc.nextLong();
                ArrayList<Long> temp = new ArrayList<>();
                while(currTotal-->0){
                    long curr = sc.nextLong();
                    if(map.containsKey(Math.abs(curr)))
                        map.put(Math.abs(curr), map.get(Math.abs(curr)) + 1);
                    else
                        map.put(Math.abs(curr), (long)1);
                    if(map.get(Math.abs(curr)) == 2)
                        ans++;
                    temp.add(curr);
                }
                Collections.sort(temp);
                ants.add(temp);
            }
            for(int i=0;i<lines;i++){
                ArrayList<Long> ant = ants.get(i);
                for(int j=0;j<ant.size();j++){
                    long curr = ant.get(j);
                    if(map.containsKey(Math.abs(curr)) && map.get(Math.abs(curr)) > 1){
                        if(curr > 0)
                            ans += ant.size() - (j+1);
                        else
                            ans += j;
                    }
                    else{
                        if(curr > 0)
                            ans += bound(ant, curr * -1, "lower"); 
                        else
                            ans += ant.size() - (bound(ant, curr * -1, "upper"));
                    }
                }
            }
            System.out.println(ans);
        }
    }
    public static long bound(ArrayList<Long> arr, long k, String ch){
        int low = 0;
        int high = arr.size();
        while (low < high){
            int mid = low + high >> 1;
            boolean cond = (ch == "lower") ? (arr.get(mid) < k) : (arr.get(mid) <= k);
            if(cond)
                low = mid + 1;
            else
                high = mid;
        }
        return low;
    }
}
