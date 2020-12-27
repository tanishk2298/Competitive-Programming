import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            long sum = 0;
            for(int i=0;i<n;i++)
                sum += sc.nextLong();
            if(sum % k == 0)
                System.out.println(0);
            else
                System.out.println(1);
        }
    }
}
