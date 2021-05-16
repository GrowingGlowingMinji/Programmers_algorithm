class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if(s.length()==4 || s.length()==6) {
        	if(s.matches(".*[A-z].*")) {//문자열이 하나라도 들어감. \w: 알파벳이나 문자
        		answer=false;
        	}else {
        		answer=true;
        	}
        }else {
        	
        	answer=false;
        }
        
        
        
        
        return answer;
    }
}
