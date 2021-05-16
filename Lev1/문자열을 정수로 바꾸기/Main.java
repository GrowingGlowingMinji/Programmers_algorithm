class Solution {
    public int solution(String s) {
        int answer = 0;

        String[] sArr = s.split("");
        if(sArr[0]=="-") {
        	s.replace("-", "");
        	answer=Integer.parseInt(s)*-1;
        }else if(sArr[0]=="+") {
        	s.replace("+", "");
        	answer=Integer.parseInt(s);
        	
        }else {
        	answer=Integer.parseInt(s);
        }
        
    
        return answer;
    }
}
