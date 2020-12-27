import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            long n = sc.nextLong();
            String str = sc.next();
            char[] arr = str.toCharArray();
            long present = 0;
            long abs = 120-n;
            for(int i=0;i<(int)n;i++){
                long curr = Character.getNumericValue(arr[i]);
                if(curr == 1)
                    present++;
            }
            present += abs;
            if(present>=(90))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
