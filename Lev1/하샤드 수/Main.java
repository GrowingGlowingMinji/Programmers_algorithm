class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int num =0;
        int testNum=x;
        for(int i=4; i>=0; i--){ 
            if(testNum/(int)Math.pow(10, i)!=0){
                 num += testNum/(int)Math.pow(10, i);
                testNum=testNum%(int)Math.pow(10, i);
            }
                 
            
        }
        
        if(x%num==0){answer=true;}else{answer=false;}
        
        
        
        return answer;
    }
}
