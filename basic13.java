
import java.util.Scanner;

//문자 리스트를 문자열로 변환하기
public class basic13 {
    public String solution(String[] arr) {

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            answer.append(arr[i]);
        }

        return answer.toString();
    }
}

