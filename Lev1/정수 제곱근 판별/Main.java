class Solution {
    public long solution(long n) {
        long answer = 0;
        double result = Math.sqrt(n);
        
        if(result-(int) result==0) { //제곱근이 정수 즉, 자연수인 제곱근 존재.
        	answer=(long) Math.pow((int) result+1, 2);
        }else {
        	answer=-1;
        }
        
        
        
        return answer;
    }
}
