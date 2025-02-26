package dfs;

import java.util.Scanner;

public class DFS1 {
	  public static int[] arr;
	  public static boolean[] st;
	  public static int n;

	  public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	    n =sc.nextInt();
	    arr = new int[n+2];
	    st = new boolean[n+2];
	    dfs(1);
	  }

	  public static void dfs(int x){
	    if(x > n){
	      for(int j = 1;j<=n;j++){
	        System.out.printf(arr[j]+" ");
	      }
	      System.out.println();
	      return;
	    }
	    for(int i =1;i<=n;i++){
	      if(!st[i]){//�ж�����i�Ƿ�ʹ��
	        st[i] = true;
	        arr[x] = i;//δ��ʹ�ã�������i����xλ��
	        dfs(x+1);

	        st[i] = false;
	        arr[x] = 0;
	      }
	    }
	  }
}
