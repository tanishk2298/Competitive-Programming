import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            String rCard = sc.next();
            String bCard = sc.next();
            long rd,bl;
            rd=bl=0;
            for(int i=0;i<n;i++){
                long a = Character.getNumericValue(rCard.charAt(i));
                long b =Character.getNumericValue(bCard.charAt(i));
                if(a>b)
                    rd++;
                else if(a<b)
                    bl++;
            }
            if(rd>bl)
                System.out.println("RED");
            else if(bl>rd)
                System.out.println("BLUE");
            else if(rd==bl)
                System.out.println("EQUAL");
        }
    }
}
