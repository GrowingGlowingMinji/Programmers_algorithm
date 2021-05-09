class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String star="*";
        
        
        answer= new String(new char[phone_number.length()-4]).replace("\0", star);
        answer+=phone_number.substring(phone_number.length()-4, phone_number.length());

        return answer;
    }
}
