
//대소문자 변환 (대->소 && 소->대)
import java.util.Scanner;

public class basic09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if(Character.isUpperCase(c)){
                answer += Character.toLowerCase(c);
            }else{
                answer += Character.toUpperCase(c);
            }
        }
        System.out.println(answer);
    }
}

/*
 * Character.isUpperCase(); 괄호안에 들어간 문자가 대문자이면 true, 소문자이면 false 반환
 * str.charAt(index)
 * str 문자열에서 index 번째 문자를 char 타입으로 받음
 */