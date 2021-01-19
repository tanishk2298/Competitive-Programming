//Problem Link https://www.codechef.com/JAN21B/problems/ORAND

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] nArr = new int[n];
            for(int i=0;i<n;i++)
                nArr[i] = sc.nextInt();
            int[] mArr = new int[m];
            for(int i=0;i<m;i++)
                mArr[i] = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(0));
            TreeSet<Integer> set = new TreeSet<Integer>();
            while(arr.size() != 0){
                int a = arr.get(arr.size() -1);
                arr.remove(arr.size() -1);
                getAndOr(a, n, nArr, set, arr, '|');
                getAndOr(a, m, mArr, set, arr, '&');
            }
            System.out.println(set.size());
        }
    }
    public static void getAndOr(int currA, int n, int[] arr, TreeSet<Integer> set, ArrayList<Integer> a, Character sign){
        for(int i=0;i<n;i++){
            int currB = arr[i];
            int temp = (sign == '|') ? (currA | currB) : (currA & currB);
            if(set.contains(temp))
                continue;
            else{
                a.add(temp);
                set.add(temp);
            }
        }
    }
}
