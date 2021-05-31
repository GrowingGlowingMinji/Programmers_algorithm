function solution(lottos, win_nums) {
    var answer = [];
	var cnt=0;
	var lottos2=[];
	var nums=0;
	
	// lottos와 win_nums를 오름차순으로 정렬
	lottos.sort();
	win_nums.sort();
	
	//lottos에서 0의 개수 세기 & 0을 제외한 lotto를 새로운 배열 lottos2에 담기.
	for(var i in lottos){
		if(lottos[i]==0){
			cnt++;
		}else{
			lottos2.push(lottos[i]);
		}
		
	}
	
	//lottos2와 win_nums와 비교해 중복된 수가 몇개인지 세기(nums)
	for(var i in lottos2){
		for(var j in win_nums){
			if(lottos2[i]==win_nums[j]){
				nums++;
				win_nums.splice(j,1); //win_nums[j]를 삭제.
				break; //중복 수가 없기 때문에 j에 대한 for문 break.
			}
			
		}
		
	}
	
	
	//개수로 등수 반환. 최고 개수: nums+cnt & 최저 개수: nums
	var max=0;
	var min=0;

	
		if(nums+cnt==0 || nums+cnt==1){
		max=6;
	}else {
		max=7-nums-cnt;
	}
	
	if(nums==0 || nums==1){
		min=6;
	}else{
		min=7-nums;
	}
	

	
	answer.push(max);
	answer.push(min);


    return answer;
}
