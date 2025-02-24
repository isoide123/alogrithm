package suanfa;

/**
 * 二进制位运算
 * @author AA
 *
 */

class Solution {
	public static void main(String[] args) {
		findPeakElement(new int[] {1,2,3,1});
	}
    public static int findPeakElement(int[] arr) {
        int n = arr.length;
		//数组长度是1，直接就是0索引位置
		if(arr.length == 1) return 0;
		//数组长度>=2的时候，首先比较0位置和n-1位置
		if(arr[0] > arr[1]) return 0;
		if(arr[n-1] > arr[n-2]) return n-1;

		//说明肯定有至少一个峰值点，但是不在0，n-1的位置
		//看中点,ans表示峰值点的位置，初始化成啥都可以的
		int l = 1,r = n-2,m = 0,ans = -1;
		while(l<=r) {
			  m = l + (r-l)/2;
			 //arr[m] > arr[m - 1] 说明在右边肯定有峰值点，在右边搜索
			 if(arr[m+1] > arr[m]) {
				 l = m+1 ;
				 // arr[m - 1] < arr[m] < arr[m-1] 不可能成立哈
			 }
			if(arr[m] < arr[m - 1]) {
				 r = m - 1;
			 }
			 else {
				 ans = m;
                 break; 
			 }
		}
        return ans;
    }
}
