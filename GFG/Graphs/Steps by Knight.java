import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
        public static int dx[] = { -2 , -1 , 1 , 2 , 2 , 1 , -1 , -2};
        public static int dy[] = { 1 , 2 , 2 , 1 , -1 , -2 , -2 , -1};
	public static void main (String[] args){
	    Scanner sc = new Scanner(System.in);
	    int tc = sc.nextInt();
	    while(tc-->0){
	        int n = sc.nextInt();
	        int[][] board = new int[n][n];
	        int[][] vis = new int[n][n];
	        int kX = sc.nextInt() -1;
	        int kY = sc.nextInt() -1;
	        int tX = sc.nextInt() -1;
	        int tY = sc.nextInt() -1;
                int ans = bfs(board,vis,kX,kY,n,tX,tY);
                System.out.println(ans);
	    }
	}
	public static int bfs(int[][] board, int[][] vis, int kX, int kY, int n, int tX, int tY){
	    Queue<String> que = new LinkedList<>();
	    board[kX][kY] = 0;
	    vis[kX][kY] = 1;
	    String node = kX+" "+kY;
	    que.add(node);
	    if(kX == tX && kY == tY)
	        return board[kX][kY];
	    while(!que.isEmpty()){
	        String[] xy = que.poll().split(" ");
	        int x = Integer.parseInt(xy[0]);
	        int y = Integer.parseInt(xy[1]);
	        for(int i=0;i<8;i++){
	            if(isValid(x+dx[i], y+dy[i], n, vis)){
	                int currX = x + dx[i];
	                int currY = y + dy[i];
	                board[currX][currY] = board[x][y] + 1;
	                vis[currX][currY] = 1;
	                node = currX+" "+currY;
	                que.add(node);
	                if(currX == tX && currY == tY)
	                    return board[currX][currY];
	            }    
	        } 
	    }
	    return -1;
	}
	public static boolean isValid(int x,int y,int n, int[][] vis){
	    if(x<0 || x>=n || y<0 || y>=n || vis[x][y] == 1)
	        return false;
	    return true;
	}
}