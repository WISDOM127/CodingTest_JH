
//문자열 반복해서 출력하기
import java.util.Scanner;

public class basic10 {
    // *StringBuilder 이용해보기
    //Stirng은 변경 불가능한 문자열을 생성하지만 StringBuilder는 변경 가능한 문자열을 만들어 주기 때문에, String을 합치는 작업 시 하나의 대안이 될 수 있다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        StringBuilder stringBuilder = new StringBuilder(); 

        for (int i = 0; i < n; i++) {
            stringBuilder.append(str);
        }
        System.out.println(stringBuilder);
    }


//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.next();
//         int n = sc.nextInt();

//         for (int i = 0; i < n; i++) {
//             System.out.print(str);
//         }
//     }
}