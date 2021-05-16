//1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
//2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
//3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...


class Solution {
    public int[] solution(int[] answers) {
        int pass1=0;
        int pass2=0;
        int pass3=0;
       
        
        //수포자 3명 답 알고리즘 && 점수 비교
        for(int i=0;i<answers.length;i++) {
        	//수포자1
        	if(i%5==0) {
        		if(answers[i]==1) {
        			pass1++;
        		}        		
        	}else if(i%5==1) {
        		if(answers[i]==2) {
        			pass1++;
        		}
        	}else if(i%5==2) {
        		if(answers[i]==3) {
        			pass1++;
        		}
        	}else if(i%5==3) {
        		if(answers[i]==4) {
        			pass1++;
        		}
        	}else if(i%5==4) {
        		if(answers[i]==5) {
        			pass1++;
        		}
        	}
        	
        	//수포자2
        	if(i%2==1) {
        		if((i/2)%4==0) {
        			if(answers[i]==1) {
            			pass2++;
            		}
        		}else if((i/2)%4==1) {
        			if(answers[i]==3) {
            			pass2++;
            		}        		
        		}else if((i/2)%4==2) {
        			if(answers[i]==4) {
            			pass2++;
            		} 
        		}else if((i/2)%4==3) {
        			if(answers[i]==5) {
            			pass2++;
            		} 
        		}
        		
        	}else if(i%2==0) {
        		if(answers[i]==2) {
        			pass2++;
        		} 
        	}
        	
        			
        	//수포자3
        	if((i%10)/2==0) {
        		if(answers[i]==3) {
        			pass3++;
        		} 
        	}else if((i%10)/2==1) {
        		if(answers[i]==1) {
        			pass3++;
        		} 
        	}else if((i%10)/2==2) {
        		if(answers[i]==2) {
        			pass3++;
        		} 
        	}else if((i%10)/2==3) {
        		if(answers[i]==4) {
        			pass3++;
        		} 
        	}else if((i%10)/2==4) {
        		if(answers[i]==5) {
        			pass3++;
        		} 
        	}
        	
        
        	
        }
        int[] answer = null;
       
        //return 값 하나일 때
       
        if(pass1!=pass2 &&pass1!=pass3&&pass2!=pass3) {

        	 answer= new int[1];
        	 answer[0]=1;
        	if(pass1<pass2) {
        		answer[0]=2;
        	}else if(pass2<pass3) {
        		answer[0]=3;
        	}
        	
        
        }else if(pass1==pass2 &&pass1==pass3&&pass2==pass3) {//return값 3개
        	answer= new int[3];
        	answer[0]= 1;
        	answer[1]=2;
        	answer[2]=3;
       
        }else if(pass1==pass2 &&pass1!=pass3) {
        	if(pass1<pass3) {
        		answer= new int[1];
        		answer[0]= 3;
        		
        	}else {
        		answer= new int[2];
        		answer[0] =1;
        		answer[1]=2;
        	}
        }else if(pass1==pass3 &&pass1!=pass2) {
        	if(pass1<pass2) {
        		answer= new int[1];
        		answer[0]=2;
        		
        	}else {
        		answer= new int[2];
        		answer[0] =1;
        		answer[1]=3;
        	}
        }else if(pass2==pass3 &&pass2!=pass1) {
        	if(pass2<pass1) {
        		answer= new int[1];
        		answer[0]=1;
        		
        	}else {
        		answer= new int[2];
        		answer[0] =2;
        		answer[1]=3;
        	}
        }
        
        
        
		return answer;
    }
}
