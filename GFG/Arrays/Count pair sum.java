import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        while(cases-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int m = sc.nextInt();
            int[] brr = new int[m];
            for(int i=0;i<n;i++)
                arr[i] = sc.nextInt();
            for(int i=0;i<m;i++)
                brr[i] = sc.nextInt();
            int key = sc.nextInt();
            int min = 0, max = m-1, sum = 0, flag = 0;
            while((min<n && min>=0) && (max>=0 && max<m)){
                sum = arr[min] + brr[max];
                if(sum==key){
                    System.out.println("("+ arr[min]+","+brr[max]+")");
                    flag = 1;
                    min++;
                }
                else if(sum<key)
                    min++;
                else
                    max--;
            }
            if(flag==0)
                System.out.println("Not found");
        }
    }
}