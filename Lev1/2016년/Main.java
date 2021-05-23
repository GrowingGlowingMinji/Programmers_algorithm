class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int days=0;
        //2월만 29일
        //1,3,5,7,8,10,12월 31일
        //나머지 30일
        
        //a전달까지 날짜 수 계산
        int i=a-1;
        while(i!=0) {
          if(i<8) {
        	if(i%2==0) { //2,4,6
        		if(i==2) {
        			days+=29;
        		}else {
        			days+=30;
        		}
        		
        	}else {//1,3,5,7
        		days+=31;
        	}
        }else {
        	if(i%2==0) { //8,10,12
        		days+=31;
        	}else { 
        		days+=30;
        	}
        }
   
        	i--;
        }
        
        //days+b일
        days+=b;
        
        //days를 7로 나눠 나머지로 요일 계산
        	//나머지가 1=> 금, 2=> 토 .....
        if(days%7==1) {
        	answer="FRI";
        }else if(days%7==2) {
        	answer="SAT";
        }else if(days%7==3) {
        	answer="SUN";
        }else if(days%7==4) {
        	answer="MON";
        }else if(days%7==5) {
        	answer="TUE";
        }else if(days%7==6) {
        	answer="WED";
        }else if(days%7==0) {
        	answer="THU";
        }
     
        
        return answer;
    }
}
