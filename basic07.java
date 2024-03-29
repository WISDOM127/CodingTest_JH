
//문자열 rny_string의 모든 'm'을 "rn"으로 바꾼 문자열을 return 하는 solution 함수
class Solution {
    public String solution(String rny_string) {
        String answer = rny_string.replace("m", "rn")
        return answer;
    }
}

/*
 * 문자열 치환 함수
 * 
 * replace("기존문자","바꿀문자") 
 * 
 * replaceAll("정규식","바꿀문자")
 * str.replaceAll(".", "0") => . 정규식 표현으로 인해 str이 가진 모든 문자열이 0 으로 바뀜
 * 
 * replaceFirst("기존문자","바꿀문자")
 * 첫번째 것 만 바뀜
 */
