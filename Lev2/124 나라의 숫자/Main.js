function solution(n) {
    var answer = '';
	var sum=0;
	var cnt=0; //자리수
	var sqt=1;
	var share=0; 

	while(n-sum>0){
		
		//10^cnt의 자리수
		share=(n-sum-1)/sqt;
		share=parseInt(share);
		
		if(share%3==0){
			answer=1+answer;
		}else if(share%3==1){
			answer=2+answer;
		}else if(share%3==2){
			answer =4+answer;
		}
		
		cnt++;
		sqt=Math.pow(3, cnt);
		sum+=sqt;
		
	}
	
	
	
	
    return answer;
}
