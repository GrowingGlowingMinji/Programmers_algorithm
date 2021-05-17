class Solution {
    public String solution(String s) {
        String answer = "";
        //zero length string 포함
        String[] words=s.split(" ", -1);
        String str="";
        
        for(int i=0; i<words.length; i++) {
        	for(int j=0; j<words[i].length(); j++) {
        		if((j+1)%2!=0) {//index 짝수=> 대문자
        			str+=Character.toUpperCase(words[i].charAt(j));
        		}else {//index 홀수=> 소문자
        			str+=Character.toLowerCase(words[i].charAt(j));
        		}
        	}
        	
        	
        	words[i]=str;
        	str= "";
        }
        
        //배열 => 문자열
        for(int i=0; i<words.length; i++) {
        	if(i!=0) {
        		answer += " ";
        	}
        	answer += words[i];
        	
        }
        
        
        
        
        return answer;
    }
}
