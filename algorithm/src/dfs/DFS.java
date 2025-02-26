package dfs;

import java.util.Scanner;
//ע��ans����Ҫ����ÿ�ν�ans��ֵΪ0�����ھ�̬�����ᵼ�·������ۼ�

public class DFS {
	public static int n;
    public static int ans;
    public static int[] s;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //�ڴ��������Ĵ���...
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

    //Ѫ���ǵݹ黮�ֵ�Ҫ�㣬���Ը���Ѫ�����ݹ�
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
