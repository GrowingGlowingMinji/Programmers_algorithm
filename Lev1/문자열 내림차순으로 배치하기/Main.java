class Solution {
    public String solution(String s) {
        String answer = "";
        int[] ans = new int[s.length()];
        
        for(int i=0; i<s.length(); i++) {
        	ans[i] = where(s.charAt(i));
        }
        
        
        int a =25;
        while(a>=0) {
        	for(int i=0; i<s.length(); i++) {
	        	if(ans[i]==a){
	        		answer += s.charAt(i);
	        		
	        	}
	        }
        	a--;
        	
        }
        a =52;
        while(a>=26) {
        	for(int i=0; i<s.length(); i++) {
	        	if(ans[i]==a){
	        		answer += s.charAt(i);
	        		
	        	}
	        }
        	a--;
        	
        }
	        

        
        
        
        return answer;
    }
    
    
    public boolean isLowerCase(char c) {
    	boolean result = false;
    	String regExpLowerCaseOnly = "^[a-z]$";
    	
    	if(Character.toString(c).matches(regExpLowerCaseOnly)) {
    		result = true;
    	}
    	
    	return result;
    }
    
    //문자 c가 몇번째인지
    public int where(char c) {
    	int result = 0;
    	
    	if(isLowerCase(c)) {
    		result = c-'a';
    	}else {
    		result = c-'A'+26;
    	}
    	
    	return result;
    }
}
