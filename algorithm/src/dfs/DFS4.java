package dfs;
import java.util.Scanner;

//1.按照位置选择，位置记录为变量x 
//2.按照字典序输出，即遍历i一直递增1 
//3.由于遍历会从上一个位置选择的数+1开始，设置变量start,每次更改i+1,递归调用，
//深度优先搜索，回溯回上一个节点
//4.当超过要选择的数时，打印


public class DFS4 {
	public static int n,m;
    public static int[] arr;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        arr = new int[n+2];
        dfs(1,1);
        scan.close();
    }

    public static void dfs(int x,int start){
      if(x > m){
        for(int i = 1;i<=m;i++){
          System.out.printf(arr[i] + " ");
        }
        System.out.println();
        return;
      }
      for(int i =start;i<=n;i++){
        arr[x] = i; //i指当前选完的数
        dfs(x+1,i+1); //从当前选完的数+1开始
        arr[i] = 0;
      }
    }
}
