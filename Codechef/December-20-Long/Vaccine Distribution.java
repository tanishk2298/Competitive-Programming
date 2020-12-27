import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc= new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            int d = sc.nextInt();
            long[] arr = new long[n];
            long risky = 0;
            long fine = 0;
            for(int i=0;i<n;i++){
                arr[i] = sc.nextLong();
                if(arr[i] >= 80 || arr[i] <= 9)
                    risky++;
                else
                    fine++;
            }
            int days = 0;
            if(d == 1)
                System.out.println(n);
            else{
                if((risky%d) == 0){
                    days += risky/d;
                    risky = 0;
                }
                else
                    days += (risky/d)+1;    
                if((fine%d) == 0){
                    days += fine/d;
                    fine = 0;
                }
                else
                    days += (fine/d)+1;
                System.out.println(days);
            }
        }
    }
}
