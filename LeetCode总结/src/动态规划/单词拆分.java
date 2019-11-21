package ��̬�滮;

import java.util.List;

public class ���ʲ�� {
	/*����һ���ǿ��ַ��� s ��һ�������ǿյ����б���ֵ� wordDict���ж� s �Ƿ���Ա��ո���Ϊһ���������ֵ��г��ֵĵ��ʡ�

	˵����

	���ʱ�����ظ�ʹ���ֵ��еĵ��ʡ�
	����Լ����ֵ���û���ظ��ĵ��ʡ�
	ʾ�� 1��

	����: s = "leetcode", wordDict = ["leet", "code"]
	���: true
	����: ���� true ��Ϊ "leetcode" ���Ա���ֳ� "leet code"*/
	public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
      // memo[i] ��ʾ s ���� i - 1 ��β���ַ����Ƿ�ɱ� wordDict ���
      boolean[] memo = new boolean[n + 1];
      memo[0] = true;
      for (int i = 1; i <= n; i++) {
          for (int j = 0; j < i; j++) {
              if (memo[j] && wordDict.contains(s.substring(j, i))) {
                  memo[i] = true;
                  break;
              }
          }
      }
      return memo[n];
}
}
