import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            char[] a = sc.next().toCharArray();
            char[] b = sc.next().toCharArray();
            for(int i=0;i<n-1;i++){
                if(a[i] == '1' && b[i] == '0'){
                    for(int j=(i+1);j<n;j++){
                        if(a[j] == '0' && b[j] == '1'){
                            a[i] = '0';
                            a[j] = '1';
                            break;
                        }
                    }
                }
            }
            boolean flag = Arrays.equals(a,b);
            if(flag)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
