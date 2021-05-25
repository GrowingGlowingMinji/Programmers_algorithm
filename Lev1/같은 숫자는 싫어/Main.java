import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
    	 int[] answer = {};
    	 List<Integer> list = new ArrayList<Integer>();
    	 
    	 //array=>List
    	 for(int num: arr) {
    		 list.add(num);
    	 }
    	 
    	 //값 비교, 중복값 제거
    	 int i=0;
    	 while(i<list.size()-1) {
    		 if(list.get(i)==list.get(i+1)) {
				 list.remove(i+1);
				 
			 }else {
				 i++;
			 }
    	 }
    	 
    	 //List=>array
    	 i=0;
         answer=new int[list.size()];
    	 for(int num:list) {
    		 answer[i++]=num;
    	 }
    	 
    	 



        return answer;
    }
}
