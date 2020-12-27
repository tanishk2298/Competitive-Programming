import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc= new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long a1 = 0;
            long b1 = 0;
            long a2 = 0;
            long b2 = 0;
            if((a%2) == 0){
                a1 = a/2;
                a2 = a/2;
            }
            else{
                a1 = (a/2)+1;
                a2 = a/2;
            }
            if((b%2) == 0){
                b1 = b/2;
                b2 = b/2;
            }
            else{
                b1 = (b/2)+1;
                b2 = b/2;
            }
            System.out.println((a1*b1)+(a2*b2));
        }
    }
}
