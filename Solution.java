package suanfa;

/**
 * ������λ����
 * @author AA
 *
 */

class Solution {
	public static void main(String[] args) {
		findPeakElement(new int[] {1,2,3,1});
	}
    public static int findPeakElement(int[] arr) {
        int n = arr.length;
		//���鳤����1��ֱ�Ӿ���0����λ��
		if(arr.length == 1) return 0;
		//���鳤��>=2��ʱ�����ȱȽ�0λ�ú�n-1λ��
		if(arr[0] > arr[1]) return 0;
		if(arr[n-1] > arr[n-2]) return n-1;

		//˵���϶�������һ����ֵ�㣬���ǲ���0��n-1��λ��
		//���е�,ans��ʾ��ֵ���λ�ã���ʼ����ɶ�����Ե�
		int l = 1,r = n-2,m = 0,ans = -1;
		while(l<=r) {
			  m = l + (r-l)/2;
			 //arr[m] > arr[m - 1] ˵�����ұ߿϶��з�ֵ�㣬���ұ�����
			 if(arr[m+1] > arr[m]) {
				 l = m+1 ;
				 // arr[m - 1] < arr[m] < arr[m-1] �����ܳ�����
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
