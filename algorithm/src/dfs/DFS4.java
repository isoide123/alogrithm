package dfs;
import java.util.Scanner;

//1.����λ��ѡ��λ�ü�¼Ϊ����x 
//2.�����ֵ��������������iһֱ����1 
//3.���ڱ��������һ��λ��ѡ�����+1��ʼ�����ñ���start,ÿ�θ���i+1,�ݹ���ã�
//����������������ݻ���һ���ڵ�
//4.������Ҫѡ�����ʱ����ӡ


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
        arr[x] = i; //iָ��ǰѡ�����
        dfs(x+1,i+1); //�ӵ�ǰѡ�����+1��ʼ
        arr[i] = 0;
      }
    }
}
