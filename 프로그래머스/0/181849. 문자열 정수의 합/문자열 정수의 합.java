class Solution {
    public int solution(String num_str) {
        int answer = 0;
        int cnt = num_str.length();
        
        for (int i = 0; i < cnt; i++) {
            System.out.println(num_str.charAt(i));
            //Character.getNumericValue(num_str.charAt(i))
            answer += num_str.charAt(i)-'0';
      
        }

        return answer;
    }
}