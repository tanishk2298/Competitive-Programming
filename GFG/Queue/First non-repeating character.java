Problem Link = [ https://practice.geeksforgeeks.org/problems/first-non-repeating-character-in-a-stream/0 ] 
Comapnies = [ Adobe Amazon FactSet Flipkart Microsoft Payu Yahoo ] 


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            char[] arr = new char[n];
            for(int i=0;i<n;i++)
                arr[i] = sc.next().charAt(0);
            Queue<Character> que = new LinkedList<>();
            HashSet<Character> set = new HashSet<>();
            String ans = "";
            for(int i=0;i<n;i++){
                char curr = arr[i];
                if(!set.contains(curr)){
                    set.add(curr);
                    que.add(curr);
                    ans += que.peek()+" ";
                }
                else{
                    que.remove(curr);
                    if(que.isEmpty())
                        ans += "-1 ";
                    else
                        ans += que.peek()+" ";
                }
            }
            System.out.println(ans);
        }
    }
}