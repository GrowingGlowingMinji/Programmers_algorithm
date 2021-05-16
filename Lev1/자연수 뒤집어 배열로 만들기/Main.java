class Solution {
    public int[] solution(long n) {
       
        
        String str=Long.toString(n);
        int[] answer = new int[str.length()];
        String[] ans = str.split("");
        for(int i=0; i<str.length();i++) {
        	answer[i]=Integer.parseInt(ans[str.length()-1-i]);
        }
        
        
        
        
        
        return answer;
    }
}
