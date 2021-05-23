import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;
       String str="";
        
        String[] ans=String.valueOf(n).split("");
        
        Arrays.sort(ans, Collections.reverseOrder());
      
        for(int i=0; i<String.valueOf(n).length(); i++) {
        	str+=ans[i];
        }
        
        answer=Long.parseLong(str);
        

        
        
        return answer;
    }
}
