
//문자열 my_string의 앞의 n글자로 이루어진 문자열을 return 하는 solution 함수를 작성해 주세요.
class Solution {
    public String solution(String my_string, int n) {
        String answer = my_string.substring(0,n); 
        return answer;
    }
}

/*
 * substring() 문자열 자르기 함수
 * 문자열.substring(0,n) : 문자열의 첫글자 ~ n번째 글자까지 자름
 * 문자열.substring(3) : 3번째 글자부터 끝까지
 * 
 * length() 문자열 길이 함수
 * indexOf("a") 문자열 중 "a"의 index 값 함수
 * 
 * 예시 String str = "03/07"
 * str.length() => 5
 * str.indexOf("/") => 2
 */
