package �ַ�������;

import java.util.Arrays;

public class ���ظ��ַ�����Ӵ� {
	public int lengthOfLongestSubstring(String s) {
        int[] index=new int[128];
        Arrays.fill(index,-1);
        int cur=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            if(index[s.charAt(i)]==-1||i-index[s.charAt(i)]>cur){
                cur++;
            }else{
                max=Math.max(cur,max);
                cur=i-index[s.charAt(i)];
            }
            index[s.charAt(i)]=i;
        }
        max=Math.max(cur,max);
        return max;
    }
}
