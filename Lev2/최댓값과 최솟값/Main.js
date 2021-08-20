function solution(s) {
    const  arr = s.split(" ");
	const answer = minmax(arr).min + " "+ minmax(arr).max;
    return answer;
}

function minmax(arr){
	var max = arr[0]*1;
	var min = arr[0]*1;
	
	for(var i =1; i< arr.length; i++){
		if(min>arr[i]*1){
			min = arr[i]
		}
		if(max < arr[i]*1){
			max = arr[i]
		}	
		
	}
	
	return {min, max};
}
