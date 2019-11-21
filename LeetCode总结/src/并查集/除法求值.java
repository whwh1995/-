package ���鼯;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ������ֵ {
	/*�ⷨһ��DFS + Adjacent list

	O(equation + equation* queries )   �ȱ�����������equation + ����ÿһ��query�����ܱ���������

	 

	1. �ȱ�����������еĹ�ʽ������adjacent list. - �õ�String���ܵ���һ��String

	����

	A - >(B, value), (C, value)
	C - >(D,value)

	2. ����DFS - ��A/D�� ��A��ʼ����������ȥѰ���Ƿ��ܵ���D��A->C->D
	*/
	 public double[] calcEquation(String[][] equations, double[] values, String[][] queries) {

	      //make adjacent list 
	      // A-> (B, 2.0) (C, 3.0)
	      Map<String, Map<String, Double>> map = new HashMap<>();
	      for(int i = 0 ; i < equations.length; ++i){
	        Map<String, Double> current = map.computeIfAbsent(equations[i][0], k -> new HashMap());
	        current.put(equations[i][1], values[i]);
	        current = map.computeIfAbsent(equations[i][1], k -> new HashMap());
	        current.put(equations[i][0], 1 / values[i]);
	      }
	      
	      //populate the result
	      double[] result = new double[queries.length];
	      for(int i = 0 ; i < queries.length; ++i){
	        result[i] = dfs(queries[i][0], queries[i][1], map, new HashSet<String>());
	      }
	      return result;
	    }
	  
	 private double dfs(String numerator, String denominator, Map<String, Map<String, Double>> map,HashSet<String> visited){
	      if(visited.contains(numerator)) 
	    	  return -1;
	      visited.add(numerator);
	      Map<String, Double> adj = map.get(numerator);
	      if(adj == null) 
	    	  return -1;
	      if(adj.containsKey(denominator)){
	          return adj.get(denominator);
	      }
	      for(String next: adj.keySet()){
	        double ans = dfs(next, denominator, map, visited);
	        if(ans != -1){
	          return adj.get(next) * ans;
	        }
	      }
	      return -1;
	    }      


/*�ⷨ2��UNION FIND

O(equation + queries)   �ȱ�����������equation�γɲ��鼯 + ����ÿһ��query����O(1)�Ĳ���

ͨ�������˼�����̣����Ƿ������dfs������ͨ��˵������String��ͬһ��set���档 �뵽�����ò��鼯������
���԰�ÿһ�Ե�String֮ǰ�Ĺ�ϵ(value)��ת�������Ǻ͹�ͬ���׵Ĺ�ϵ�� 
�������String�й�ͬ��father�� ˵�����д𰸵ġ�ȡ�����Ǻ������ͬ���׵Ĺ�ϵ���õ�����֮��Ĺ�ϵ*/

//���常�ڵ�
private class Father{
  String name;
  double value;
  public Father(String name, double value){
    this.name = name;
    this.value = value;
  }
}

//�ϲ������ڵ㣬ָ��ͬһ�����ڵ�
private void union(String numer, String deno, Map<String, Father> uf, double value){
  Father f_nume = find(numer,uf);
  Father f_deno = find(deno,uf);
  
  if(!f_nume.name.equals(f_deno.name)){
    uf.put(f_deno.name, new Father(f_nume.name, f_nume.value * value *(1/f_deno.value)));
  }
}

//�ҵ���ǰtarget�ĸ��ڵ㡣;����·��ѹ�� 
private Father find(String target, Map<String, Father> uf){
  Father current_father = uf.get(target);
  
  if(!current_father.name.equals(target)){
    Father final_father = find(current_father.name, uf);
    uf.put(target, new Father(final_father.name, current_father.value * final_father.value));
  }
  return uf.get(target);
}


public double[] calcEquation1(String[][] equations, double[] values, String[][] queries) {

	  Map<String, Father> unionFind = new HashMap<>();
	  for(int i = 0 ; i< equations.length; ++i){
	    unionFind.putIfAbsent(equations[i][0], new Father(equations[i][0], 1.0));
	    unionFind.putIfAbsent(equations[i][1], new Father(equations[i][1], 1.0));
	    union(equations[i][0], equations[i][1], unionFind, values[i]);
	  }
  
  // find result
	  double[] result = new double[queries.length];
	  for(int i = 0 ; i < queries.length; ++i){
	    if(!unionFind.containsKey(queries[i][0]) || !unionFind.containsKey(queries[i][1])){ 
	      result[i] = -1;
	      continue;
	    }
	    Father nume = find(queries[i][0],unionFind);
	    Father deno = find(queries[i][1],unionFind);
	    if(!nume.name.equals(deno.name)){ //���������û��һ���ĸ��׽ڵ㣬˵��û�й�ϵ����һ��union����
	      result[i] = -1;
	      continue;
	    }
	    result[i] = (1.0 / nume.value) * deno.value;
	    
	  }
	  return result;
}
}
