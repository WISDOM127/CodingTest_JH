import java.util.Scanner;

//문자열 붙여서 출력하기
public class basic11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.append(a).append(b));
       
    }
}

