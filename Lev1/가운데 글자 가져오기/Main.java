class Solution {
    public String solution(String s) {
        String answer = "";
        String[] array_answer = s.split("");
        int i=0;
        
        if(s.length()%2==0) { //짝수
        	i=s.length()/2;
        	answer=array_answer[i-1]+array_answer[i];
        	
        }else {//홀수
        	i=s.length()/2;
        	answer=array_answer[i];
        }
        
        return answer;
    }
}
