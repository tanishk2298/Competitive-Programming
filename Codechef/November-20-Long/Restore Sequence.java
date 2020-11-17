import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static ArrayList<Integer> primes = new ArrayList<>();
    public static boolean[] p = new boolean[4000002];
    public static void main(String[] args){
        sieve(4000001);
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            int[] brr = new int[n];
            for(int i=0;i<n;i++)
                brr[i] = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
                arr[i] = primes.get(i);
            for(int i=0;i<n;i++)
                arr[i] = Math.max(arr[i], arr[brr[i]-1]);
            for(int i=0;i<n;i++)
                System.out.print(arr[i]+" ");
            System.out.println("");
        }
    }
    public static void sieve(long n){
        Arrays.fill(p, true);
        p[0] = false;
        p[1] = false;
        for(int i=2;i<=n;i++){
            if(p[i] == true){
                primes.add(i);
                for(int j=(i*2);j<=n;j+=i)
                    p[j] = false;
            }
        }
    }
}