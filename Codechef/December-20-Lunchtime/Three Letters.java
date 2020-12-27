import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            String str = sc.next();
            HashMap<Character, Integer> map = new HashMap<>();
            for(int i=0;i<str.length();i++){
                char curr = str.charAt(i);
                if(map.containsKey(curr))
                    map.put(curr, map.get(curr)+1);
                else
                    map.put(curr, 1);
            }
            long sum1 = 0;
            long sum2 = 0;
            for(Map.Entry mp : map.entrySet()){
                int val = (int)mp.getValue();
                sum1 += (val/2);
                sum2 += val;
            }
            System.out.println(Math.min(sum1, sum2/3));
        }
    }
}
