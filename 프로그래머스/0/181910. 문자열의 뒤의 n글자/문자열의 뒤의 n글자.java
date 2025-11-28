class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int length = my_string.length();
        StringBuilder sb = new StringBuilder();
        for(int i = length-n; i<my_string.length(); i++){
            sb.append(my_string.charAt(i));
        }
        
        return sb.toString();
    }
}