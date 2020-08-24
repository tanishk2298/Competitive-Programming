/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        sc.nextLine();
        while(cases-->0){
            String str = sc.nextLine();
            String ptrn = sc.nextLine();
            String ans = "";
            ArrayList<Character> strArr = new ArrayList<>();
            int[] freq = new int[26];
            for(int i=0;i<str.length();i++)
                strArr.add(str.charAt(i));
            for(int i=0;i<ptrn.length();i++){
                char curr = ptrn.charAt(i);
                strArr.remove(strArr.indexOf(curr));
            }
            for(int i=0;i<strArr.size();i++)
                freq[strArr.get(i)-97]++;
            String xyz = "";
            for(int i=0;i<26;i++){
                char curr = (char)(i+97);
                if(freq[i]>0){
                    if(curr < ptrn.charAt(0)){
                        int cnt = freq[i];
                        ans += mul(curr,cnt);
                        freq[i] = 0;
                    }
                    else if(curr == ptrn.charAt(0)){
                        int cnt = freq[i];
                        xyz += mul(curr,cnt);
                        freq[i] = 0;
                    }
                }
            }
            if(((xyz+ptrn).compareTo(ptrn+xyz)) > 0)
                ans += (ptrn+xyz);
            else
                ans += (xyz+ptrn);
            for(int i=0;i<26;i++){
                if(freq[i]>0){
                    char curr = (char)(i+97); 
                    int cnt = freq[i];
                    ans += mul(curr,cnt);
                }
            }
            System.out.println(ans);       
        }
    }
    public static String mul(char curr, int cnt){
        String ans = "";
        for(int i=0;i<cnt;i++)
            ans += curr;
        return ans;
    }
}
