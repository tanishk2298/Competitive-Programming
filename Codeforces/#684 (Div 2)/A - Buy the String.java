import java.util.*;

public class MyClass 
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            int c0 = sc.nextInt();
            int c1 = sc.nextInt();
            int h = sc.nextInt();
            String str = sc.next();
            int cnt0 = 0;
            int cnt1 = 0;
            for(int i=0;i<n;i++){
                char curr = str.charAt(i);
                if(curr == '0')
                    cnt0++;
                else
                    cnt1++;
            }
            int x1 = ((n*c1)+(cnt0*h));
            int x2 = ((n*c0)+(cnt1*h));
            int x3 = (cnt1 * c1) + (cnt0 * c0);
            System.out.println(Math.min(x1,Math.min(x2,x3)));
        }
    }
}