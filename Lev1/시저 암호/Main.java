class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char cha = ' ';
       
        
        //문자열을 배열로 변환
        for(int i=0; i<s.length();i++) {
        	cha = s.charAt(i);       	
        	
        	if(isBlank(cha)) {
        		answer += " ";
        	}else {
        		answer += caesar(cha, n);
        	}
        	
        }
        return answer;
    }
    
    
    public char caesar(char c, int n) {
    	String lowerCases = "abcdefghijklmnopqrstuvwxyz";
    	String upperCases = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    	int whereResult; 
    	char result;

    	
    	
    	if(where(c)<26) { //소문자
    		whereResult = (where(c)+n)%26;
    		result = lowerCases.charAt(whereResult);
    		
    	}else {
    		whereResult = (where(c)+n-26)%26;
    		result = upperCases.charAt(whereResult);
    	}
    	
    	return result;
    	
    }
    
    public boolean isLowerCase(char c) {
    	boolean result = false;
    	String regExpLowerCaseOnly = "^[a-z]$";
    	
    	if(Character.toString(c).matches(regExpLowerCaseOnly)) {
    		result = true;
    	}
    	
    	return result;
    }
    
    public boolean isBlank(char c) {
    	boolean result = false;
    	if(c==' ') {
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
