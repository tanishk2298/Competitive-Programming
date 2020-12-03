Problem Link -
https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=1474


import java.util.*;

public class MyClass {
    public static boolean[] primes = new boolean[1000001];
    public static void main(String args[]) {
        sieve(1000000);
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int low = sc.nextInt();
            int high = sc.nextInt();
            int count = 0;
            for(int i=low;i<=high;i++)
                if(primes[i] && isDigitPrime(i))
                    count++;
            System.out.println(count);
        }
    }
    public static void sieve(int n){
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;
        for(int i=2;i<=n;i++)
            if(primes[i])
                for(int j=(i*2);j<=n;j+=i)
                    primes[j] = false;
    }
    public static boolean isDigitPrime(int n){
        int sum = 0;
        while(n != 0){
            sum += n%10;
            n /= 10;
        }
        return primes[sum];
    }
}	

