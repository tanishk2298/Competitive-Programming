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
            int k = sc.nextInt();
            long[] arr = new long[n+1];
            int pos = 0;
            boolean flag = true;
            for(int i=1;i<=n;i++){
                if(flag && (i%2) != 0){
                    arr[i] = i;
                    pos++;
                    if(pos == k)
                        flag = false;
                }
                else
                    arr[i] = (i*-1);
            }
            if(pos < k){
                pos = k - pos;
                int back = (n%2 == 0) ? (n) : (n-1);
                for(int i=back;i>0;i-=2){
                    if(pos-->0)
                        arr[i] *= -1;
                    else
                        break;
                }
            }
            StringBuilder ans = new StringBuilder();
            for(int i=1;i<=n;i++)
                ans.append(arr[i]+" ");
            System.out.println(ans);
        }
    }
}
