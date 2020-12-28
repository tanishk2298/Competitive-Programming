import java.util.*;

public class MyClass 
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long tc = sc.nextLong();
        while(tc-->0){
            long n = sc.nextLong();
            if(n<10)
                System.out.println(n);
            else if(n>45)
                System.out.println(-1);
            else{
                long x = 9;
                long sum = n;
                StringBuffer ans = new StringBuffer();
                while(x>0){
                    if((sum-x)>=0){
                        sum -= x;
                        ans.append(x);
                    }
                    x--;
                }
                System.out.println(ans.reverse());
            }
        }
    }
}
