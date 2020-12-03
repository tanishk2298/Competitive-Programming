Problem Link -
https://www.spoj.com/problems/CSUMQ/


import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int q = sc.nextInt();
        while(q-->0){
            int low = sc.nextInt();
            int high = sc.nextInt();
            int sum = 0;
            for(int i=low; i<=high;i++)
                sum += arr[i];
            System.out.println(sum);
        }
    }
}	

