import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        char[] arr1 = new char[strings.length];
        int[] arr2 = new int[strings.length];
        String str = "";
        String[] arr3 = {};

        
        
        for(int i =0; i<strings.length; i++) {
        	arr1[i] = what(strings[i], n);
        }
        
        arr2 = sort(arr1);
        
        int cnt =0 ;
        int num = 0;
        
        for(int i=0; i<26; i++ ) {
        	cnt=0;
        	str = "";
        	
        	for(int j=0; j< strings.length; j++) {
        		if(arr2[j]==i) {
        			cnt++;
        			str+=strings[j]+"-";
        		}
        	}
            
        	arr3 = str.split("-");
        	Arrays.sort(arr3);
        	for(int w=0; w<arr3.length; w++) {
                if(arr3[w]!=""){
                   answer[num++] = arr3[w];
                }

        		
        	}
   
        }
       
        return answer;
    }
    
    
    int[] sort(char[] arr) {
    	int[] result = new int[arr.length];
    	
    	for(int i=0; i< arr.length; i++) {
    		result[i] = where(arr[i]);
    	}
    	
    	return result;
    }
    
    int where(char c) {
    	int result = c - 'a';
    	return result;
    }
    
    char what(String s, int n) {
    	char result = s.charAt(n);    	
    	return result;
    }
}
