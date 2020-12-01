Problem Link -
https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/maximum-occurrence-9/description/


import java.util.*;
public class TestClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        int[] a = new int[arr.length];
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int curr = (int)(arr[i]);
            max = Math.max(curr, max);
            a[i] = curr;            
        }
        int[] hash = new int[max+1];
        for(int i=0;i<a.length;i++)
            hash[a[i]]++;
        char ch = ' ';
        int pos = 0;
        for(int i=0;i<hash.length;i++){
            if(hash[i] > pos){
                ch = (char)i;
                pos = hash[i];
            }
        }
        System.out.println(ch+" "+pos); 
    }
}

