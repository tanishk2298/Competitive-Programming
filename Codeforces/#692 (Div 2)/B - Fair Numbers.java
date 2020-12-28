import java.util.*;

public class MyClass 
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            long n = sc.nextLong();
            long start = n;
            long end = n*2;
            long ans = div(start,end); 
            System.out.println(ans);
        }
    }

    public static long div(long str, long end){
        boolean flag = false;
        for(long i=str;i<=end;i++){
            long num = i;
            while(num>0){
                long digit=num%10;
                if(digit>0){
                    if(i%digit==0){
                        flag=true;
                    }
                    else{
                        flag=false;
                        break;
                    }
                }
                num=num/10;                
            }
            if(flag == true)
                return i;
        }
        return 0;
    }
}