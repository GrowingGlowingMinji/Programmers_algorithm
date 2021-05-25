import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
    	 int[] answer = {};
    	 List<Integer> ans = new ArrayList<Integer>();
    	 
    	 int n=0;
    	 int i=0;
    	 while(i<arr.length) {
    		 while(i+n+1<arr.length) {//반복 수 체크: n개의 수가 연속 반복.
    			 if(arr[i]==arr[i+n+1]) {
        			 n++;
        			 
        		 }else {
        			
        			 break;
        		 }
    		 }
    		
    		 ans.add(arr[i]);
    		 
    		 i+=n+1;
    		 n=0;
    	 }
    	 

    	 //List=>array
    	 i=0;
    	 answer=new int[ans.size()];
    	 for(int num:ans) {
    		 answer[i++]=num;
    	 }

        return answer;
    }
}
