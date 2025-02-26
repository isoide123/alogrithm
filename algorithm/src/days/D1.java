package days;

import java.util.*;

public class D1 {
	public int lengthOfLongestSubstring(String s) {
        //��������
        char[] ss = s.toCharArray();
        Set<Character> set = new HashSet<>();//ȥ��
        int res = 0;//���
        for(int left = 0, right = 0; right < s.length(); right++) {//ÿһ���Ҷ˵㶼��һ����
            char ch = ss[right];//rightָ���Ԫ�أ�Ҳ�ǵ�ǰҪ���ǵ�Ԫ��
            while(set.contains(ch)) {//set����ch����������߽磬ͬʱ��set���ϳ�Ԫ��
                set.remove(ss[left]);
                left++;
            }
            set.add(ss[right]);//����������ǰԪ�ؼ��롣
            res = Math.max(res, right - left + 1);//���㵱ǰ���ظ��Ӵ��ĳ��ȡ�
        }
        return res;
    }
}
