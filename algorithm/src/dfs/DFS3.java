package dfs;

import java.util.Scanner;

public class DFS3 {
	public static int[] arr;
	  public static boolean[] st;
	  public static int n;
	  public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	     //�ڴ��������Ĵ���...
	    n = scan.nextInt();
	    arr = new int[n+2];
	    for(int i =1 ;i<=n;i++){
	      arr[i] = i;
	    }
	    st = new boolean[n+2];
	    dfs(1);
	    scan.close();
	  }
	  
	  public static void dfs(int x){
	    if(x > n) {
	      for(int i = 1;i<=n;i++){
	        if(st[i]){
	          System.out.printf(arr[i]+" ");
	        }
	      }
	      System.out.println();
	      return;
	    }
	    //��ѡ���������δѡ��״̬�����Բ��û���
	    dfs(x+1);

	    //ѡ
	    st[x] = true;
	    dfs(x+1);
	    //ѡ�˹���Ҫ����
	    st[x] = false;

	  }
}
