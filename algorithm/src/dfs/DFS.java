package dfs;

import java.util.Scanner;
//注意ans：不要忘了每次将ans赋值为0，否在静态变量会导致方案数累加

public class DFS {
	public static int n;
    public static int ans;
    public static int[] s;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int t = scan.nextInt();
        while(t-->0){
          n = scan.nextInt();
          s = new int[n+2];
          ans = 0;
          for(int i = 1;i<=n;i++){
              s[i] = scan.nextInt();
          }
          dfs(5);
          System.out.println(ans);
        }
    }

    //血量是递归划分的要点，所以根据血量来递归
    public static void dfs(int x){
        int cnt = 0;
      
        for(int i =1;i<=n;i++){
          if(s[i]<=0) cnt++;
        }
        if(cnt == n) ans++;
        if(x<1) return;

        for(int i=1;i<=n;i++){
          if(s[i] > 0){
            s[i] -= x;
            dfs(x-1);

            s[i] += x;
          }

        }
    }
}
