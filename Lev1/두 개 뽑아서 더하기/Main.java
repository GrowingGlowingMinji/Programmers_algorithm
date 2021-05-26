import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
       
        HashSet<Integer> arr1 = new HashSet<Integer>();
        HashSet<Integer> arr2 = new HashSet<Integer>();
        
        int n=0;
        int a=0;
        //매개변수 numbers array를 HashSet으로 중복제거
        for(int i: numbers){  	
        	arr1.add(i);
        	a++;
        	//중복 값은 따로 더해 최종 arr2 HashSet에 add
            if(arr1.size()!=a-n) {
            	arr2.add(i+i);
            	n++;
            }
            
        }
        
        //HashSet은 인덱스로 검색이 불가하므로 array로 변경
        answer=new int[arr1.size()];
        n=0;
        for(int i: arr1) {
        	answer[n++]=i;
        }       
        		
        
        //각 수를 더해 새로운 HashSet에 담기(중복제거)
        for(int i=0; i<answer.length; i++){
            for(int j=i+1; j<answer.length; j++){
            	arr2.add(answer[i]+answer[j]);
            }
            
        }

        //HashSet => Array
        answer = new int[arr2.size()];
        n=0;
        for(int i: arr2){
            answer[n++]=i;
        }

        //Array 정렬
        Arrays.sort(answer);




        return answer;
    }
}
