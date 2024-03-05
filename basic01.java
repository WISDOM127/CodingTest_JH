import java.util.Scanner;

public class basic01 {
    //홀짝
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean natural = false;
        if(n>0) natural = true; 
        
        if(natural){
            System.out.print(n + " is "+(n % 2 == 0 ? "even" : "odd"));
        }else{
            System.out.println("자연수를 입력해주세요");
        }
        
    }
}