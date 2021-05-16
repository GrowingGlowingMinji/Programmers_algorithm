class Solution {
    public String solution(int num) {
        String answer = "";
        if(num%2==0) {//짝수
        	answer="Even";
        }else { //홀수
        	answer="Odd";
        }
        return answer;
    }
}
