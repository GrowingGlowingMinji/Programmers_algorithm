class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int sum =0;
        int divide=0;
        
        
        for(int i=0; i<nums.length-2; i++) {
        	for(int j=i+1; j<nums.length-1; j++) {
        		for(int k=j+1; k<nums.length; k++) {
        			divide=0; //소수 판별기 초기화
        			sum=nums[i]+nums[j]+nums[k];
        			
        			for(int l=2; l<sum; l++) {
        				if(sum%l==0) {
        					divide++;
        					break;
        				}
        			}
        			
        			if(divide==0) {
        				answer++;
        			}
        		}
        		
        		
        	}
        }
        

        return answer;
    }
}
