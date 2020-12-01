Problem Link -
https://codeforces.com/problemset/problem/4/C


import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        HashMap<String, Integer> db = new HashMap<>();
        while(tc-->0){
            String str = sc.next();
            if(!db.containsKey(str))
                db.put(str,0);
            else
                db.put(str,db.get(str)+1);
            int ans = db.get(str);
            if(ans == 0)
                System.out.println("OK");
            else
                System.out.println(str+""+db.get(str));
        }
    }
}


