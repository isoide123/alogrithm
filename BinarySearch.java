package suanfa;

import java.util.Arrays;

public class BinarySearch {

	public static int binarySearch1(int target,int[] a) {
		Arrays.sort(a);
		int i =0,j = a.length-1;
		while(i<=j) {
			int m = (i+j) >>> 1;
			if(target < a[m]) { //Ŀ�������
				j = m-1;
			}else if(a[m] < target) {//Ŀ�����ұ�
				i = m+1;
			}else {
				return m;
			}
		}
		return -1;
	}
	
	/**
	 * Q1��Ϊʲô��i <= j����i<j
	 *     ��Ϊi == jʱ��������Ҫ�ж�
	 *     
	 * Q2:(i+j)/2�Ƿ�������
	 * 
	 * int i = 0;
	 * int j = Integer.MAX_VALUE-1;
	 * int m = (i+j)/2;   m = -5368790913���ָ���
	 * 
	 * Q3:Ϊʲô��д��С�ڱȽϺ�
	 *    	���Կ���i����,j���ң��������򣬿���һ�ۿ���Ŀ������߻����ұ�
	 */
	
	public static int binarySearch2(int target,int[] a) {
		Arrays.sort(a);
		int i =0,j = a.length; //jΪ�߽�
		while(1<j-i) { //ѭ��Ϊ����С�߽磬j-i����Ҫ����Ԫ�ظ���
			int m = (i+j) >>> 1;
			if(target < a[m]) { 
				j = m;
			}else{  
				i = m; //����i�˱�����targetҪô�����Ҫô���ұ�
			}
		}
		if(a[i]==target) {//��ѭ�����ҵ�Ŀ��Ԫ��
			return i;
		}else {
			return -1;
		}
	}
	
	/**
	 * ѭ����ƽ���Ƚϴ��������ˡ�
	 */
	
	
	/**  ��5
	 *    i
	 * [2 4 8] a
	 * [2 0 0 0] b
	 * [2 5 0 0] b
	 * [2 5 4 8] b
	 * @param a
	 * @param target
	 */
	public static void TestbinarySearch(int a[],int target) {
		int  i = Arrays.binarySearch(a, target);
		if(i < 0) {
			//û���ҵ�����ô����˳������ȥ
			int insertIndex = Math.abs(i);
			
			int b[] = new int[a.length+1];
			System.arraycopy(a, 0, b, 0, i);
			System.arraycopy(a, i, b, insertIndex+1, a.length-insertIndex);
			
		}
	}
}
