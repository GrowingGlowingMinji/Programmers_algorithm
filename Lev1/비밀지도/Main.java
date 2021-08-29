class Solution {
    static public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i=0; i<n; i++) {
            //10진수 -> 2진수 String
            String temp = Integer.toBinaryString(arr1[i] | arr2[i]);
            //5자리의 문자열 형태로 포맷변경, 5자리가 안되는 이진수의 나머지는 공백으로 채운다.
            temp = String.format("%" + n + "s", temp);
             // 1->#, 0 -> 공백 으로 바꾼다.
            temp = temp.replaceAll("1", "#");
            temp = temp.replaceAll("0", " ");
             // 한 줄 완성.
            answer[i] = temp;
        }

        return answer;
    }
}
