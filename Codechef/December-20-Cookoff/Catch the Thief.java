import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int k = sc.nextInt();
            int n = sc.nextInt();
            int low = Math.min(x,y);
            int high = Math.max(x,y);
            boolean flag = false;
            while(low <= high){
                if(low == high){
                    flag = true;
                    break;
                }
                else{
                    low += k;
                    high -= k;
                }
            }
            if(flag)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
