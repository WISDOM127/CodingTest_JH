
//문자열 섞기

//길이가 같은 두 문자열 str1과 str2, 두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 한 번씩 등장하는 문자열 return 
public class basic23 {    
    
    public String solution(String str1, String str2) {

        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();
        String answer = "";

        for (int i = 0; i < char2.length; i++) {
            answer += char1[i];
            answer += char2[i];
        }
        
        return answer;
    }
}

   



