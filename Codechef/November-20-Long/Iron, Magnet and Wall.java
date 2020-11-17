import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef{

	public static void main (String[] args) throws java.lang.Exception{
        	Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc-->0){
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    String str = sc.next();
		    int count = 0;
		    int ir = 0, mg = 0;
		    while(ir<n && mg<n){
		        char currI = str.charAt(ir);
		        char currM = str.charAt(mg);
		        if(currI == 'X'){
		            mg = ir;
		            ir++;
		            mg++;
		        }
		        else if(currI == 'M'){
		            if(currM == 'X'){
		                ir = mg;
		                ir++;
		                mg++;
		            }
		            else if(currM == 'I'){
		                int sheets = 0;
		                int low = Math.min(ir,mg);
		                int high = Math.max(ir,mg);
		                for(int i=low;i<high;i++)
		                    if(str.charAt(i) == ':')
		                        sheets++;
		                int pow = k + 1 - Math.abs(ir-mg) - sheets;
		                if(pow > 0){
		                    ir++;
		                    mg++;
		                    count++;
		                }
		                else if(mg > ir)
		                    ir++;
		                else
		                    mg++;
		            }
		            else
		                mg++;
		        }
		        else
		            ir++;    
		    }
		    System.out.println(count);
		}
	}
}
