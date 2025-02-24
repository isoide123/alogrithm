package suanfa;

import java.util.Arrays;

public class BinarySearch {

	public static int binarySearch1(int target,int[] a) {
		Arrays.sort(a);
		int i =0,j = a.length-1;
		while(i<=j) {
			int m = (i+j) >>> 1;
			if(target < a[m]) { //目标在左边
				j = m-1;
			}else if(a[m] < target) {//目标在右边
				i = m+1;
			}else {
				return m;
			}
		}
		return -1;
	}
	
	/**
	 * Q1：为什么是i <= j而非i<j
	 *     因为i == j时还有数字要判断
	 *     
	 * Q2:(i+j)/2是否有问题
	 * 
	 * int i = 0;
	 * int j = Integer.MAX_VALUE-1;
	 * int m = (i+j)/2;   m = -5368790913这种负数
	 * 
	 * Q3:为什么都写成小于比较好
	 *    	可以看出i在左,j在右，数组升序，可以一眼看出目标在左边还是右边
	 */
	
	public static int binarySearch2(int target,int[] a) {
		Arrays.sort(a);
		int i =0,j = a.length; //j为边界
		while(1<j-i) { //循环为了缩小边界，j-i代表要查找元素个数
			int m = (i+j) >>> 1;
			if(target < a[m]) { 
				j = m;
			}else{  
				i = m; //进入i了表明，target要么在这里，要么在右边
			}
		}
		if(a[i]==target) {//在循环外找到目标元素
			return i;
		}else {
			return -1;
		}
	}
	
	/**
	 * 循环内平均比较次数减少了。
	 */
	
	
	/**  找5
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
			//没有找到，那么按照顺序插入进去
			int insertIndex = Math.abs(i);
			
			int b[] = new int[a.length+1];
			System.arraycopy(a, 0, b, 0, i);
			System.arraycopy(a, i, b, insertIndex+1, a.length-insertIndex);
			
		}
	}
}
