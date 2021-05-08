class Solution {
    public int solution(int[] nums) {
        int answer = 0;        
        int leng=nums.length;
        int cnt=0; //새로운 분류인지 판단
        int i=1;
      
        while(i<leng){  
            cnt=0;
        	  for(int j=0; j<i; j++) {                
        		   if(nums[i]==nums[j]) {                    
                  for(int m=i; m<leng-1; m++)
                    nums[m]=nums[m+1];
                    leng--;
                    cnt++; 
        		      }            
              }
            if(cnt==0) {
                i++;
            }
        }
      
        
        if(leng<nums.length/2) {
        	answer=leng;
        }else {
        	answer=nums.length/2;
        }
        

        return answer;
    }
}
