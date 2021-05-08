class Solution {
    public int solution(long num) {
        int answer = 0;
        int cnt =0;
        
        while(num!=1) {
        	if(num%2==0) {
        		num/=2;
        	}else {
        		num*=3;
        		num+=1;
        	}
        	
        	cnt++; 
        	
        	if(cnt==500) {
        		answer = -1;
                return answer;
        	}
        	
        }
        
        answer=cnt;
    		

        
        
        return answer;
    }
}
