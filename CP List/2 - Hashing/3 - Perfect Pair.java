Problem Link -
https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/perfect-pair-df920e90/description/


import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
                arr[i] = sc.nextInt();
            int count = 0;
            int num = 0;
            double sq, cb = 0.0d;
            for(int i=0;i<(n-1);i++){
                for(int j=(i+1);j<n;j++){
                    num = arr[i] + arr[j];
                    sq = Math.sqrt(num);
                    cb = Math.cbrt(num); 
                    if(sq - (int)sq == 0 || cb - (int)cb == 0)
                        count++;
                }
            }
            System.out.println(count);
        }
    }
}



