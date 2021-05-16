class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int remainder=0;
        
        int max = m > n? m: n;
        int min=m;
        if(max==m) {min=n;}
        
        //유클리드 호제법-최대공약수
        while(max%min!=0) {
        	remainder=max%min;
        	max=min;
        	min=remainder;
        	
        }
        answer[0]=min;
        
        answer[1]=n*m/min;
        

        
        return answer;
    }
}
