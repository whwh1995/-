import java.util.HashSet;
import java.util.List;

public class ���ʽ��� {
	/*�����������ʣ�beginWord �� endWord����һ���ֵ䣬�ҵ��� beginWord �� endWord �����ת�����еĳ��ȡ�ת������ѭ���¹���
	ÿ��ת��ֻ�ܸı�һ����ĸ��
	ת�������е��м䵥�ʱ������ֵ��еĵ���
	����:
	beginWord = "hit",
	endWord = "cog",
	wordList = ["hot","dot","dog","lot","log","cog"]
	
	���: 5
	
	����: һ�����ת�������� "hit" -> "hot" -> "dot" -> "dog" -> "cog",
     �������ĳ��� 5��
	*
	*
	*/
	class Solution {
	    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
	         if (wordList == null || wordList.size() == 0) 
	        	 return 0;
	        //hashset�ĺô���ȥ��Ҳ�����
	        //��ʼ��
	        HashSet<String> start = new HashSet<>();
	        //������
	        HashSet<String> end = new HashSet<>();
	        //�����ַ������ֵ�
	        HashSet<String> dic = new HashSet<>(wordList);
	        start.add(beginWord);
	        end.add(endWord);
	        if (!dic.contains(endWord)) 
	        	return 0;
	        //�����������һϵ���ж����������ʱ��������·��������С��2��������2��ʼ
	        return bfs(start, end, dic, 2);
	    }
	    
	    
	    public int bfs(HashSet<String> st, HashSet<String> ed, HashSet<String> dic, int l) {
	        //˫�˲��ҵ�ʱ������������һ�γ����ˡ����ѡ���Ҳ����˵���������ܹ����ϵ�·������ֱ�ӷ���0
	        if (st.size() == 0) return 0;
	        if (st.size() > ed.size()) {//˫�˲��ң�Ϊ���Ż�ʱ�䣬��Զ���ٵ�ȥ�Ҷ�ģ����翪ʼ��ʱ��������1000��������βֻ��3������϶��Ǵ��ٵ���һ�˿�ʼ�߱ȽϺ�
	            return bfs(ed, st, dic, l);
	        }
	        //BFS�ı����Ϊ����ʹ�ù��Ĳ��ظ�ʹ��
	        dic.removeAll(st);
	        //�ռ���һ���ٽ���
	        HashSet<String> next = new HashSet<>();
	        for (String s : st) {
	            char[] arr = s.toCharArray();
	            for (int i = 0; i < arr.length; i++) {
	                char tmp = arr[i];
	                //�仯
	                for (char c = 'a'; c <= 'z'; c++) {
	                    if (tmp == c) 
	                    	continue;
	                    arr[i] = c;
	                    String nstr = new String(arr);
	                    if (dic.contains(nstr)) {
	                        if (ed.contains(nstr)) 
	                            return l;
	                        else next.add(nstr);
	                    }
	                }
	                //��ԭ
	                arr[i] = tmp;
	            }
	        }
	        return bfs(next, ed, dic, l + 1);
	    }
	}
	
	
}
