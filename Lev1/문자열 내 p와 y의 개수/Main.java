class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        String[] array_s = s.split("");
        
        int pCount =0;
        int yCount =0;
        
        for(int i =0; i<array_s.length; i++ ){
            if(array_s[i].equals("Y") || array_s[i].equals("y")){
                yCount++;
            }
            if(array_s[i].equals("P") || array_s[i].equals("p")){
                pCount++;
            }
            
        }
        
        if(pCount==yCount){
            answer=true;
        }else{
            answer=false;
        }
   

        return answer;
    }
}
