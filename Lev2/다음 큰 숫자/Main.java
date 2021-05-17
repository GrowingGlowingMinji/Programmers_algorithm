class Solution {
    public int solution(int n) {
        int answer = 0;
        String str ="";
        int cnt =0;
        
        //이진수로 변환
        str = Integer.toBinaryString(n);
        
        for(int i=0;i<str.length(); i++) {
        	if(str.charAt(i)=='1') {
        		cnt++;
        	}
        }
        
        answer=n;
        while(true) {
        	answer++;
        	if(Integer.bitCount(answer)==cnt) {
        		return answer;
        	}
        	
        }
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
       
        answer=n;
        while(true) {
        	answer++;
        	if(Integer.bitCount(answer)==Integer.bitCount(n)) {
        		return answer;
        	}
        	
        }
    }
}


