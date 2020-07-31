/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try{
		    Scanner sc = new Scanner(System.in);
		    int cases = sc.nextInt();
		    while(cases-->0){
		        int K = sc.nextInt()-1;
		        char[][] board = new char[8][8];
		        board[0][0] = 'O';
		        for(int i=0;i<board.length;i++){
		            for(int j=0;j<board.length;j++){
		                if(i==0&&j==0)
		                    continue;
		                if(K-->0)
		                    board[i][j] = '.';
		                else    
		                    board[i][j] = 'X';
		            }
		        }
		        for(int i=0;i<board.length;i++){
		            for(int j=0;j<board.length;j++)
		                System.out.print(board[i][j]);
		            System.out.println();      
		        }
		        System.out.println();
		    }
		}catch(Exception e){
		    return;
		}
	}
}
